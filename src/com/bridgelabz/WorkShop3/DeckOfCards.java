package com.bridgelabz.WorkShop3;

public class DeckOfCards {

    public static void main(String[] args) {
        String[][] cards = new String[4][13];

        String[] suit = {"Clubs","Diamonds","Hearts","Spades"};
        String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    for( int i=0;i<4;i++)
    {
        for( int j=0;j<13;j++)
        {
            cards[i][j] = suit[i]+rank[j];
        }
    }

    ShuffleCards shufflecards = new ShuffleCards();

    shufflecards.shuffle(cards);

    for (int i=0;i<4;i++)
    {
        System.out.println("Cards for the player"+(1+i));
        System.out.println();
        for (int j=0;j<9;j++)
            System.out.println(cards[i][j]);
    }

    }
}
