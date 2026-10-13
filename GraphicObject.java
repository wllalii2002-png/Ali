public abstract class GraphicObject {
    int x, y;

    void moveTo(int nx, int ny) {
        x = nx;
        y = ny;
    }

    abstract void draw();
    abstract void resize();
}