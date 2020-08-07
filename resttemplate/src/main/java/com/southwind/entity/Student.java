package com.southwind.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: aispringcloud
 * @author: fxb
 * @create: 2020-08-07 05:29
 * <p>
 * description
 **/


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private long id;
    private String name;
    private int age;

}
