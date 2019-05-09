package dt.library.service.ex;
/**
 * 更新数据异常
 * @author lroy
 *
 * @since 2019年4月30日上午11:22:14
 */
public class UpdateException extends ServiceException{

	private static final long serialVersionUID = 8580917140194657471L;

	public UpdateException() {
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
