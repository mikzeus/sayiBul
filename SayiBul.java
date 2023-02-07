import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiBul {
    public static void main(String[] args) {
       Random rd=new Random();
        int number= rd.nextInt(100);
        //double number = (int) (Math.random()*100);

        Scanner scan=  new Scanner(System.in);
        int right=0;
        int select;
        int [] wrong = new int[5];
        boolean isWin= false;
        boolean isFalse= false;
        System.out.println(number);

        while (right<5) {

            System.out.println("lutfen sayiyi tahmin ediniz:");
            select = scan.nextInt();

            if (select < 0 || select > 100) {
                System.out.println("Lutfen 0-100 arasinda bir sayi Giriniz:");

                if (!isFalse) {
                    isFalse=true;
                    System.out.println("Bir sonraki hatali girisinizde hakkinizden dusulecektir: ");

                } else {
                    right++;
                    System.out.println("Cok fazla hatali sayi girdiniz.. " + (5 - right));
            }
                continue;
        }
            if (select==number){
                System.out.println("tebrikler!!! Dogru sayi tahmin ettiniz..."+ number);
                isWin=true;
                break;
            }else {
                System.out.println("Hatali bir Sayi girdiniz:");

                if (select>number){
                    System.out.println(select + " sayisi, gizli Sayidan buyuktur...");
                }else {
                    System.out.println(select + " sayisi gizli Sayidan kucuktur...");
                }
                System.out.println("kalan hakkiniz: " + (5-right));
            }
            wrong[right++]=select;
        }
        if (!isWin){
            System.out.println("malesef Kaybettiniz !!!");
        }
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            System.out.println(number);
    }

}
