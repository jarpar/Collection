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

    public static void MoveTableToCollection(Object[] tab, Collection<?> c) {

    }
}

class Figure {
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

        List<Figure> listOfFigures = new ArrayList<Figure>();
        listOfFigures.add(figure1);
        listOfFigures.add(figure2);

        Editor.print(listOfFigures);
    }
}
