package test;
import java.util.Scanner;

class En {
    public static void main(String[] args){
        double r;
        double area;
        //キーボードで入力
        Scanner scanner = new Scanner(System.in);
        //半径を入力
        System.out.print("半径:");
        r = scanner.nextDouble();
        //面積の計算
        area = r * r * 3.14;
        //画面に表示
        System.out.println(area);
    }
}
