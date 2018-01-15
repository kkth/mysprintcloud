package com.hk.theservice.services.impl;

import com.hk.theservice.config.SimpleConfig;
import com.hk.theservice.dao.SimpleDto;
import com.hk.theservice.dao.SimpleQry;
import com.hk.theservice.services.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by kunhe on 1/15/18.
 */

@Service
public class SimpleServiceImpl implements SimpleService {
    @Autowired
    private SimpleConfig simpleConfig; //

    @Override
    public SimpleDto simple(){
        SimpleDto simpleDto = new SimpleDto();
        simpleDto.setAge(simpleConfig.getAge());
        simpleDto.setName(simpleConfig.getName());
        simpleDto.setRandomNum(new Random().nextInt(1000));
        return simpleDto;
    }

    @Override
    public SimpleDto simpleWithOneParam(String transparentString){
        SimpleDto simpleDto = new SimpleDto();
        simpleDto.setAge(simpleConfig.getAge());
        simpleDto.setName(simpleConfig.getName());
        simpleDto.setRandomNum(new Random().nextInt(1000));
        simpleDto.setTransparentString(transparentString);
        return simpleDto;
    }


    @Override
    public SimpleDto simpleWithQry(SimpleQry qry){
        SimpleDto simpleDto = new SimpleDto();
        simpleDto.setAge(simpleConfig.getAge());
        simpleDto.setName(simpleConfig.getName());
        simpleDto.setRandomNum(qry.getRandomNum());
        simpleDto.setTransparentString(qry.getTransparentString());
        return simpleDto;
    }
}

