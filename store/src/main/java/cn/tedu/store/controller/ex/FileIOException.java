package cn.tedu.store.controller.ex;

/**
 * 上传的文件时出现输入输出异常
 */
public class FileIOException extends FileUploadException {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1007256760091647496L;

	public FileIOException() {
		super();
	}

	public FileIOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FileIOException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileIOException(String message) {
		super(message);
	}

	public FileIOException(Throwable cause) {
		super(cause);
	}

}
