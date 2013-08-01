/*
java -ea className //Enables assertions in the named class
java -ea packageName... //Enables assertions in the named package and any subpackages

java -da className //Disables assertions in the named class
java -da packageName... //Disables assertions in the named package and any subpackages
*/

public class AssertionVersion1 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        assert number <= 10;

        System.out.println("Success!!!");
 
    }
}

/*

Sample Output:

C:\Users\Naren\Desktop\Assertion>javac AssertionVersion1.java

C:\Users\Naren\Desktop\Assertion>java AssertionVersion1 10
Success!!!

C:\Users\Naren\Desktop\Assertion>java AssertionVersion1 11
Success!!!

C:\Users\Naren\Desktop\Assertion>java -ea AssertionVersion1 10
Success!!!

C:\Users\Naren\Desktop\Assertion>java -ea AssertionVersion1 11
Exception in thread "main" java.lang.AssertionError
        at AssertionVersion1.main(AssertionVersion1.java:14)

*/