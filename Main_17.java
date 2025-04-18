import java.util.Scanner;

class BelowAgeLimit extends Exception {
    BelowAgeLimit(String message) {
        super(message);
    }
}

class AgeException1 {
    void find(int age) throws BelowAgeLimit {
        if (age > 18) {
            System.out.println("Candidate is eligible to give vote");
        } else {
            throw new BelowAgeLimit("Age is below the limit for voting.");
        }
    }

    void belowagelimit() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the age:");
            int age = sc.nextInt();
            find(age);
        } catch (BelowAgeLimit e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Main_17 {
    public static void main(String[] args) {
        AgeException1 ag = new AgeException1();
        ag.belowagelimit();
    }
}