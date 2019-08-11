package com.stevens.java.bean;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class DataParent {
    private String name;
    private int age;
    private double score;
    private String[] tags;

    abstract void process();

}
