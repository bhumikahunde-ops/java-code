import java.util.*;
public class greater3{
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        num2=sc.nextInt();
        System.out.println("Enter the third number: ");
        num3=sc.nextInt();
        if(num1>=num2 && num1>=num3){
            System.out.println("Greater number is: " +num1);
        }else if(num2>=num1 && num2>=num3){
            System.out.println("Greater number is: " +num2);
        }else{
            System.out.println("Greater number is: " +num3);
        }
    }
}        