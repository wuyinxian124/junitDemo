package com.data.tencent;

/**
 * Created by Administrator on 2017/5/3.
 */

import com.data.tencent.pojo.TextMessage;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainTest {


        public static void main(String[] args) {

            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

            FindServer printerChain = ( FindServer)context.getBean("findServer");
            try {
                printerChain.introduceUser(new TextMessage("tt","la"));
                printerChain.introduceUser(new TextMessage("tt","lq"));
                printerChain.introduceUser(new TextMessage("pa","la"));
                printerChain.introduceUser(new TextMessage("pa","lq"));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

}
