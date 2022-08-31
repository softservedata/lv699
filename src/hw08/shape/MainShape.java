package hw08.shape;

public class MainShape {
    public static void main(String[] args) {
        WrapperShape<Circle> circleWrapperShape = new WrapperShape<>(new Circle());
        WrapperShape<Square> squareWrapperShape = new WrapperShape<>(new Square());
//        WrapperShape<NotCircle> notCircleWrapperShape = new WrapperShape<>(new NotCircle()); //Error compile

    }
}
