import jdk.dynalink.beans.StaticClass;

public class main {
    public static void main(String[] args){
        System.out.println(staticTest.staticField);
        System.out.println(staticTest.staticMethod());

        staticTest.staticField = "Japan";
        System.out.println(staticTest.staticField);

        staticTest test = new staticTest();
        System.out.println(test.staticField);
        System.out.println(test.staticMethod());
        System.out.println(test.instanceMethod());

        test.instanceField = "Murata";
        System.out.println(test.instanceMethod());

        test.instanceField = "Hi";
        System.out.println(test.instanceMethod());

    }
}
