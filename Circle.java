public class Circle extends GraphicObject {
    private int radius = 40;

    @Override
    void draw() {
        System.out.println("circle, radius " + radius);
    }

    @Override
    void resize() {
        if (radius < 100)
            radius *= 2;
    }
}