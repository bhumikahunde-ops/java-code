import java.util.*;
public class divide2 {
    public static void main(String[]args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("It is divided by both");
        }else{
            System.out.println("It is not divided by both");
        }
    }
}