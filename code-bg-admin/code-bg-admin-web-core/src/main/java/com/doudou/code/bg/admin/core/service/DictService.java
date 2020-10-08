package com.doudou.code.bg.admin.core.service;

import com.doudou.code.bg.admin.core.dao.DictDao;
import com.doudou.code.bg.admin.core.entity.Dict;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author DouDou
 * @date 2020/10/6
 * @Description
 */
@Service
@Transactional
public class DictService {

    @Autowired
    private DictDao dictDao;

    public void save(Dict dict){
        dictDao.insert(dict);
    }

    public PageInfo<Dict> query(int page, int size){
        PageHelper.startPage(page, size);
        List<Dict> dicts = dictDao.selectAll();
        return PageInfo.of(dicts);
    }

}
