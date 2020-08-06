package triangle_exception;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        double side1 = 1;
        double side2 = 1;
        double side3 = 9;

        if(side1 < 0)
            throw new IllegalTriangleException(side1);
        if(side2 < 0)
            throw new IllegalTriangleException(side2);
        if(side3 < 0)
            throw new IllegalTriangleException(side3);
        if((side1 + side2) <= side3
                ||(side2 + side3) <= side1
                ||(side1 + side3) <= side2)
            throw new IllegalTriangleException();
        System.out.println("Day la 1 tam giac hop le!!!");
    }
}
