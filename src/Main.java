import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthMonth = 0;

        System.out.print("What month were you born in? [1-12]: ");

        if (in.hasNextInt()){
            birthMonth = in.nextInt();

            if  (birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("Your birth month is " + birthMonth);
            }else
            {
                System.out.println("You entered " + birthMonth + " which isn't a valid birth month");
            }

        }



    }
}