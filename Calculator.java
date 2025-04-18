import java.util.Scanner;
import java.lang.Math;

class ABC {
    void ADD(int x, int y) {
        System.out.println("The addition is " + (x + y));
    }

    void SUB(int x, int y) {
        System.out.println("The subtraction is " + (x - y));
    }

    void MUL(int x, int y) {
        System.out.println("The multiplication is " + (x * y));
    }

    void DIV(int x, int y) {
        if (y != 0) {
            System.out.println("The division is " + (x / y));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
    void square(int x) {
        System.out.println("The square is " + (x * x));
    }
    void sqrt(int x) {
        System.out.println("The square root is " + Math.sqrt(x));
    }
}

class Calculator {
    public static void main(String[] args) {
        ABC calculator = new ABC();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = s.nextInt();

        System.out.print("Enter second number: ");
        int y = s.nextInt();

        System.out.println("Enter your choice:\n 1-for ADD\n 2-for SUB\n 3-for MUL\n 4-for DIV\n 5-for Square\n 6-for Square Root");
        int choice = s.nextInt();

        switch(choice) {
            case(1):
            calculator.ADD(x,y);
            break;

            case(2):
            calculator.SUB(x,y);
            break;

            case(3):
            calculator.MUL(x,y);
            break;

            case(4):
            calculator.DIV(x,y);
            break;

            case(5):
            calculator.square(x);
            break;

            case(6):
            calculator.sqrt(x);

            default:
            System.out.println("Invalid choice ");
 

        }

        s.close();
    }
}