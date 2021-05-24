import java.util.Scanner;

public class Array {
    Scanner scanner = new Scanner(System.in);
    static int [] array = {2, 4, 6, 7, 9, 10};

    public static int binarySearch(int[] array, int left, int right ,int value){
        if (right > left){
            int middle = (left+right)/2;
            if (array[middle]== value){
                return middle;
            }if (value > array[middle]){
                return binarySearch(array, middle+1, right, value);
            }else
                return binarySearch(array, left, middle-1, value);
        }
        else
            return -1;
    }
}
