package com.nh.activiti.controller;

import org.activiti.engine.*;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * com.zk.activiti.controller
 * create by admin nihui
 * create time 2020/10/31
 * version 1.0
 **/
@RestController
@RequestMapping("/flow")
public class TestController {

    //提供一系列管理流程部署和流程定义的API。
    @Autowired
    private RepositoryService repositoryService;

    //在流程运行时对流程实例进行管理与控制
    @Autowired
    private RuntimeService runtimeService;

    //对流程任务进行管理，例如任务提醒、任务完成和创建任务等。
    @Autowired
    private TaskService taskService;

    //提供对流程引擎进行管理和维护的服务。
    @Autowired
    private ManagementService managementService;

    //对流程的历史数据进行操作，包括查询、删除这些历史数据。
    @Autowired
    private HistoryService historyService;

    @Autowired
    private ProcessEngine processEngine;


    @GetMapping("/start")
    public String start(){
        //创建一个部署对象
        Deployment deployment = repositoryService.createDeployment()
                .name("高级测试流程")
                .key("high")
                .category("test")
                .addClasspathResource("processes/High.bpmn")
                .tenantId("tenantId")
                .deploy();
        return "OK";
    }

    /**启动流程实例分配任务给个人*/
    @GetMapping("/task")
    public String task() {
        //脑补一下这个是从前台传过来的数据
        String jsonData="测试初始化数据内容";
        //每一个流程有对应的一个key这个是某一个流程内固定的写在bpmn内的
        String processDefinitionKey ="high";
        HashMap<String, Object> variables=new HashMap<>();
        variables.put("initData", jsonData);
        ProcessInstance instance = runtimeService.startProcessInstanceByKey(processDefinitionKey,variables);
        return "提交成功";
    }

    /**查询当前人的个人任务*/
    @GetMapping("/findTask")
    public void findTask(){
        Map<String,Object> result = new HashMap<>();
        String assignee = "ghgs";
        List<Task> list = taskService.createTaskQuery()//创建任务查询对象
                .taskAssignee(assignee)//指定个人任务查询
                .list();
        if(list!=null && list.size()>0){
            for(Task task:list){
                System.out.println(task.getId());
                String  initData = (String) runtimeService.getVariable(task.getExecutionId(), "initData");
                System.out.println(initData);
            }
        }
    }

    /**
     * 完成任务
     */
    @GetMapping("/completeTask")
    public void completeTask(){
        //任务ID
        String taskId = "4739c741-39fd-11eb-a494-2cf05d7b6a07";

        HashMap<String, Object> variables=new HashMap<>();
        variables.put("days", 5);//userKey在上文的流程变量中指定了

        taskService.complete(taskId,variables);
        System.out.println("完成任务：任务ID："+taskId);

    }

    /**
     * 拒绝任务
     */
    @GetMapping("/rejectTask")
    public void rejectTask(){
        //任务ID
        String taskId = "bbd113b6-36a4-11eb-93dc-2cf05d7b6a07";

        HashMap<String, Object> variables=new HashMap<>();
        variables.put("days", 1);//userKey在上文的流程变量中指定了


        System.out.println("完成任务：任务ID："+taskId);
    }

    @GetMapping("/findTaskGroup")
    public void findTaskGroup(){

        String assignee = "a";
        List<Task> list = taskService.createTaskQuery()//创建任务查询对象
//                .taskCandidateUser("ZJ")//指定组任务查询
                .taskAssignee(assignee)
                .list();
        String taskid ="";
        String instanceId ="";
        if(list!=null && list.size()>0){
            for(Task task:list){
                System.out.println("任务ID:"+task.getId());
                System.out.println("任务名称:"+task.getName());
                System.out.println("任务的创建时间:"+task.getCreateTime());
                System.out.println("任务的办理人:"+task.getAssignee());
                System.out.println("流程实例ID："+task.getProcessInstanceId());
                System.out.println("执行对象ID:"+task.getExecutionId());
                System.out.println("流程定义ID:"+task.getProcessDefinitionId());
            }
        }
    }

    /**
     * 获取历史办理数据
     */
    @GetMapping("/getHistory")
    public void findHistoryTask(){
        String taskAssignee = "ghgs";
        List<HistoricTaskInstance> list = processEngine.getHistoryService()//与历史数据（历史表）相关的Service
                .createHistoricTaskInstanceQuery()//创建历史任务实例查询
                .taskAssignee(taskAssignee)//指定历史任务的办理人
                .list();
        if(list!=null && list.size()>0){
            for(HistoricTaskInstance hti:list){
                System.out.println(hti.getId()+"    "+hti.getName()+"    "+hti.getProcessInstanceId()+"   "+hti.getStartTime()+"   "+hti.getEndTime()+"   "+hti.getDurationInMillis());
                System.out.println("################################");
            }
        }
    }

}
