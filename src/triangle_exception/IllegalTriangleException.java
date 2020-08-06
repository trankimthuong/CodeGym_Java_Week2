package triangle_exception;

public class IllegalTriangleException extends Exception{
    private double side = 1.0;

    public IllegalTriangleException(){
        super("Mot canh lon hon tong 2 canh con lai!!! day khong phai la mot tam giac");
    }

    public IllegalTriangleException(double side){
        super(side + " phai mang gia tri > 0");
    }
}
