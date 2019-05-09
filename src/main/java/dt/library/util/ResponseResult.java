package dt.library.util;

public class ResponseResult <T>{
	private Integer state;
	private T data;
	private String message;
	public ResponseResult() {
		super();
	}
	public ResponseResult(Integer state) {
		super();
		this.state=state;
	}
	public ResponseResult(Integer state,T data) {
		super();
		this.state=state;
		this.data=data;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ResponseResult [state=" + state + ", data=" + data + ", message=" + message + "]";
	}
	
}
