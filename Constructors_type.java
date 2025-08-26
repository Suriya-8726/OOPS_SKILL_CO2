package OOP_skill;

class ConstructorBox {
    double width, height, depth;

    // Default constructor
    ConstructorBox() {
        width = height = depth = 1;
    }

    // Parameterized constructor
    ConstructorBox(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Copy constructor
    ConstructorBox(ConstructorBox obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    double volume() {
        return width * height * depth;
    }
}

public class Constructors_types {
    public static void main(String[] args) {
        ConstructorBox b1 = new ConstructorBox();
        ConstructorBox b2 = new ConstructorBox(3, 4, 5);
        ConstructorBox b3 = new ConstructorBox(b2);

        System.out.println("Default: " + b1.volume());
        System.out.println("Parameterized: " + b2.volume());
        System.out.println("Copy: " + b3.volume());
    }
}
