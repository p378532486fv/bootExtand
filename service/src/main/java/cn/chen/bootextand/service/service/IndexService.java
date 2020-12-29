package cn.chen.bootextand.service.service;

import cn.chen.bootextand.service.pojo.MusicInfo;

import java.util.List;

/**
 * @program: bootExtand
 * @description:
 * @author: zhangyuchen
 * @create: 2020-12-28 16:30
 **/
public interface IndexService {
    List<MusicInfo> selectAll();
}
