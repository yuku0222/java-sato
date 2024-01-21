import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {
        // ユーザーに値を入力してもらう
        Scanner scanner = new Scanner(System.in);
        System.out.print("変数xに代入する値を入力してください: ");
        int xValue = scanner.nextInt();
        System.out.print("変数yに代入する値を入力してください: ");
        int yValue = scanner.nextInt();

        // Zikou2クラスのインスタンスを作成し、変数xとyに値を代入
        Zikou2 executor = new Zikou2(xValue, yValue);

        // 合計値を求め、結果を表示
        int result = executor.calculateSum();
        System.out.println("xからyまでの合計値: " + result);
    }
}
