/*Assuming that array is sorted in ascending order */


package binarysearch;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,3,9};
        int target = 4;
        int ans = search(arr,target);
        System.out.println(ans);

        
    }

    //return index if element found
    //else return -1
    static int search(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end-start)/2;                            //find middle element
            
            if(target>arr[mid])
            {
                start = mid+1;
            }
            else if(target<arr[mid])
            {
                end = mid-1;
            }
            else
            {
                return mid;
            }

        }
        return -1;
    }
    
}
