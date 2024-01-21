import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        // ユーザーに値を入力してもらう
        Scanner scanner = new Scanner(System.in);
        System.out.print("変数xに代入する値を入力してください: ");
        int xValue = scanner.nextInt();
        System.out.print("変数yに代入する値を入力してください: ");
        int yValue = scanner.nextInt();

        // Zikouクラスのクラス変数に値を代入
        Zikou.x = xValue;
        Zikou.y = yValue;

        // Zikouクラスのメソッドを呼び出して合計値を求め、結果を表示
        int result = Zikou.calculateSum();
        System.out.println("xからyまでの合計値: " + result);
    }
}
