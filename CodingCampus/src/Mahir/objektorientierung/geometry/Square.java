package Mahir.objektorientierung.geometry;

public class Square extends Geometry {

    int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    double getCircumference() {

        return size * 4;
    }

    @Override
    double getArea() {

        return size * size;
    }
}
