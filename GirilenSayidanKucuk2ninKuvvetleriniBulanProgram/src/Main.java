import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int a;
            Scanner inp = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        a = inp.nextInt();;

        for(int i = 1;i <=a; i *= 4){
            System.out.println(i);
        }
        for(int b = 1;b <=a; b *= 5){
            System.out.println(b);
        }
    }
}