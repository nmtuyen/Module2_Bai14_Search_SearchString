package searchMaxString;

import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        String [] strings = str.split(" ");
        TreeMap<String, Integer> list = new TreeMap<>();
        for (int i = 0; i < strings.length; i++){
            strings[i] = strings[i].toLowerCase();
            if (list.containsKey(strings[i])){
                int count = list.get(strings[i])+ 1;
                list.put(strings[i], count);
            }else{
                list.put(strings[i], 1);
            }

        }
        System.out.println(list);
    }
}
