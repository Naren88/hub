package naren.sourcecodes;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		try {
			String str = "Number Format Exception";
			int i = Integer.parseInt(str);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
