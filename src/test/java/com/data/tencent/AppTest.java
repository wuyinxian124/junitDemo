package com.data.tencent; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.io.File;

/** 
* App Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 4, 2017</pre> 
* @version 1.0 
*/ 
public class AppTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: test() 
* 
*/ 
@Test
public void testTest() throws Exception {
    File file = new File("/spring-config.xml");
    System.out.println(file.getName());
//TODO: Test goes here... 
} 


} 
