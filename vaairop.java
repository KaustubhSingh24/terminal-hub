import java.util.Scanner;

class vaairop {
    public static void main(String[]args){
        System.out.println("This program is made for practising for variable operators ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        int a = num1;
        int b = num2;
        int ab = a + b;
        int bc = b - a;
        ab *= 5;
        bc /= 5;
        System.out.println("The value of ab has changed to " + ab + " similarly the value of bc has changed to " + bc);
        scanner.close();
    }

}

