import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthMonth = 0;
        int favNum = 0;
        String trash = "";

        System.out.print("What month were you born in? [1-12]: ");

        if (in.hasNextInt()){
            birthMonth = in.nextInt();

            if  (birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("Your birth month is " + birthMonth);
            }else
            {
                System.out.println("You entered " + birthMonth + " which isnt a valid birth month");
            }

        }



    }
}