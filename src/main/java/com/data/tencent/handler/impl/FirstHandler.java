package com.data.tencent.handler.impl;

import com.data.tencent.handler.HandlerAbst;
import com.data.tencent.pojo.TextMessage;

/**
 * Created by Administrator on 2017/5/3.
 */
import org.springframework.stereotype.Component;
@Component
public class FirstHandler extends HandlerAbst {


    public FirstHandler() {
        super(1);
    }

    @Override
    public boolean handle(TextMessage message) {
//        message.setTitle("first");
        System.out.println(message.toString());
        if(message != null){
            if("tt".equals(message.getTitle())){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
