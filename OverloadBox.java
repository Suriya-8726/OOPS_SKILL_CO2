package OOP_skill;

class OverloadBox {
    double width, height, depth;

    // Default constructor
    OverloadBox() {
        width = height = depth = 1;
    }

    // Parameterized constructor
    OverloadBox(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Copy constructor
    OverloadBox(OverloadBox other) {
        width = other.width;
        height = other.height;
        depth = other.depth;
    }

    double volume() {
        return width * height * depth;
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        OverloadBox b1 = new OverloadBox();            // Default
        OverloadBox b2 = new OverloadBox(3, 4, 5);     // Parameterized (60.0)
        OverloadBox b3 = new OverloadBox(b2);          // Copy constructor

        System.out.println("Default: " + b1.volume());
        System.out.println("Parameterized: " + b2.volume());
        System.out.println("Copy: " + b3.volume());
    }
}
