import java.util.Scanner;

public class Rei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 整数の入力
            System.out.print("整数 1 = ");
            int num1 = scanner.nextInt();

            System.out.print("整数 2 = ");
            int num2 = scanner.nextInt();

            // 0で割る場合の例外処理
            if (num2 == 0) {
                throw new ArithmeticException("0 による割り算です！！");
            }

            // 割り算を実行し、結果を表示
            double result = (double) num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);

        } catch (java.util.InputMismatchException e) {
            System.out.println("整数を入力してください。");

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("処理終了");
            scanner.close();
        }
    }
}

// finally　= 後片付け
// throw = 
// getMessage =