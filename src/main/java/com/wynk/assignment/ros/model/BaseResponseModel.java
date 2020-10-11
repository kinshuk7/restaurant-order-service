package com.wynk.assignment.ros.model;

import java.io.Serializable;

/**
 * @author kinshuk.saraswat
 *
 */
public class BaseResponseModel implements Serializable {
	
	private static final long serialVersionUID = -6209745457726304749L;
	
	protected String status;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BaseResponseModel [status=" + status + "]";
	}
}