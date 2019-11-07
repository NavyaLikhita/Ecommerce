/**
 * 
 */
package com.cg.ecommerce.exception;

/**
 * @author NAVYA
 *
 */
public class ProductException extends Exception {

	/**
	 * 
	 */
	public ProductException() {
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

	public ProductException(String errMsg) {

		this.errMsg = errMsg;
	}
	
}
