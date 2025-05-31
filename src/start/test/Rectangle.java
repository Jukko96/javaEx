package start.test;

public class Rectangle {
    int width;
    int height;

    int calculateArea(int width,int height){
        return width * height;
    }
    int calculatePerimeter(int width,int height){
        return (width + height) * 2;
    }
    boolean isSquare(int width,int height){
        return width == height;
    }
}
