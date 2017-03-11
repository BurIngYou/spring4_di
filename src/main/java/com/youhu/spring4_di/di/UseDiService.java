package com.youhu.spring4_di.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: UseDiService
 * @Author:You.Hu
 * @Create:2017-03-11 16:48
 */
@Service
public class UseDiService {

    @Autowired
    private DiService diService;

    public String useDiFunction(){

        return diService.diFunctin();
    }

}
