import java.util.Random;
import java.util.Scanner;
//this my first code on Java for Github;)
public class Start {

    public static void main(String[] args) {

        //new Functions

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        //Data

        boolean active = true;
        int answer;
        int attempts = 1; //ur attempts, "1" because u can win from the first time
        String line = "";

        //Random

        int min = 0; //min value of random
        int max = 1000; //max value of random
        int diff = max - min + 1; //different between min & max; plus 1, because vanilla range is from 0 to 99, btw you need to add 1
        int r = random.nextInt(diff);

        //uncomment the bottom line if you want to be a cheater)
        //System.out.println(r);

        //do-while
        do {
            System.out.print("Enter your number: ");
            answer = scan.nextInt();
            System.out.println(); //empty string for beauty)
            //if blocks
            if (answer > r) {
                System.out.println("Easy");
                attempts++;
                //if u don`t do it, at the end in block numbers, u will see comma
                if (line != "")
                    line = line + "," + String.valueOf(answer);
                else
                    line = line + "" + String.valueOf(answer);

            } else if (answer < r) {
                System.out.println("Hard");
                attempts++;
                //if u don`t do it, at the end in block numbers, u will see comma
                if (line != "")
                    line = line + "," + String.valueOf(answer);
                else
                    line = line + "" + String.valueOf(answer);

            } else if (answer == r) {
                System.out.println();
                System.out.println("You`re winner.");
                System.out.println("Your attempts: " + attempts);
                //if u don`t do it, at the end in block numbers, u will see comma
                if (line != "")
                    line = line + "," + String.valueOf(answer);
                else
                    line = line + "" + String.valueOf(answer);

                System.out.println("Your numbers: " + line);
                active = false;
            }

        } while (active);

    }
}