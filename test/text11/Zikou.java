import java.util.Scanner;

class Zikou {
    // クラス変数
    static int x = 0;
    static int y = 0;

    // xからyまでの合計値を求めるメソッド
    static int calculateSum() {
        int total = 0;
        for (int i = x; i <= y; i++) {
            total += i;
        }
        return total;
    }
}