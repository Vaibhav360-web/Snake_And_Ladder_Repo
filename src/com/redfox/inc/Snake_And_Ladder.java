package com.redfox.inc;

import java.util.Random;

public class Snake_And_Ladder {
    int Board_Numbers;
    int Dice_Rolled=0;
    public void Whole_Code(){
        do {
            Random random = new Random();
            int Random_Value_Storer = (int) (Math.floor(Math.random() * 6) + 1);
            System.out.println("Dice Value="+Random_Value_Storer);
            Random random1 = new Random();
            int Random_Value_Storer1 = random1.nextInt()%2;
            Dice_Rolled = Dice_Rolled+1;
            switch (Random_Value_Storer1){
                case -1:
                    System.out.println("Sorry You Cannot Move Forward");
                    System.out.println(Board_Numbers);
                    break;
                case 0:
                    Board_Numbers = Board_Numbers+Random_Value_Storer;
                    if(Board_Numbers>100){
                        Board_Numbers = Board_Numbers-Random_Value_Storer;
                    }
                    System.out.println("Position is:"+Board_Numbers);
                    Whole_Code();
                    break;
                case 1:
                    Board_Numbers = Board_Numbers-Random_Value_Storer;
                    System.out.println("Position is:"+Board_Numbers);
                    break;
            }
        }while (Board_Numbers!=100);

    }
    public static void main(String[] args) {
        Snake_And_Ladder snake_and_ladder = new Snake_And_Ladder();
        Snake_And_Ladder snake_and_ladder1 = new Snake_And_Ladder();
        snake_and_ladder.Whole_Code();
        if (snake_and_ladder.Board_Numbers==100) {
            System.out.println("Dice Was Rolled "+snake_and_ladder.Dice_Rolled+" Times to Win the Game");
        }
        System.out.println("---------------------------------------------------------------------------");
        snake_and_ladder1.Whole_Code();
        if (snake_and_ladder1.Board_Numbers==100) {
            System.out.println("Dice Was Rolled "+snake_and_ladder1.Dice_Rolled+" Times to Win the Game");
        }
        if(snake_and_ladder.Dice_Rolled< snake_and_ladder1.Dice_Rolled){
            System.out.println("Player1 Wins");
        }
        else{
            System.out.println("Player2 Wins");
        }

    }
}

