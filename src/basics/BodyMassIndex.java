package basics;

import java.util.Scanner;

/**
 * Program: BodyMassIndex
 * Açıklama: Kullanıcıdan boy ve kilo değerlerini alıp vücut kütle indeksini ekrana yazdırın.
 * Yazar: Zeynep Kapacak
 */

public class BodyMassIndex {
    public static void main(String[] args) {
        int kg;
        double m, kutleindeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        m = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = input.nextInt();

        kutleindeks = kg / (m * m);
        System.out.println("Vücut kütle İndeksiniz : " + kutleindeks);



    }
}
