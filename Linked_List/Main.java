import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,-3,2,4};
        int product=max(arr);
        System.out.println(product);

    }
    public static int max(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        return max1 * max2;
    }
}
    
