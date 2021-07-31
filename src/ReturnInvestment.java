import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ReturnInvestment {
    public ReturnInvestment() {
    }

    public static void main(String[] args) {
        LinkedList<Equipment> equip = new LinkedList();
        Scanner userInput = new Scanner(System.in);

        int userChoice;
        do {
            while(true) {
                System.out.println("Enter equipment name: ");
                String equipName = userInput.nextLine();
                System.out.println("Enter equipment cost: ");
                double cost = userInput.nextDouble();
                System.out.println("Enter equipment gain: ");
                double gain = userInput.nextDouble();
                double ROI = (gain - cost) / cost;
                equip.add(new Equipment(equipName, cost, gain, ROI));
                Collections.sort(equip, new ROICalc());
                System.out.print("Enter 1 to add more equipment or 0 to finish ");
                userChoice = userInput.nextInt();
                userInput.nextLine();
                if (userChoice == 1) {
                    continue;
                }
                break;
            }
        } while(userChoice != 0);

        System.out.println("---------------------------------");
        System.out.println("Program has completed processing");
        System.out.println("---------------------------------");
        Iterator var12 = equip.iterator();

        while(var12.hasNext()) {
            Equipment e = (Equipment)var12.next();
            System.out.println(e);
            userInput.close();
        }

    }
}
