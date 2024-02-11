
class Rectangle {
    int length, breadth;
    int x = 50;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle {
    int height;
    int x = 100;
    Cuboid(int l, int b, int h) {
        super(l, b);
        height = h;
    }
    void display() {
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class SuperKeyWord {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(12, 56, 8);
        c.display();
    }
}