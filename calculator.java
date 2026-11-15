import java.util.Scanner;

public class calculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("MY CALCULATOR");
        System.out.println("enter the first number");
        double a=sc.nextDouble();
        System.out.println("enter the opeator(+,-,/,*)");
        char op=sc.next().charAt(0);
        System.out.println("enter the second number");
        double b=sc.nextDouble();
        switch(op){
            case'+':
                System.out.println("result="+(a+b));
            break;
            case'-':
                System.out.println("result="+(a-b));
            break;
            case'*':
                System.out.println("result="+(a*b));
            break;
            case'/':
                if(b!=0){
                    System.out.println("result="+(a/b));}
                else {
                    System.out.println("make sure second number is not zero");
                }
            break;
            default:
                System.out.println("invalid operator");

                
        }
        sc.close();
    }

}
