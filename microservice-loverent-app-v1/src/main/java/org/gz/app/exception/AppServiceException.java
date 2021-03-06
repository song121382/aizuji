package org.gz.app.exception;

/**
 * 业务处理异常
 * @author yangdx
 *
 */
public class AppServiceException extends RuntimeException {

    private static final long serialVersionUID = -5875371379845226068L;

    /**
	 * 异常状态码
	 */
	private int code;

	/**
	 * 异常信息
	 */
	private String message;

	public AppServiceException(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public AppServiceException() {
        super();
    }

    public AppServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppServiceException(Throwable cause) {
        super(cause);
    }

    public AppServiceException(String message) {
        super(message);
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
