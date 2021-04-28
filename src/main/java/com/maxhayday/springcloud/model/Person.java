package com.maxhayday.springcloud.model;

import lombok.*;



@With
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;
    private int age;

}
