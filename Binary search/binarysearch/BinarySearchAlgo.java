/*Assuming that array is sorted in ascending order */


package binarysearch;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,29,45};
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
