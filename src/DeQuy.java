import java.util.Scanner;

public class DeQuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cần tìm");
        int value = scanner.nextInt();
        if (Array.binarySearch(Array.array,0, Array.array.length-1, value)== -1){
            System.out.println("Không có giá trị cần tìm");
        }else
            System.out.println("vị trí số cần tìm là: "+ (1 +  Array.binarySearch(Array.array,0, Array.array.length-1, value)));
    }
}
