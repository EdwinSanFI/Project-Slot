/**
 * @author: Santiago Díaz Edwin Jaret
 */

package Slot;
import Slot.Backend.User;

public class Slot {
    public static void main(String[] args) {
        User user = new User();

        System.out.println("\u001B[033m"+"\n\t\t\t**  CASINO OOP  **"+"\u001B[0m");
        System.out.println("\u001B[32m"+"\t$$ "+"\u001B[0m"+Character.toString(191)+"Are you ready to play the best SLOT of the history? "+"\u001B[32m"+"$$"+"\u001B[0m");

        user.main();

    }
}