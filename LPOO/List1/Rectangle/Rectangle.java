package Rectangle;

public class Rectangle {
    public int height, length;

    public int recperi(int height, int length) {
        int perimeter = (height + length) * 2;
        return perimeter;
    }

    public int recare(int height, int length) {
        int area = height * length;
        return area;
    }

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }
}
