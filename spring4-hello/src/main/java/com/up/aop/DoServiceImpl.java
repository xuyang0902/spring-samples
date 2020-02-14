package com.up.aop;

import com.up.aop.annotation.DoAction;
import org.springframework.stereotype.Service;

/**
 * @author xu.qiang
 * @date 20/2/7
 */
@Service
public class DoServiceImpl implements DoService{

    @DoAction
    @Override
    public void doService(){
        System.out.println("-->>>> do  do !!!");
    }
}
