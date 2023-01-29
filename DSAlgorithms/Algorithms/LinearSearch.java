package Algorithms;

import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. you want to search");
        int target = in.nextInt();

        int[] arr = {23,56,43,24,64};
        int result = Ls(arr,target);
        System.out.println(result);
    }


        static int Ls(int arr[] , int target)
        {
            if(arr.length == 0){
                return  -1;

            }

            for(int index = 0;index <arr.length;index++)
            {
                if(arr[index] == target)
                {
                    return index;
                }

            }
            return -1;
        }
    }
        