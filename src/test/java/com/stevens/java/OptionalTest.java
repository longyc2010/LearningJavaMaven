package com.stevens.java;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.stevens.java.bean.DataChild;
import org.junit.Test;

import java.util.Optional;

public class OptionalTest {
    @Test
    public void testData() throws JsonProcessingException {
        Optional<String> testOptional = Optional.empty();
        testOptional.ifPresent(str -> System.out.println("value is " + str));
        DataChild child = new DataChild();
        child.setAge(26);
        child.setName("Tom");
        Optional.of(child).map(c -> c.getName()).ifPresent(str -> System.out.println("name alue is " + str));
    }

    @Test
    public void testOptionalData() throws JsonProcessingException {
        Optional<String> testOptional = Optional.empty();
        testOptional.ifPresent(str -> System.out.println("value is " + str));
        DataChild child = new DataChild();
        child.setAge(26);
        child.setName("Tom");
        Optional.of(child).map(c -> c.getName()).ifPresent(str -> System.out.println("name alue is " + str));
    }
}
