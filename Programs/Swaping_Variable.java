import java.util.Scanner;

public class Swaping_Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number you want to swap: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number you want to swap: ");
        int b = sc.nextInt();

        a = a^b ^ (b = a);
        
        System.out.println("After Swapping: " + a + " " + b);
        sc.close();
    }
}
