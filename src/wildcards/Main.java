package wildcards;

import java.util.ArrayList;

class SuperClass {

}

class SubClass extends SuperClass {

}

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listOfStrings = new ArrayList<String>();

        ArrayList<SuperClass> listOfClass = new ArrayList<SuperClass>();
        listOfClass.add(new SuperClass());
        listOfClass.add(new SubClass());

    }
}
