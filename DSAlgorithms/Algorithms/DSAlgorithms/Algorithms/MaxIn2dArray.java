package Algorithms;

import java.util.Arrays;

public class MaxIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
    };

    int target = 56;
    int ans = findmax(arr);
    System.out.println(ans);
}
    static int findmax(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++)
        {
            for(int column = 0; column < arr[row].length;column++)
            {
                if(arr[row][column] > max)
                {
                    max = arr[row][column];
                }
            }
        }
        return max; 
    }
}
    

