package wildcards;

import java.util.ArrayList;
import java.util.List;

class SuperClass {
    public static void test(List<? extends SuperClass> list) {

    }
}

class SubClass extends SuperClass {

}

public class Main {
    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<String>();

        //List<SuperClass> listOfClass = new ArrayList<SuperClass>();
        List<SubClass> listOfClass = new ArrayList<SubClass>();

        //listOfClass.add(new SuperClass());
        listOfClass.add(new SubClass());

        //SuperClass.test(listOfStrings);
        SuperClass.test(listOfClass);

        //wrong example:
/*        ArrayList<String> listS = new ArrayList<String>();
        ArrayList<Object> listO = new ArrayList<Object>();

        listO.add(new Integer(7));
        String a = listO.get(0);
*/
    }
}
