package ChildrenPackage;

public class Test extends ParentsPackage.Test {
    public static void main(String[] myArgs) {
        Test obj = new Test();
        int result = obj.addNumbers(4, 5);
        System.out.println("Rezultatul adunarii: " + result);
    }
}
