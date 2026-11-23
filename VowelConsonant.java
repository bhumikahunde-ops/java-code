import java.util.*;
public class VowelConsonant{
    public static void main(String[] args) {
        char letter;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        letter=sc.next().charAt(0);
        if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' ){
            System.out.println("It is a vowel");
        }else{
            System.out.println("It is a consonant");
        }
    }
}
