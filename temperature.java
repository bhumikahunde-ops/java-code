import java.util.*;
public class temperature{
    public static void main(String[] args){
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the current temperature in celsius: ");
        temp=sc.nextInt();
        if(temp<15){
            System.out.println("Cold");
        }else if(temp>=15 && temp<=24){
            System.out.println("It is cold/pleasant");
        }else if(temp>=25 && temp<=30){
            System.out.println("Warm");
        }else{
            System.out.println("Hot");
        }
    }
}
