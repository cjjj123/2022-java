package com.cjj.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/30
 * Time:18:30
 */
@Component
@Data
public class User {

    @Value("haha")
    private String name;


}
