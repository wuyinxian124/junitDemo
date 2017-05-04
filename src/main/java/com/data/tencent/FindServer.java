package com.data.tencent;

import com.data.tencent.handler.HandlerAbst;
import com.data.tencent.pojo.TextMessage;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * Created by Administrator on 2016/11/4.
 */
@Component
public class FindServer {

    @Autowired
    private List<HandlerAbst> handlers;

    @PostConstruct
    public void init() {
        Collections.sort(handlers);
    }

    public void introduceUser(TextMessage message) throws Exception {
        for (HandlerAbst handler : handlers) {
            if(handler.handle(message)){
                System.out.println(handler.getIndex() +" pass");
            }else{
                throw new Exception("failed in " + handler.getIndex());
            }
        }
    }
}
