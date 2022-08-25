package Rectangle;

public class MainRectangle {
    public static void main(String[] args) {
        int height, length;

        do {
            height = (int) Math.floor(Math.random() * 99);
            length = (int) Math.floor(Math.random() * 99);
        } while (height == 0 && length == 0);

        Rectangle rect = new Rectangle(height, length);
        rect.recare(height, length);
        rect.recperi(height, length);

        System.out.printf("RECTANGLE PROPRETIES\nHeight: %d | Length: %d\nArea: %d\nPerimeter: %d"
        , height, length, rect.recare(height, length), rect.recperi(height, length));
    }
}