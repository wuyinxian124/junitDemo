package com.data.tencent.handler;

import com.data.tencent.pojo.TextMessage;

/**
 * Created by Administrator on 2017/5/3.
 */
public abstract class HandlerAbst implements Comparable{

    private int index;

    public HandlerAbst(int index){

        this.index = index;
    }

    public abstract boolean handle(TextMessage message);

    @Override
    public int compareTo(Object o) {
        if(this ==o){
            return 0;
        }
        else if (o!=null && o instanceof HandlerAbst) {
            HandlerAbst u = (HandlerAbst) o;
            if(index<=u.index){
                return -1;
            }else{
                return 1;
            }
        }else{
            return -1;
        }

    }

    public int getIndex() {
        return index;
    }
}
