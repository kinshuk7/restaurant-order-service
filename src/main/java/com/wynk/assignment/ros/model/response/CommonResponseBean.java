package com.wynk.assignment.ros.model.response;

/**
 * @author kinshuk.saraswat
 *
 */
public class CommonResponseBean {

	protected Integer errCode;
	protected String respMsg;

	/**
	 * @return the errCode
	 */
	public Integer getErrCode() {
		return errCode;
	}

	/**
	 * @param errCode the errCode to set
	 */
	public void setErrCode(Integer errCode) {
		this.errCode = errCode;
	}

	/**
	 * @return the respMsg
	 */
	public String getRespMsg() {
		return respMsg;
	}

	/**
	 * @param respMsg the respMsg to set
	 */
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
}