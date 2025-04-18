class Shape {
    double getArea() {
        System.out.println("Area of shape is undefined");
        return 0;
    }
   }
   class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double getArea() {
        return length * width;
    }
   }
   public class Main2 {
    public static void main(String[] args) {
        Shape myShape = new Shape();
        myShape.getArea(); 
        Rectangle myRectangle = new Rectangle(5, 3);
        System.out.println("Area of rectangle: " + myRectangle.getArea()); // Outputs: 15.0
    }
   }
