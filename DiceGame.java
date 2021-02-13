import java.util.HashSet;
import java.util.Set;

public class DiceGame {
    public static void main(String[] args) {
        Die normalDie = new Die();
        Die die20Sided = new Die(20);
        Die die12Sided = new Die(12, "d12");
        normalDie.setSideUp(7); // returns false
        die12Sided.setSideUp(5);
        System.out.println("The top face of 12 sided die is "+die12Sided.getSideUp());
        System.out.println("The number of sides on a normal die is "+normalDie.getNumSides());
        System.out.println("The die type of 20 face die is "+die20Sided.getDiceType());
        die12Sided.roll();
        die20Sided.roll();
        normalDie.roll();
        System.out.println("You rolled "+die12Sided.getSideUp()+" on 12 sided die");
        System.out.println("You rolled "+die20Sided.getSideUp()+" on 20 sided die");
        System.out.println("You rolled "+normalDie.getSideUp()+" on the normal die");

        System.out.println("**************************Bonus**********************************************");
        Die[] dice = new Die[5];
        for (int i = 0;i < dice.length;++i) {
            dice[i] = new Die();
        }
        System.out.println("Rolling all five dices at once until cold-Yahtzee happens");
        int count = 0;
        while(true) {
            Set<Integer> rollValue = new HashSet<>();
            for (int i = 0;i < dice.length;i++) {
                dice[i].roll();
                rollValue.add(dice[i].getSideUp());
            }
            ++count;
            if (rollValue.size() == 1) break;
        }
        System.out.println("It took "+count+" rolls.");
    }
}
