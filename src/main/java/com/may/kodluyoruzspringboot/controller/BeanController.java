package com.may.kodluyoruzspringboot.controller;

import com.may.kodluyoruzspringboot.bean.BeanConfing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class BeanController {

    @Autowired
    BeanConfing beanConfing;


    // http://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto")
    @ResponseBody //html olmadan direkt ekranda göster
    public String getBeanDto(){

        return beanConfing.beanDto()+"";
    }


}
