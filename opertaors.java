import java.util.Scanner;
class opertaors{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Please Enter a number according to your choice");
    int a= sc.nextInt();
    System.out.println("Please Enter one more number to perform the Calculation");
    int b= sc.nextInt();
    System.out.println("Please enter the type of operation you want to make for eg. add, sub, mul, div, mod, exp , ");
    String op = sc.next();
    int sum= a+b;
    int sub= a-b;
    int mul= a*b;
    int div= a/b;
    int mod= a%b;
    double exp = Math.pow(a, b);
    if (op.equals("sum")) {
        System.out.println(sum);
    }
     else if (op.equals("sub")) {
        System.out.println(sub);
    } 
    else if (op.equals("mul")) {
        System.out.println(mul);
    }
     else if (op.equals("div")) {
        System.out.println(div);
    }
     else if (op.equals("mod")) {
        System.out.println(mod);
    }
     else if (op.equals("exp")) {
        System.out.println(exp);
    } else {
        System.out.println("Unknown operation: " + op);
    }
    sc.close();
}
}
