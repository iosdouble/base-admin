package com.nh.activiti.controller;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * com.nh.activiti.controller
 * create by admin nihui
 * create time 2020/12/9
 * version 1.0
 **/
@RestController
@RequestMapping("/lowyer")
public class LowyerController {

    //提供一系列管理流程部署和流程定义的API。
    @Autowired
    private RepositoryService repositoryService;

    //在流程运行时对流程实例进行管理与控制
    @Autowired
    private RuntimeService runtimeService;


    //对流程任务进行管理，例如任务提醒、任务完成和创建任务等。
    @Autowired
    private TaskService taskService;

    // 项目启动的时候就进行内容的加载
    @PostConstruct
    public void init(){
        System.out.println("项目创建");
        //创建一个部署对象
        Deployment deployment = repositoryService.createDeployment()
                .name("Lowyer")
                .key("Lowyer")
                .category("Lowyer")
                .addClasspathResource("processes/Lowyer.bpmn")
                .tenantId("Lowyer")
                .deploy();
    }

    /**启动流程实例分配任务给个人*/
    @GetMapping("/task")
    public String task(@RequestParam(value ="content") String content) {
        //每一个流程有对应的一个key这个是某一个流程内固定的写在bpmn内的
        String processDefinitionKey ="Lowyer";
        HashMap<String, Object> variables=new HashMap<>();
        variables.put("initData", content);
        ProcessInstance instance = runtimeService.startProcessInstanceByKey(processDefinitionKey,variables);
        return "提交成功";
    }


    /**查询当前人的个人任务*/
    @GetMapping("/findTask")
    public List<Map<String,Object>> findTask(@RequestParam(value = "user") String user){
        List<Map<String,Object>> taskIdList = new ArrayList<>();

        String assignee = user;
        List<Task> list = taskService.createTaskQuery()//创建任务查询对象
                .taskAssignee(assignee)//指定个人任务查询
                .list();
        if(list!=null && list.size()>0){
            for(Task task:list){
                Map<String,Object> item = new HashMap<>();
                item.put("id",task.getId());
                String  initData = (String) runtimeService.getVariable(task.getExecutionId(), "initData");
                item.put("data",initData);
                taskIdList.add(item);
            }
        }
        return taskIdList;
    }

    /**
     * 完成任务
     */
    @GetMapping("/completeTask")
    public void completeTask(@RequestParam(value = "taskId") String taskId){
        HashMap<String, Object> variables=new HashMap<>();
        variables.put("days", 5);//userKey在上文的流程变量中指定了
        taskService.complete(taskId,variables);
        System.out.println("完成任务：任务ID："+taskId);

    }
}
