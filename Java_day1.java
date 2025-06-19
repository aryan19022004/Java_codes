public class Java_day1 {
   public static void main(String[] args){
      /* int a = 5;
       int b = 6;
       if( a < b ){
           System.out.println("yes");
       }else{
           System.out.println("No");
       }*/
       int number = 2; // The number whose table is to be printed

       System.out.println("Multiplication Table of " + number + ":");

       // Loop from 1 to 10 to generate the table
       for (int i = 1; i <= 10; i++) {
           // Calculate and print each line of the table
           System.out.println(number + " x " + i + " = " + (number * i));
       }
   }
}
