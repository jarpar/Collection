package genericMethods;

import java.util.List;

class editor {
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
        super.name = "I'm a Circle";
    }
}

class Square extends Figure {
    public Square() {
        super.name = "I'm a Square";
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
