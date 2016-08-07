package Test;

public class TimeTest {
	public static void main(String[] args) {
		String hello = "Hello World";
		
		for(int i = 0; i < hello.length(); i++) {
			System.out.print(hello.charAt(i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
