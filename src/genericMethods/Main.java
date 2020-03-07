package genericMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Editor {
    public static void print(List<? extends Figure> list) {
        for (Figure f : list) {
            System.out.println(f.getName());
        }

        list.add(null);

        System.out.println("-------------------");

        for (Figure f : list) {
            if (f == null) {
                System.out.println("null");
                break;
            }
            System.out.println(f.getName());
        }
    }

    public static <T extends Figure> void print2(List<T> list) {
        for (T f : list) {
            System.out.println(f.getName());
        }

        list.add(null);

        System.out.println("-------------------");

        for (T f : list) {
            if (f == null) {
                System.out.println("null");
                break;
            }
            System.out.println(f.getName());
        }
    }

    public static <Type> void MoveTableToCollection(Type[] tab, Collection<Type> c) {
        for (Type o : tab) {
            c.add(o);
        }
    }
}

class Figure<K> {

    K valTypeK;

    public String getName() {
        return name;
    }

    String name = "";

}

class Circle extends Figure {
    public Circle() {
        super.name = "Hello, Circle!";
    }
}

class Square extends Figure {
    public Square() {
        super.name = "Helllo, Square!";
    }
}

public class Main {
    public static void main(String[] args) {
        Figure figure1 = new Circle();
        Figure figure2 = new Square();
        Figure[] figureTab = new Figure[50];

        List<Figure> listOfFigures = new ArrayList<Figure>();
        listOfFigures.add(figure1);
        listOfFigures.add(figure2);

        Editor.print(listOfFigures);

        Float[] fl = new Float[50];
        Integer[] in = new Integer[50];
        Number[] nu = new Number[50];
        Collection<Number> cn = new ArrayList<Number>();
        Editor.MoveTableToCollection(fl, cn);
        Editor.MoveTableToCollection(in, cn);
        Editor.MoveTableToCollection(nu, cn);
        //Editor.MoveTableToCollection(figureTab, cn);

    }
}
