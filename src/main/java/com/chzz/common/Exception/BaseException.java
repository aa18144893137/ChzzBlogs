package com.chzz.common.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  系统异常类
 * @author chzz
 *
 */
public class BaseException extends Exception {

	 private static Logger logger  =  LoggerFactory.getLogger(BaseException.class);

    private static final long serialVersionUID  =  114565411313L;
    
    private Integer errCode  =  0;
    
    private String errMsg  =  "";
    
    private String bussinessMsg ;
    
    public BaseException(Integer code,  String msg){
        super(msg);
        this.errCode  =  code;
        this.errMsg  =  msg;
    }
    
    public BaseException(Integer code,  String msg,  String busString){
        super(msg);
        this.errCode = code;
        this.errMsg = msg;
        this.bussinessMsg = busString;
    }
    
    public BaseException(Integer code,  String msg,  Throwable exception){
        super(msg, exception);
        this.errCode = code;
        this.errMsg = msg;
    }
    public BaseException(String msg) {
        super(msg);
        this.errMsg = msg;
        logger.error(msg);
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
