import java.util.Scanner;

class Main{
    public static void main(String[] agrs) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("半径を整数値で入力:");  int a = stdIn.nextInt();
        //円周率
        double PI = 3.1415;
        //半径
        double han = a;
        //直径
        double tyokei = han * 2;
        //円周
        double ensyu = tyokei * PI;
        //面積
        double menseki = han * han * PI;

        String sv = String.format("%.3f", menseki);

        //出力する
        System.out.println("円周の長さは " + ensyu + "です。");
        System.out.println("円の面積は"+ sv + "です。");
    }
}


  