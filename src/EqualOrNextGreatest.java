import java.util.Arrays;

public class EqualOrNextGreatest {
    int binarySearch(int [] arr, int reference){
        Arrays.sort(arr);
        int midArr = (0+arr.length)/2;
        return binarySearchHelper(arr, 0, arr.length-1, reference);
    }

    int binarySearchHelper(int[] arr, int low, int high, int ref){
        int mid = (low+high)/2;

        if(ref == arr[mid]){
            return mid;
        }
        else if(ref < arr[mid]){
            if(arr[mid - 1] < ref){
                return mid;
            }
            return binarySearchHelper(arr, 0, mid-1, ref);
        }
        else if(ref > arr[mid]){
            if(arr[mid + 1] > ref){
                return mid;
            }
            return binarySearchHelper(arr, mid+1, arr.length-1, ref);
        }
        else {
            return 0;
        }

    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,6,7,8};
        int k = 5;
        EqualOrNextGreatest equalOrNextGreatest = new EqualOrNextGreatest();
        System.out.println(equalOrNextGreatest.binarySearch(arr, k));
    }
}
