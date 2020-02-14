package com.up.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xu.qiang
 * @date 20/2/8
 */
@RestController
public class HelloController {

    @Autowired
    private Jedis jedis;


    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public Map<String,String> get(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("key1","hello1");
        map.put("key2","world1");

        jedis.set("hehe","1");

        System.out.println(jedis.get("hehe"));
        return map;
    }

}
