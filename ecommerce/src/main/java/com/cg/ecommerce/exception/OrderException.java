/**
 * 
 */
package com.cg.ecommerce.exception;

/**
 * @author NAVYA
 *
 */
public class OrderException extends Exception {

	/**
	 * 
	 */
	public OrderException() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	private static final long serialVersionUID = 1L;

	private String errMsg;

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public OrderException(String errMsg) {

		this.errMsg = errMsg;
	}


}
