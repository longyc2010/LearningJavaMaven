package com.stevens.java;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author stevens
 */
public class TestJava {
    public void testA(int a, int b, String c, List<String> d, Map<String,String> e,String f){

        if (a == 20) {
            return;

        }

        if (b == 200) {
            return;
        }

        if (StringUtils.isBlank(c)) {
            return ;
        }

        if (CollectionUtils.isEmpty(d)){
            return;
        }

        if (MapUtils.isEmpty(e)) {
            return;
        }

        if (StringUtils.isBlank(f)){
            return;
        }

    }
    public static void testString() {
        String a = "123456";
        String b = "123" + "456";

        String c = "456";
        String d = "123" + c;
        String e = new String("123456");
        System.out.println(a==b);
        System.out.println(a==d);
        System.out.println(a==e);
        System.out.println(d==e);

    }
    public static void main(String[] args) {

//        ArrayList<String> a = new ArrayList<>();
//        String str = StringEscapeUtils.unescapeHtml4("&lt;p&gt;【产品名称】艾酷维多种维生素锌软糖&lt;/p&gt;");
//        System.out.println(str);
//        String str2 = StringEscapeUtils.escapeHtml4("<p>【产品名称】艾酷维多种维生素锌软糖</p>");
//        System.out.println(str2);

        testString();

    }
}
