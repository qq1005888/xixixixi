package cn.tedu.store.service.ex;
/**
 * 改密异常
 * @author JAVA
 *
 */
public class UpdateException extends RuntimeException{

	

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -3670870874533766508L;

	public UpdateException() {
		super();
		
	}

	public UpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public UpdateException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public UpdateException(String message) {
		super(message);
		
	}

	public UpdateException(Throwable cause) {
		super(cause);
	}

}
