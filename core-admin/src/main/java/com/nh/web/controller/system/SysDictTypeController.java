package com.nh.web.controller.system;

import java.util.List;

import com.nh.common.core.domain.entity.SysDictType;
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

import com.nh.system.service.ISysDictTypeService;
import com.nh.common.utils.poi.ExcelUtil;
import com.nh.common.core.page.TableDataInfo;

/**
 * 字典类型Controller
 * 
 * @author zk
 * @date 2021-01-27
 */
@RestController
@RequestMapping("/system/type")
public class SysDictTypeController extends BaseController
{
    @Autowired
    private ISysDictTypeService sysDictTypeService;

    /**
     * 查询字典类型列表
     */
    @PreAuthorize("@ss.hasPermi('system:type:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysDictType sysDictType)
    {
        startPage();
        List<SysDictType> list = sysDictTypeService.selectSysDictTypeList(sysDictType);
        return getDataTable(list);
    }

    /**
     * 导出字典类型列表
     */
    @PreAuthorize("@ss.hasPermi('system:type:export')")
    @Log(title = "字典类型", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SysDictType sysDictType)
    {
        List<SysDictType> list = sysDictTypeService.selectSysDictTypeList(sysDictType);
        ExcelUtil<SysDictType> util = new ExcelUtil<SysDictType>(SysDictType.class);
        return util.exportExcel(list, "type");
    }

    /**
     * 获取字典类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:type:query')")
    @GetMapping(value = "/{dictId}")
    public AjaxResult getInfo(@PathVariable("dictId") Long dictId)
    {
        return AjaxResult.success(sysDictTypeService.selectSysDictTypeById(dictId));
    }

    /**
     * 获取字典类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:type:detail')")
    @GetMapping(value = "/detail/{dictId}")
    public AjaxResult getDetail(@PathVariable("dictId") Long dictId)
    {
        return AjaxResult.success(sysDictTypeService.selectSysDictTypeById(dictId));
    }

    /**
     * 新增字典类型
     */
    @PreAuthorize("@ss.hasPermi('system:type:add')")
    @Log(title = "字典类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysDictType sysDictType)
    {
        return toAjax(sysDictTypeService.insertSysDictType(sysDictType));
    }

    /**
     * 修改字典类型
     */
    @PreAuthorize("@ss.hasPermi('system:type:edit')")
    @Log(title = "字典类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysDictType sysDictType)
    {
        return toAjax(sysDictTypeService.updateSysDictType(sysDictType));
    }

    /**
     * 删除字典类型
     */
    @PreAuthorize("@ss.hasPermi('system:type:remove')")
    @Log(title = "字典类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{dictIds}")
    public AjaxResult remove(@PathVariable Long[] dictIds)
    {
        return toAjax(sysDictTypeService.deleteSysDictTypeByIds(dictIds));
    }
}
