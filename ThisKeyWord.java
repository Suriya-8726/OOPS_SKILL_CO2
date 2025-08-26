package OOP_skill;

class ThisBox {
    double width, height, depth;

    ThisBox(double width, double height, double depth) {
        // "this" is used to differentiate instance variables from parameters
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        ThisBox b = new ThisBox(3, 4, 5);
        System.out.println("Volume using this keyword: " + b.volume());
    }
}
