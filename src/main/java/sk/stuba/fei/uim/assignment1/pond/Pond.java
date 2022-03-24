package sk.stuba.fei.uim.assignment1.pond;

import java.util.ArrayList;
import java.util.Collections;

public class Pond {

    private ArrayList<Integer> arena = new ArrayList<>();
    private ArrayList<Integer> rest = new ArrayList<>();
    private ArrayList<Boolean> aim = new ArrayList<>();

    public Pond(){}

    public Pond(byte numOfPlayers){
        ArrayList<Integer> cards = new ArrayList<>();

        for (byte i = 0; i < numOfPlayers; i++)
            for (byte j = 0; j < 5; j++)
                cards.add(i+1);

        for (byte i = 0; i < 5; i++)
            cards.add(0);

        Collections.shuffle(cards);

        for (byte i = 0; i < 6; i++){

            arena.add(cards.get(0));
            cards.remove(0);

            aim.add(false);
        }

        rest.addAll(cards);

        cards.clear();
    }

    public ArrayList<Boolean> accessAim (){
        return aim;
    }

}