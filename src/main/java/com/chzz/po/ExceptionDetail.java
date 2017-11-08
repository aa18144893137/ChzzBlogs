package com.chzz.po;

import java.io.Serializable;
import java.util.Date;

public class ExceptionDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id; //主键id

    private String errorPath; // 异常抛出路径

    private String detail; //异常详情

    private String msgStack; //异常堆栈信息
    
    private Date createAt; // 异常抛出时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getErrorPath() {
		return errorPath;
	}

	public void setErrorPath(String errorPath) {
		this.errorPath = errorPath;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getMsgStack() {
		return msgStack;
	}

	public void setMsgStack(String msgStack) {
		this.msgStack = msgStack;
	}
    
}
