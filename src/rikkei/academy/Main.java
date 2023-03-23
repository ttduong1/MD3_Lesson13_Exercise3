package rikkei.academy;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.println("Nhập chuỗi: ");
        String string = input.nextLine();

        // Tìm chuỗi liên tiếp có độ dài lớn nhất
        for (int i = 0; i < string.length(); i++) { // 1 vòng lặp ( lần 1 )
            if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))){ // 1 câu lệnh
                list.clear();
            }
            list.add(string.charAt(i)); // 1 câu lệnh
            if (list.size() > max.size()){ // 1 câu lệnh
                max.clear();
                max.addAll(list);
            }
        }
        // Hiển thị chuỗi liên tiếp dài nhất
        for(Character ch: max){ // 1 vòng lặp ( lần 2 )
            System.out.println(ch); // 1 câu lệnh
        }
        System.out.println();
    }
    /**
     Theo bài ra:
     Ta có:
     1 vòng lặp ( lần 1 )
     3 câu lệnh

     1 vòng lặp ( lần 2 )
     1 câu lệnh

     =>
     1 vòng lặp ( lần 1 ) * 3 câu lệnh = 1 * 3 = 3
     1 vòng lặp ( lần 2 ) * 1 câu lệnh = 1 * 1 = 1

     <=>
     T(n) = O(n)
     Vậy độ phức tạp của bài toán trên là T(n) = O(n)
     **/
}