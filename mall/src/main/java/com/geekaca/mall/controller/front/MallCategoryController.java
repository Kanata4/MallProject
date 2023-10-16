package com.geekaca.mall.controller.front;


import com.geekaca.mall.service.GoodsCategoryService;
import com.geekaca.mall.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
@Api(value = "v1", tags = "3.商城分类页面接口")
@Slf4j
public class MallCategoryController {
    @Autowired
    private GoodsCategoryService goodsCategoryService;

    @GetMapping("/categories")
    @ApiOperation(value = "获取分类数据", notes = "分类页面使用")
    public Result getCategories() {

        return null;
    }
}
