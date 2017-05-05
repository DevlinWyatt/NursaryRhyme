
/*
 * This program is made to pull created Nursery Rhymes.
 */
 
package nurseryrhymes;

import java.util.Scanner;

/*
 * @author Devlin Wyatt
 */

public class NurseryRhymes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AntsGoMarching story1 = new AntsGoMarching();
        
        System.out.println("Welcome to Nursery Rhyme Corner!\n");

        while (true) {
            System.out.println("Please select from the drop down menu:\n"
                    + "1. The Ants Go Marching\n"
                    + "2. Exit");

            int i = input.nextInt();

            switch (i) {
                case 1:
                    story1.AntsGoMarching();
                    break;
                case 2:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
