class S {
    double getPerimeter() {
        System.out.println("Perimeter is undefined for generic shape.");
        return 0;
    }
   
    double getArea() {
        System.out.println("Area is undefined for generic shape.");
        return 0;
    }
   }
   class Circle extends S {
    private double radius;
   
    Circle(double radius) {
        this.radius = radius;
    }
   
    double getPerimeter() {
        return 2 * Math.PI * radius; 
    }
   
    double getArea() {
        return Math.PI * radius * radius; 
    }
   }
   
   public class Main7 {
    public static void main(String[] args) {
        S shape = new S();
        shape.getPerimeter(); 
        shape.getArea();      
   
        Circle circle = new Circle(7); 
        System.out.printf("Circle Perimeter: %.2f\n", circle.getPerimeter());
        System.out.printf("Circle Area: %.2f\n", circle.getArea());
    }
   }