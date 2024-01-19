//各ランクの評価表示
package test;
import java.util.Scanner;

class Rank{
    public static void main(String[] args){
        //キーボードで入力
        Scanner scanner = new Scanner(System.in);
        System.out.print("A~Dの値を入力してください:");
        char rank = scanner.next().charAt(0);

        //条件
        switch (rank) {
         case 'A' :System.out.println("ランクAは評価「優」です");  break;

         case 'B' :System.out.println("ランクBは評価「良」です");  break;

         case 'C' :System.out.println("ランクCは評価「可」です");  break;

         case 'D' :System.out.println("ランクDは評価「不可」です");  break;
        }
    }
}
