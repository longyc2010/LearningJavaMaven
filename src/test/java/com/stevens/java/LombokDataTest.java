package com.stevens.java;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.stevens.java.bean.DataChild;
import com.stevens.java.utils.JsonUtils;
import org.junit.Test;

public class LombokDataTest {
    @Test
    public void testData() throws JsonProcessingException {
        DataChild dataChild = new DataChild();
        dataChild.setC_age(12);
        dataChild.setAge(99);
        System.out.println(JsonUtils.object2Json(dataChild));

    }
}
