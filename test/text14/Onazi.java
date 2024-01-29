package text14;

import java.util.Scanner;

class Onazi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("一つ目の文字列を入力:");
        String num1 = scanner.nextLine();

        System.out.print("二つ目の文字列を入力:");
        String num2 = scanner.nextLine();

        StringBuilder resultBuilder = new StringBuilder();
        
        if (num1.equals(num2)) {
            System.out.println("num1 と num2 は同じ文字列です。"); 
        } else {
            System.out.println("num1 と num2 は違う文字列です。");
        }
    }
}
