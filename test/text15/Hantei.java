package text15;

import java.util.Scanner;

class Hantei{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    try{
        //整数の入力
        System.out.print("整数を入力 = ");
        int num = scanner.nextInt();
        //偶数か奇数かの判定
        if(num % 2 == 0){
            System.out.println(num + "は偶数");
        } else {
            System.out.println(num +"は奇数");
        }
    }catch (java.util.InputMismatchException e) {
        System.out.println("整数と認識出来ません!!");
    }
  }
}
