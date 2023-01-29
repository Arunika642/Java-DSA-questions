/*Search for a target in the range of index[i,j] */
package Algorithms;

public class SearchInRange {

    public static void main(String[] args) {
        int [] arr = {18,12,-7,13,3,28};
        int upperbound = 5;
        int lowerbound = 1;
        int target = 3;
        int result = searchinrange(arr, lowerbound , upperbound , target);
        System.out.println(result);
    }

    static int searchinrange(int array[] , int lb , int ub , int target)
    {
        int i;
        if(array.length == 0){
            return 0;
        }

    for(i = lb ; i<ub ; i++)
    {
        if(array[i]==target)

        return i;
    }

    return 0;
}

}
