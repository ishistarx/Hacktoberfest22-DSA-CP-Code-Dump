import java.util.Scanner;
 class Main {
      public static void main(String args[]){
         int i, fact=1, number;
         System.out.println("Enter the number to find the factorial:");
         Scanner sc = new Scanner(System.in);
         number = sc.nextInt();

         for(i = 1; i<=number; i++) {
            fact = fact * i;
         }
         System.out.println("Factorial of the given number is:: "+fact);
      }
   }
