package co.grandcircus.famouslab;

import java.util.List;

public class TinyResponse {

	List<Tiny>tiny;

	public List<Tiny> getTiny() {
		return tiny;
	}

	public void setTiny(List<Tiny> tiny) {
		this.tiny = tiny;
	}

	@Override
	public String toString() {
		return "TinyResponse [tiny=" + tiny + "]";
	}
	
}
