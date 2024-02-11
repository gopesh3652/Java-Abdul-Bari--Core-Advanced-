class Super {
    public void display() {
        System.out.println("Hello");
    }
}


class Sub extends Super {
    @Override
    public void display() {
        System.out.println("Hello, Welcome");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Super su = new Sub();
        su.display();
    }
}
