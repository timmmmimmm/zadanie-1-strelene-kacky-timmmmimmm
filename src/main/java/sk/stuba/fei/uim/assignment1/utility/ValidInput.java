package sk.stuba.fei.uim.assignment1.utility;


import java.util.ArrayList;
import java.util.Scanner;

//welcome to the most copypasta classes of them all the input verifier
//tbh this should be an abstract class with static methods BUT StAtIc MeThOdS aRe NoT aLlOwEd

public abstract class  ValidInput {
    Scanner input = new Scanner(System.in);


   public byte playerCount(){

       byte playerCnt;

       System.out.print("Please choose the number of players(2 - 6): ");

        while (true){

            try {
                playerCnt = input.nextByte();

                if(playerCnt >= 2  &&  playerCnt <= 6)
                    break;

                else if(playerCnt == -1){
                    return -1;
                }

                System.out.print("Invalid number of players!\nPlease choose a valid number.\nYour choice: ");
            }

            catch (java.util.InputMismatchException e){
                //e.printStackTrace();  //Can be enabled, but it is really messy
                System.out.print("Please Enter a number: ");
                String throwOut = input.next();
            }
        }
        return playerCnt;
    }





    public int aimPosition(ArrayList<Boolean> field){
       int position;

        System.out.print("Please choose the place you want to aim at (1 - 6) : ");

        while (true){

            try {
                position = input.nextInt();

                if(position >= 1  &&  position <= 6){

                    if(!field.get(position))
                        break;
                    System.out.println("Your desired position has a reticule already aimed at it");
                }

                else if(position == -1)
                    return -1;


                System.out.print("Invalid field!\nPlease choose a valid number.\nYour choice: ");
            }

            catch (java.util.InputMismatchException e){
                //e.printStackTrace();  //Can be enabled, but it is really messy
                System.out.print("Please Enter a number: ");
                String throwOut = input.next();
            }
        }

        return position;
    }


}
