package com.data.tencent.pojo;

/**
 * Created by Administrator on 2017/5/3.
 */
public class TextMessage {

    public TextMessage( String title,String content) {
        this.title = title;
        this.content = content;
    }

    private String content;
    private String title;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TextMessage{" +
                "content='" + content + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
