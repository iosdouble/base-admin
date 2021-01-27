package com.nh.web.controller.system;

import java.util.List;

import com.nh.common.core.domain.entity.SysDictData;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nh.common.annotation.Log;
import com.nh.common.core.controller.BaseController;
import com.nh.common.core.domain.AjaxResult;
import com.nh.common.enums.BusinessType;
import com.nh.system.service.ISysDictDataService;
import com.nh.common.utils.poi.ExcelUtil;
import com.nh.common.core.page.TableDataInfo;

/**
 * 字典数据Controller
 * 
 * @author zk
 * @date 2021-01-27
 */
@RestController
@RequestMapping("/system/data")
public class SysDictDataController extends BaseController
{
    @Autowired
    private ISysDictDataService sysDictDataService;

    /**
     * 查询字典数据列表
     */
    @PreAuthorize("@ss.hasPermi('system:data:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysDictData sysDictData)
    {
        startPage();
        List<SysDictData> list = sysDictDataService.selectSysDictDataList(sysDictData);
        return getDataTable(list);
    }

    /**
     * 导出字典数据列表
     */
    @PreAuthorize("@ss.hasPermi('system:data:export')")
    @Log(title = "字典数据", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SysDictData sysDictData)
    {
        List<SysDictData> list = sysDictDataService.selectSysDictDataList(sysDictData);
        ExcelUtil<SysDictData> util = new ExcelUtil<SysDictData>(SysDictData.class);
        return util.exportExcel(list, "data");
    }

    /**
     * 获取字典数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:data:query')")
    @GetMapping(value = "/{dictCode}")
    public AjaxResult getInfo(@PathVariable("dictCode") Long dictCode)
    {
        return AjaxResult.success(sysDictDataService.selectSysDictDataById(dictCode));
    }

    /**
     * 获取字典数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:data:detail')")
    @GetMapping(value = "/detail/{dictCode}")
    public AjaxResult getDetail(@PathVariable("dictCode") Long dictCode)
    {
        return AjaxResult.success(sysDictDataService.selectSysDictDataById(dictCode));
    }

    /**
     * 新增字典数据
     */
    @PreAuthorize("@ss.hasPermi('system:data:add')")
    @Log(title = "字典数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysDictData sysDictData)
    {
        return toAjax(sysDictDataService.insertSysDictData(sysDictData));
    }

    /**
     * 修改字典数据
     */
    @PreAuthorize("@ss.hasPermi('system:data:edit')")
    @Log(title = "字典数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysDictData sysDictData)
    {
        return toAjax(sysDictDataService.updateSysDictData(sysDictData));
    }

    /**
     * 删除字典数据
     */
    @PreAuthorize("@ss.hasPermi('system:data:remove')")
    @Log(title = "字典数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{dictCodes}")
    public AjaxResult remove(@PathVariable Long[] dictCodes)
    {
        return toAjax(sysDictDataService.deleteSysDictDataByIds(dictCodes));
    }
}
