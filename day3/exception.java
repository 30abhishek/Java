package com.company.day3;

public class exception extends Exception {
    String msg;
    exception(String _msg){
        msg =_msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
