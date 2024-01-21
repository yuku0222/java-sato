import java.util.Scanner;

class Zikou2 {
    // インスタンス変数
    int x;
    int y;

    // コンストラクタ
    public Zikou2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // xからyまでの合計値を求めるメソッド
    public int calculateSum() {
        int total = 0;
        for (int i = x; i <= y; i++) {
            total += i;
        }
        return total;
    }
}
