package cn.chen.bootextand.web.controller;

import cn.chen.bootextand.service.pojo.MusicInfo;
import cn.chen.bootextand.service.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: bootExtand
 * @description: 首页
 * @author: zhangyuchen
 * @create: 2020-12-28 10:19
 **/
@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/toIndex")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public List<MusicInfo> selectAll(){
        return indexService.selectAll();
    }
}
