package Lista16;

import java.io.FileNotFoundException;

public class LeitorException extends Exception {
	
	public LeitorException(Exception e) {
		super(e);
	}

	public LeitorException(String m, Exception e) {
		super(m, e);
	}
	
	public void printException() {
		System.out.println(this.getMessage());
	}

}
