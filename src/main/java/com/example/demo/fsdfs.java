package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author Shen Hao
 * Created by Shen Hao on 2020/6/2
 */
@RestController
public class fsdfs {

    @RequestMapping("/test")
    public String ttt(){
        return "jkjkjkj";
    }

    @RequestMapping("/tt")
    public String ttddt(){
        return "jkjkjkj";
    }
}
