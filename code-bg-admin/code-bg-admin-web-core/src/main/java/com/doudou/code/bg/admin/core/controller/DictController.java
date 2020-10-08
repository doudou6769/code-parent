package com.doudou.code.bg.admin.core.controller;

import com.doudou.code.bg.admin.core.entity.Dict;
import com.doudou.code.bg.admin.core.service.DictService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DouDou
 * @date 2020/10/6
 * @Description
 */
@RestController
@RequestMapping("/dict")
public class DictController {

    @Autowired
    private DictService dictService;

    /**
     * 功能描述：实现增加字典数据
     *
     * @param dict 包含字典数据的实体
     * @return 返回操作结果
     */
    @ApiOperation(value = "实现增加字典数据")
    @PostMapping("save")
    public void save(Dict dict){
        dictService.save(dict);
    }

    @ApiOperation(value = "分页查询字典数据")
    @GetMapping("/page")
    public PageInfo<Dict> query(Integer page,Integer size){
        return dictService.query(page,size);
    }

}
