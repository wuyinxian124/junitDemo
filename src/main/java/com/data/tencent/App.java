package com.data.tencent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // create a list using the
        List<String> list = Arrays.asList("Lars", "Simon");

        // alternatively
        List<String> anotherList = new ArrayList<>();
        anotherList.add("Lars");
        anotherList.add("ambari");
        anotherList.add("Simon");
//        Collections.sort(anotherList,);
        anotherList.sort(String::compareToIgnoreCase);
        anotherList.forEach(System.out::println);
        System.out.println( "Hello World!" );
    }

    public void test(){

    }
}
