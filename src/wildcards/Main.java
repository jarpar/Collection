package wildcards;

import java.util.ArrayList;
import java.util.List;

class SuperClass {
    public static void test(List<Object> list) {

    }
}

class SubClass extends SuperClass {

}

public class Main {
    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<String>();

        List<SuperClass> listOfClass = new ArrayList<SuperClass>();
        listOfClass.add(new SuperClass());
        listOfClass.add(new SubClass());

        SuperClass.test(listOfStrings);
        SuperClass.test(listOfClass);

        ArrayList<String> listS = new ArrayList<String>();
        ArrayList<Object> listO = new ArrayList<Object>();
    }
}
