package com.chzz.common.Exception;

public class NonePrintException extends Exception {

    private static final long serialVersionUID = 114565411313L;
    private Integer errCode  =  0;
    private String errMsg  =  "";
    private String bussinessMsg ;
    
    public NonePrintException(Integer code,  String msg){
        super(msg);
        this.errCode = code;
        this.errMsg = msg;
    }
    public NonePrintException(Integer code,  String msg,  String busString){
        super(msg);
        this.errCode = code;
        this.errMsg = msg;
        this.bussinessMsg = busString;
    }
    public NonePrintException(Integer code,  String msg,  Throwable exception){
        super(msg, exception);
        this.errCode = code;
        this.errMsg = msg;
    }
    public String getErrMsg() {
        return this.errMsg;
    }
    public Integer getErrCode() {
        return this.errCode;
    }
    public String getBussinessMsg() {
        return this.bussinessMsg;
    }
}
