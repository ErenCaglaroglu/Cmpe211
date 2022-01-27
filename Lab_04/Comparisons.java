import java.util.*;
public interface Comparisons  {
    public static void main(String [] args){

         Scanner scan=new Scanner(System.in);
        System.out.println("Enter your three strings:");
        String val1=scan.next();
        String val2=scan.next();
        String val3=scan.next();


        System.out.println("Largest of three strings: "+ Compare3.largest(val1, val2,val3));

        System.out.println("Enter your three integer:");
        System.out.println("Largest of three integer: "+ Compare3.largest(val1, val2,val3));

    }
}
