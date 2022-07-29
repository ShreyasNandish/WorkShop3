package com.bridgelabz.WorkShop3;

public class ShuffleCards {
    public void shuffle(String[][] array)
    {
        String temp;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<13;j++)
            {
                int a = (int)(Math.random()*10)%4;
                int b = (int)(Math.random()*10)%13;
                temp = array[a][b];
                array[i][j] = array[a][b];
                array[a][b] = temp;
            }
        }
    }
}
