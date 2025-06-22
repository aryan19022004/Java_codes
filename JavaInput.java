import java.util.Scanner;

public class JavaInput {
    public  static void main(String[] args){
        System.out.println("taking input from the user");
        Scanner s1 = new Scanner(System.in);
        int a =  s1.nextInt();
        int b = s1.nextInt();
        //String c = s1.nextLine();
        System.out.println(a);
        System.out.println(a ==b);
    }
}
