package co.grandcircus.famouslab;

import java.util.List;

public class CompleteResponse {

	
	List<Complete>complete;

	public List<Complete> getComplete() {
		return complete;
	}

	public void setComplete(List<Complete> complete) {
		this.complete = complete;
	}

	@Override
	public String toString() {
		return "CompleteResponse [complete=" + complete + "]";
	}
	
}
