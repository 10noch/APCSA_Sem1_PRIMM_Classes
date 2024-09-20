/**
 * Driver class for the shapes
 * @author Sonam Sherpa
 * @version 1.0
 * @since 2024-09-20
 */


class ShapeDriver {
    public static void main(String args[]) {

        Square sq1 = new Square(2.0);

        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n", sq1.getArea());
        System.out.println("");



        // Changes the side length
        sq1.setSide(3.0);
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n", sq1.getArea());
        System.out.println("");

        // changes perimeter
        sq1.setPerimeter(16.0);
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n", sq1.getArea());
        System.out.println("");

        

        // Changes the area
        sq1.setArea(25.0);
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n", sq1.getArea());
        System.out.println("");
    


        sq1.setSide(4.5);
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n", sq1.getArea());
        System.out.println("");


        // TODO: After implementing a new shape of your choosing



        Circle cir1 = new Circle(2.0);

        System.out.printf("Radius: %.2f\n", cir1.getRadius());
        System.out.printf("Circumfrence: %.2f\n", cir1.getCPerimeter());
        System.out.printf("Area: %.2f\n", cir1.getCArea());
    




    }


}