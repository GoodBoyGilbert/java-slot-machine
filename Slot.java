import java.util.Arrays;
import java.util.Random;

public class Slot {
  public static void main(String[] args) {

    Random random = new Random();

    int counter = 0;

    int cash = 0;

    while (true) { 

    int slot_1 = random.nextInt(0,4);
    int slot_2 = random.nextInt(0,4);
    int slot_3 = random.nextInt(0,4);

    counter++;

    cash++;

    int machine[] = {slot_1, slot_2, slot_3};

    if (slot_1 == 3 && slot_2==3 && slot_3==3) { 
    
      System.out.println(Arrays.toString(machine));
      System.out.println("You hit the jackpot! It took: " + counter + " plays! It took this much money: " + "$" + cash * 5.5);
      System.out.println("The jackpot is $70 USD");
      break;

    }

    System.out.println(Arrays.toString(machine));

  }
    
  }
}
