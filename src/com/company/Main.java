package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tháng vào đi bro!");
        byte mouth = scanner.nextByte();
        switch(mouth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("có 31 ngày");
                break;
            case 2:
                System.out.println("có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("có 30 ngày");
                break;
            default:
                System.out.println("không có tháng này");
        }
    }
}
