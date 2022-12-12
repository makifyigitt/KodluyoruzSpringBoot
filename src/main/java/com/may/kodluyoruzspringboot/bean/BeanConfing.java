package com.may.kodluyoruzspringboot.bean;

import com.may.kodluyoruzspringboot.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfing {

    @Bean(initMethod = "initialBeanMethod",destroyMethod = "destroyBeanMethod")
    @Scope("singleton")
//    @Scope("request")
//    @Scope("session")
    public BeanDto beanDto(){

        return BeanDto
                    .builder().id(0L).beanName("bean adı").beanData("bean data")
               .build();
    }
}
