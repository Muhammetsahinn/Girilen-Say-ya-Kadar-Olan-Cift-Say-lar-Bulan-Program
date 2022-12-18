import java.util.Scanner;

public class main5 {

    public static void main(String[] args) {

        Scanner grs=new Scanner(System.in);
        int a,sayac = 0;
        System.out.print("Bir sayi giriniz :");
        double toplam = 0;

        a= grs.nextInt();

        for(int i = 0; i<=a; i++){
            if (i % 3 == 0 && i % 4 == 0) {
                    sayac++;
                    toplam = toplam + i;
                    System.out.println(i);
                }
        }
        System.out.println("--------------");
        System.out.println(toplam/sayac);
    }
}
