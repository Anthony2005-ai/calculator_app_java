import java.util.Scanner;
public class Bab {
    public static void main(String[] args) {
        int operator, n1,n2;
        
        System.out.println("1 - Addition\n2 - Substraction \n3 - Multiplication \n4 - Division \n5 - Modulus");
        System.out.println("Choose Operator");
        Scanner am =  new Scanner(System.in);
        operator = am.nextInt();
        System.out.print("Enter First number: ");
        n1 = am.nextInt();
        System.out.print("Enter second number: ");
        n2 = am.nextInt();
        double result = 0;
        switch(operator){
            case 1:
            result = n1 + n2;
            break;
            
            case 2:
            result = n1 - n2;
            break;
            
            case 3:
            result = n1 * n2;
            break;
            
            case 4:
            result = n1 / n2;
            break;
            
            case 5:
            result = n1 % n2;
            break;
            
            default:
            System.out.println("Enter a valid number");
            break;
        }
        System.out.println("Result:" + result);
    }
    
}