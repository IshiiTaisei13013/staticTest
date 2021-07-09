import jdk.dynalink.beans.StaticClass;

public class main {
    public static void main(String[] args){
//        System.out.println(staticTest.staticField);
//        System.out.println(staticTest.staticMethod());
//
//        staticTest.staticField = "Japan";
//        System.out.println(staticTest.staticField);
//
//        staticTest test = new staticTest();
//        System.out.println(test.staticField);
//        System.out.println(test.staticMethod());
//        System.out.println(test.instanceMethod());
//
//        test.instanceField = "Murata";
//        System.out.println(test.instanceMethod());
//
//        test.instanceField = "Hi";
//        System.out.println(test.instanceMethod());
        Object obj = new FooService("Hello");
        Object obj2 = new FooService("Hello");

        System.out.println(obj == obj2);
        System.out.println(obj instanceof FooService);
        System.out.println(obj instanceof AbstractBaseService);
        System.out.println(obj instanceof BaseService);
        System.out.println(obj instanceof Integer);

        if (obj instanceof FooService){
            FooService service = (FooService) obj;
            System.out.println(service.say());
        }


    }
}
