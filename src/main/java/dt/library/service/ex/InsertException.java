package dt.library.service.ex;
/**
 * 数据插入异常,原因不明
 * @author lroy
 *
 * @since 2019年4月28日下午3:46:11
 */
public class InsertException extends ServiceException {

	private static final long serialVersionUID = 6801857127830170250L;

	public InsertException() {
	}

	public InsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InsertException(String message, Throwable cause) {
		super(message, cause);
	}

	public InsertException(String message) {
		super(message);
	}

	public InsertException(Throwable cause) {
		super(cause);
	}

}
