package Mahir.objektorientierung.geometry;

public class Triangle extends Geometry {

    private int size;

    public Triangle(int size) {
        this.size = size;
    }

    @Override
    double getCircumference() {

        return size * 3;
    }

    @Override
    double getArea() {

        return 2*(size*3/size );
    }
}
