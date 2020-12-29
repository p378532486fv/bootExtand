package cn.chen.bootextand.service.service.impl;

import cn.chen.bootextand.service.mapper.IndexMapper;
import cn.chen.bootextand.service.pojo.MusicInfo;
import cn.chen.bootextand.service.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: bootExtand
 * @description:
 * @author: zhangyuchen
 * @create: 2020-12-28 16:30
 **/
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexMapper indexMapper;

    @Override
    public List<MusicInfo> selectAll() {
        return indexMapper.selectAll();
    }
}
