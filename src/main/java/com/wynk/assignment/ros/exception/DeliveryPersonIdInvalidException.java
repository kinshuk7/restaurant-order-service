package com.wynk.assignment.ros.exception;

/**
 * @author kinshuk.saraswat
 *
 */
public class DeliveryPersonIdInvalidException extends RuntimeException {

	private static final long serialVersionUID = 3966985883697655176L;

	public DeliveryPersonIdInvalidException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DeliveryPersonIdInvalidException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public DeliveryPersonIdInvalidException(String message) {
		super(message);
	}
}
