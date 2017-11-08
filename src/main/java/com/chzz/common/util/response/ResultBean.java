package com.chzz.common.util.response;


/**
 * 统一返回格式，公司一直这么用
 * 觉得挺不错就复制过来
 * @author chzz
 *
 * @param <T>
 */
public class ResultBean<T> {
	private Integer status;
	private String msg;
	private T data;
	
	public static ResultBean<Object> defaultSuccess(){
		return new ResultBean<Object>(ServiceCode.OK, ServiceCode.OK_DEFAULT_MSG);
	}
	
	public ResultBean() {
		super();
	}
	public ResultBean(Integer status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}
	public ResultBean(Integer status) {
		super();
		this.status = status;
	}
	public ResultBean(Integer status, String msg, T data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
