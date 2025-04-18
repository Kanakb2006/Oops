import java.util.Scanner;

public class sales {
    public static void main(String args[]) {
        final int salesperson = 5;
        String[] names = new String[salesperson];
        int[] sales = new int[salesperson];
        int sum;
        Scanner scan = new Scanner(System.in);

        for (int j = 0; j < salesperson; j++) {
            System.out.println("Enter name for salesperson " + (j + 1) + ":");
            names[j] = scan.nextLine();
            System.out.println("Enter sales for " + names[j] + ":");
            sales[j] = scan.nextInt();
            scan.nextLine(); // consume the newline character
        }

        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");
        sum = 0;

        for (int j = 0; j < salesperson; j++) {
            System.out.println(" " + names[j] + " " + sales[j]);
            sum += sales[j];
        }
        System.out.println("\nTotal sales: " + sum);

        int max = 0;
        int min = 0;
        for (int j = 0; j < salesperson; j++) {
            if (sales[j] > sales[max]) {
                max = j;
            }
            if (sales[j] < sales[min]) {
                min = j;
            }
        }
        System.out.println("Salesperson " + names[max] + " had the highest sale with " + sales[max]);
        System.out.println("Salesperson " + names[min] + " had the lowest sale with " + sales[min]);
    }
}