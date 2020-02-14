package com.up.annotation.service;

import com.up.annotation.component.PersonComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xu.qiang
 * @date 20/2/7
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonComponent personComponent;

    @Override
    public void eat(){
        personComponent.eat();
    }


}
