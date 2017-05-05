
/*
 * This program prints the lyrics to the song "The Ants Go Marching."
 */

package nurseryrhymes;

/*
 * @author Devlin Wyatt
 */

public class AntsGoMarching {

    public void AntsGoMarching() {

        String phrase = null; // Used for the rhyme alterations.

        for (int i = 1; i <= 10; i++) { // repeats 10 times, 1 for each verse.
            for (int j = 0; j < 2; j++) { // The first part repeats twice.
                System.out.printf("The ants go marching %d by %d,\n", i, i);
                System.out.println("Hoorah!");
                System.out.println("Hoorah!");
            }
            System.out.printf("The ants go marching %d by %d,\n", i, i);
            
            /*
            This switch modifies 'phrase' to fit the current verse.
             */
            
            switch (i) {
                case 1:
                    phrase = "suck his thumb.";
                    break;
                case 2:
                    phrase = "tie his shoe.";
                    break;
                case 3:
                    phrase = "climb a tree.";
                    break;
                case 4:
                    phrase = "shut the door.";
                    break;
                case 5:
                    phrase = "take a dive.";
                    break;
                case 6:
                    phrase = "pick up sticks.";
                    break;
                case 7:
                    phrase = "pray to heaven.";
                    break;
                case 8:
                    phrase = "shut the gate.";
                    break;
                case 9:
                    phrase = "check the time.";
                    break;
                case 10:
                    phrase = "shout \"THE END!\"";
                    break;
                default:
                    break;
            }
            System.out.println("The little one stops to " + phrase);
            System.out.println("And they all go marching down, to the ground, and around.");
            System.out.println("BOOM BOOM BOOM!\n");
        }
    }
}
