package com.may.kodluyoruzspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {
    private Long id;
    private String beanName;
    private String beanData;


    //başlangıç
    public void initialBeanMethod(){
        log.info("Bean başlamadan önce ben varım");
        System.out.printf("bean başlamdan önce çalışacak method\n");
    }

    //bitiş
    public void destroyBeanMethod(){
        log.info("Bean bittikten sonra ben varım");
        System.err.printf("bean bittikten sonra çalışacak method");
    }


}
