import java.util.Scanner;

class Aisatu{

    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);
        String n = stdIn.nextLine();

        display(n);
    }
    
    static void display(String eigo){
        for(int i = 1; i <= n; i++)
        System.out.println(eigo);
    }
}