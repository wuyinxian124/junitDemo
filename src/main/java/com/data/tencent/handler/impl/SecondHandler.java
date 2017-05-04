package com.data.tencent.handler.impl;


import com.data.tencent.handler.HandlerAbst;
import com.data.tencent.pojo.TextMessage;

/**
 * Created by Administrator on 2017/5/3.
 */
import org.springframework.stereotype.Component;
@Component
public class SecondHandler extends HandlerAbst {


    public SecondHandler() {
        super(2);
    }

    @Override
    public boolean handle(TextMessage message) {
//        message.setContent("second");
        System.out.println(message.toString());
        if(message != null){
            if("la".equals(message.getContent())){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
