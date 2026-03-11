package basics;

import java.util.Scanner;

/**
 * KDVCalculator.java
 *
 * Kullanıcıdan alınan bir tutarın KDV oranını belirler ve
 * KDV tutarını ile KDV dahil toplam fiyatı hesaplar.
 *
 * Kurallar:
 * - 0 TL ile 1000 TL arasındaki tutarlar için KDV oranı %18
 * - 1000 TL'den büyük tutarlar için KDV oranı %8
 */

public class KDVCalculator {
    public static void main(String[] args) {

        double tutar, kdvOran, kdvTutar, kdvliTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz : ");
        tutar = inp.nextDouble();

        // KDV oranını belirleme
        kdvOran = (tutar >= 0 && tutar <= 1000) ? 0.18 : 0.08;

        // KDV hesaplama
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı :" + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
    }
}
