package kadaiend;

import java.util.Random;

public class Ship {
    public void River(int[] rivers, booean sShip) {
        System.out.println();
        System.out.print("|");
        for (int val:rivers){
            switch (val){
                case-1:
                System.out.print("x");
                break;
                case 0:
                System.out.print(" ");
                break;
                case 1:
                System.out.print(sShip ? "y":" ");
                break;
            }

        }
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {
        int riverLength = promptForInt("Please,enter the river lenght");
        int [] shipArray = new int[riverLength];

        int randdomBattles new = Random().nextint(riverLength);
        shipArray[randdomBattles] = 1;


        boolean sShip = false;
        int usr;

        do
        {

        } while(!sShip);
        System.exit(0);
    
    }
        
    }
