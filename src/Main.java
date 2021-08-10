public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle();
        System.out.println(c1.getArea());
        System.out.println(c1.getRadius());
        System.out.println(c3.getRadius());
    }
}