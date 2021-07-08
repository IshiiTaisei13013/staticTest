public class staticTest {

    static String staticField = "World";

    static String staticMethod(){
        return "Weeeei!";
    }

    String instanceField = "Hello";

    String instanceMethod(){
        return instanceField + ":" + staticField + ":" + staticMethod();
    }
}
