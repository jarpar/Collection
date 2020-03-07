package genericTypes;

public class Main {
    public static void main(String[] args) {

        /*
        ArrayList a = new ArrayList();
        a.add(new String("test"));
        a.add(new Integer(7));

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        */

        AnotherClass<String> somethingName;
        somethingName.retVal("test2");

        System.out.println(somethingName);
    }
}

class AnotherClass<TYPE> {
    public void retVal(TYPE val) {
        this.newVal = val;
    }

    public TYPE ret() {
        return this.newVal;
    }

    TYPE newVal;
}
