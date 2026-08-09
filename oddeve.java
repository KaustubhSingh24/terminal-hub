import java.util.Scanner;

class oddeve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is odd or even:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        scanner.close();
    }
}

