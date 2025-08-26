package OOP_skill;

class Box {
    double width, height, depth;

    double volume() {
        return width * height * depth;
    }
}

public class Methods_box {
    public static void main(String[] args) {
        Box b = new Box();
        b.width = 10;
        b.height = 5;
        b.depth = 2;
        System.out.println("Volume: " + b.volume());
    }
}
