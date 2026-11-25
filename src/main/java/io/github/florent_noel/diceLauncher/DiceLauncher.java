package io.github.florent_noel.diceLauncher;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class DiceLauncher {
    public static void main(String[] args) {
        int nbDes   = Integer.parseInt(args[0]);
        int nbFaces = Integer.parseInt(args[1]);
        printDiceValue(diceLauncher(nbDes, nbFaces));

    }
    private static List<Integer> diceLauncher (int nbDes, int nbFaces) {
        Random returnedDiceValue = new Random();
        List<Integer> diceList = new ArrayList<>();
        int i;
        for (i= 0; i < nbDes; i ++) {
            int value = returnedDiceValue.nextInt(nbFaces) + 1;
            diceList.add(value);
        }
        return diceList;
    };

    private static void printDiceValue (List<Integer> diceList) {
        AtomicInteger diceIndex = new AtomicInteger();
        diceList.forEach((v) -> {
            System.out.println("Dice Number : " + " " + String.valueOf( diceIndex.get() + 1) + " " + "value : " + String.valueOf(v));
            diceIndex.getAndIncrement();
        });
    }
}