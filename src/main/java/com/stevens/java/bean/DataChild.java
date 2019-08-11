package com.stevens.java.bean;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class DataChild extends DataParent {
    private  String c_name;
    @JsonProperty("child_age")
    private int c_age;
    private double c_score;
    private String[] c_tags;


    @Override
    void process() {

    }
}
