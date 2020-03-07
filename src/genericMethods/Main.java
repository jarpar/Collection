package genericMethods;

import java.util.ArrayList;
import java.util.List;

class Editor {
    public static void print(List<?> list) {

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
