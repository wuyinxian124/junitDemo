package com.data.tencent; 

import com.data.tencent.handler.HandlerAbst;
import com.data.tencent.pojo.TextMessage;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;
import java.util.List;

/** 
* FindServer Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 4, 2017</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config.xml")
public class FindServerTest {


    @Autowired
    private List<HandlerAbst> handlers;


@Before
public void before() throws Exception {
    Collections.sort(handlers);

} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: init() 
* 
*/ 
@Test
public void testInit() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: introduceUser(TextMessage message) 
* 
*/ 
@Test
public void testIntroduceUser() throws Exception { 
//TODO: Test goes here...
    TextMessage message = new TextMessage("tt","la");

    for (HandlerAbst handler : handlers) {
        if(handler.handle(message)){
            System.out.println(handler.getIndex() +" pass");
        }else{
            throw new Exception("failed in " + handler.getIndex());
        }
    }


} 


} 
