package naren.sourcecodes;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		try {
			int number = Integer.parseInt(args[0]);
			assert number <= 10;
			System.out.println("Success!!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}