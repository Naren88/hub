/*
java -ea className //Enables assertions in the named class
java -ea packageName... //Enables assertions in the named package and any subpackages

java -da className //Disables assertions in the named class
java -da packageName... //Disables assertions in the named package and any subpackages
*/

public class AssertionVersion2 {
    public static void main(String[] args) {
 
        int argCount = args.length;
 
        assert argCount == 10 : "The number of arguments must be equal to 10";
 
        System.out.println("Success!!!");
 
    }
}

/*

Sample Output:


C:\Users\Naren\Desktop\Assertion>javac AssertionVersion2.java

C:\Users\Naren\Desktop\Assertion>java AssertionVersion2 0 1 2 3 4 5 6 7 8 9
Success!!!

C:\Users\Naren\Desktop\Assertion>java AssertionVersion2 10
Success!!!

C:\Users\Naren\Desktop\Assertion>java -ea AssertionVersion2 0 1 2 3 4 5 6 7 8 9
Success!!!

C:\Users\Naren\Desktop\Assertion>java -ea AssertionVersion2 10
Exception in thread "main" java.lang.AssertionError: The number of arguments must be equal to 10
        at AssertionVersion2.main(AssertionVersion2.java:14)

*/		