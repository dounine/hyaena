package com.dounine.hyaena.core.exception;

/**
 * Created by huanghuanlai on 16/4/23.
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = -32345996253864682L;

	public BusinessException(String errMsg){
        super(errMsg);
    }

}
