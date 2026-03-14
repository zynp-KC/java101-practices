package basics;

import java.util.Scanner;

/**
 * Program: GroceryStoreProgram
 * Açıklama: Kullanıcıların manavdan almış oldukları ürünlerin kg değerlerine göre toplam tutarını hesaplar.
 * Yazar: Zeynep Kapacak
 */

public class GroceryStoreProgram {
    public static void main(String[] args) {
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = input.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = input.nextDouble();

        toplam = (armutKg * armutFiyat) + (elmaKg * elmaFiyat) +
                (domatesKg * domatesFiyat) + (muzKg * muzFiyat) +
                (patlicanKg * patlicanFiyat);
        System.out.println("Toplam Tutar : " + toplam + " TL");
    }
}