interface Area {
    static float PI = 3.14f;

    default void compute(int r) {
        System.out.println("hi");
    }
}

class Circle implements Area {
    public void calculateArea(int r) {
        Area.super.compute();
        System.out.println("Area of circle: " + (PI * r * r));
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea(10);
    }
}
