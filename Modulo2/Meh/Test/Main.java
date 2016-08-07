package Test;

public class Main {
	public static void main(String[] args) {
		
		System.out.println(new Object() {
			final String name = "Renan";
			final int id = 2832;
			public String toString() {
				return name + " " + id;
			}});
	}

}
