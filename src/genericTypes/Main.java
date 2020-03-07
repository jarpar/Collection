package genericTypes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(new StringBuffer("test"));
        a.add(new Integer(7));

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
