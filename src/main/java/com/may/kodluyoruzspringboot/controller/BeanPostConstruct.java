package com.may.kodluyoruzspringboot.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;

public class BeanPostConstruct {

    @Autowired
    Logger logger;

    //    public BeanController() {
//        logger.info("sadasdsa");
//    }
    @PostConstruct
    public void init(){
        logger.info("log info çağrıldı");
    }
    public static void main(String[] args) {
        BeanController beanController = new BeanController();
        System.out.println(beanController);

    }
}
