import java.util.*;
public class sumdigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to add: ");
        int num=sc.nextInt();
        int sum=0;
        int rem;
        while(num!=0){
            rem=num%10;
            sum=rem+sum;
            num=num/10;
        }
        System.out.println(sum);
    }
}