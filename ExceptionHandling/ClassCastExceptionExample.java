package naren.sourcecodes;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		try {
			Object obj = Integer.valueOf(10);
			String str = (String) obj;
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
