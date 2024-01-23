import java.util.Scanner;

// Calculator クラスの定義
class Calculator {
    public int calcSum(int num1, int num2) {
        return num1 + num2;
    }

    public double calcAve(int num1, int num2) {
        return (num1 + num2) / 2.0;
    }
}

// MoreCalc クラスの定義
class MoreCalc extends Calculator {
    public double calcPow(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}

public class Nan {
    public static void main(String[] args) {
        //クラスのインスタンスを生成
        MoreCalc Instance = new MoreCalc();

        // 2 つの整数の入力を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.print("1つ目の整数を入力してください: ");
        int num1 = scanner.nextInt();

        System.out.print("2つ目の整数を入力してください: ");
        int num2 = scanner.nextInt();

        // 合計値を計算して表示
        int sum = Instance.calcSum(num1, num2);
        System.out.println("合計値: " + sum);

        // 平均値を計算して表示
        double ave = Instance.calcAve(num1, num2);
        System.out.println("平均値: " + ave);

        // 累乗を計算して表示
        System.out.print("累乗の指数を入力してください: ");
        int exponent = scanner.nextInt();
        double powResult = Instance.calcPow(num1, exponent);
        System.out.println(num1 + "の" + exponent + "乗: " + powResult);
    }
}
