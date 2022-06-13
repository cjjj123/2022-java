package com.cjj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/6/11
 * Time:15:10
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties("person")
public class Person {

    private String name;

    private String phone;
}
