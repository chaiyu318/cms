package com.briup.cms.web.controller;

import com.briup.cms.bean.Category;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
@Api(description = "栏目管理")
public class CategotyController {

    @Autowired
    private ICategoryService categoryService;

    @PostMapping("/addCategory")
    @ApiOperation("添加栏目")
    public Message addCategory(Category category){
        categoryService.saveOrUpdateCategory(category);
        return MessageUtil.success();
    }

    @GetMapping("/deleteById")
    @ApiOperation("删除栏目")
    @ApiImplicitParam(name = "id",value = "栏目id",paramType = "query" ,dataType = "int",required = true)
    public Message deleteCategory(int id) {
        categoryService.deleteById(id);
        return MessageUtil.success();
    }

    @GetMapping("/queryById")
    @ApiOperation("根据id查询栏目")
    @ApiImplicitParam(name = "id",value = "栏目id",paramType = "query",dataType = "int",required = true)
    public Message<Category> queryById(int id){
        Category category = categoryService.queryById(id);
        return MessageUtil.success(category);
    }

    @PostMapping("/update")
    @ApiOperation("修改栏目信息")
    public Message update(Category category) {
        categoryService.saveOrUpdateCategory(category);
        return MessageUtil.success();
    }

    @GetMapping("/findAll")
    @ApiOperation("查询所有栏目信息")
    public Message<List<Category>> findAll() {
        List<Category> list = categoryService.findAll();
        return MessageUtil.success(list);
    }
}
