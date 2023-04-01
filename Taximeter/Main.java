import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int km;
        double kmPrice = 2.20;
        double totalPrice;

        System.out.print("Write how many kilometers you have traveled: ");
        km = scanner.nextInt();

        totalPrice = kmPrice * km + 10;

        if (totalPrice <= 20) {
            System.out.println("Price= 20");
        } else if (totalPrice > 20) {
            System.out.println("Price= " + totalPrice);
        }


    }
}

