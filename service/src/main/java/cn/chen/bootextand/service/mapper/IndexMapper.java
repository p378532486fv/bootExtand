package cn.chen.bootextand.service.mapper;

import cn.chen.bootextand.service.pojo.MusicInfo;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: bootExtand
 * @description:
 * @author: zhangyuchen
 * @create: 2020-12-28 16:33
 **/
@Repository
public interface IndexMapper {

    List<MusicInfo> selectAll();
}
