import java.util.Scanner;

class Kurikaesi{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何回表示しますか？:");
          int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++)
           System.out.print("for文のプログラムです。\n");
        System.out.println();
    }
}
