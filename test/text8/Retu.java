

class Retu{
    public static void main(String[] args){
        int[] list = new int[10];
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < list.length; i++){
            list[i] += 1;
            System.out.println("list["+ i +"]=" + a[i]);
        }
    }
}