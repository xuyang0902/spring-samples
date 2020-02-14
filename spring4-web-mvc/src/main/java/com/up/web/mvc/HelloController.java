package com.up.web.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xu.qiang
 * @date 20/2/8
 */
@RestController
public class HelloController {


    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public Map<String,String> get(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("key1","hello");
        map.put("key2","world");
        return map;
    }

}
