package com.ironghui.hb_xinfang.bean;

import java.io.Serializable;

public class OpenUser implements Serializable{
    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "OpenUser{" +
                "title='" + title + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public OpenUser(String title, String time) {
        this.title = title;
        this.time = time;
    }

    private String title;
    private String time;
}
