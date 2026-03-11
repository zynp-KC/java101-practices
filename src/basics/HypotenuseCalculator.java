package basics;

import java.util.Scanner;

/**
 *Program: HypotenuseCalculator
 * Açıklama: Dik üçgende hipotenüsü ve üç kenarı verilen üçgenin alanını hesaplar.
 * Yazar: Zeynep Kapacak
 */

public class HypotenuseCalculator {
    public static void main(String[] args) {
        int a, b,c;
        double hipotenus, u, alan;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2.Kenarı Giriniz : ");
        b = girdi.nextInt();

        // Hipotenüs hesaplama
        hipotenus = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : " + hipotenus);

        // Üçgen alanı için üçüncü kenar
        System.out.print("3.Kenarı Giriniz : ");
        c = girdi.nextInt();

        u = (a+b+c) / 2.0;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı : " + alan);


    }
}


