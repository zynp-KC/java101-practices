package basics;

import java.util.Scanner;

/**
 * Program: CircleAreaCalculator
 * Açıklama: Kullanıcıdan alınan yarıçapa göre  dairenin alanını ve çevresini,
 * ayrıca merkez açısına göre daire diliminin alanını hesaplar.
 * Yazar: Zeynep Kapacak
 */

public class CircleAreaCalculator {
    public static void main(String[] args) {

        int r, merkezAcisi;
        double pi = 3.14, alan, cevre, dilimAlani;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Yarı Çapı Giriniz : ");
        r = input.nextInt();

        alan = pi * r * r;
        System.out.println("Dairenin Alanı : " + alan);

        cevre = 2 * pi * r;
        System.out.println("Dairenin Çevresi : " + cevre);

        System.out.print("Lütfen Merkez Açısını Giriniz : ");
        merkezAcisi= input.nextInt();

        dilimAlani = (pi * r * r * merkezAcisi) / 360;
        System.out.println("Daire Diliminin Alanı : " + dilimAlani);






    }
}
