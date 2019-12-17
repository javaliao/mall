package com.javaliao.backstage.controller;

import com.javaliao.backstage.bean.TbColumn;
import com.javaliao.backstage.service.ColumnService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/columnController")
@Api(tags = "ColumnController", description = "栏目管理")
public class ColumnController {
    @Autowired
    private ColumnService columnService;

    @ApiOperation("获取栏目列表")
    @GetMapping("getColumnList")
    public String getColumnList(ModelMap modelMap){
        columnService.getColumnList(modelMap);
        return "column/list";
    }

    @ApiOperation("根据条件获取栏目列表")
    @GetMapping("columnSerach")
    public String columnSerach(TbColumn column, ModelMap modelMap){
        columnService.ColumnSerach(column,modelMap);
        return "column/list";
    }
    @ApiOperation("根据id获取栏目")
    @GetMapping("getColumnById")
    public String getColumnById(String columnId,ModelMap modelMap){
        columnService.getColumnById(columnId,modelMap);
        return "column/modify";
    }
    @ApiOperation("添加栏目")
    @PostMapping("insertColumn")
    public String insertColumn(TbColumn tbColumn) throws Exception{
        columnService.insertColumn(tbColumn);
        return "column/list";
    }
    @ApiOperation("更新栏目")
    @PostMapping("updateColumn")
    public String updateColumn(TbColumn tbColumn) throws Exception{
        columnService.updateColumn(tbColumn);
        return "column/list";
    }
    @ApiOperation("删除栏目")
    @PostMapping("removeColumn")
    public String removeColumn(String columnId) throws Exception{
        columnService.removeColumn(columnId);
        return "column/list";
    }
}
