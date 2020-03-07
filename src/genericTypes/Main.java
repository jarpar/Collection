package genericTypes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList();
//        ArrayList<Integer> a = new ArrayList();

        a.add(new String("test"));
        //a.add(new Integer(7));

//        for (int i = 0; i < a.size(); i++) {
//            System.out.println(a.get(i));
//        }

        for (String s : a
        ) {
            System.out.println(s);

        }

        AnotherClass<String> somethingName = new AnotherClass<>();
        somethingName.setVal("test2");

        System.out.println(somethingName.getVal());
    }
}

class AnotherClass<TYPE> {
    public void setVal(TYPE val) {
        this.newVal = val;
    }

    public TYPE getVal() {
        return this.newVal;
    }

    TYPE newVal;
}
