import java.util.Scanner;

public class IFELSE {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Program Cek Pembayaran");
        System.out.println("----------------------");

        System.out.print("Masukkan hargaMakanan: ");
        int hargaMakanan = input.nextInt();

        System.out.print("Masukkan uangBayar: ");
        int uangBayar = input.nextInt();

        System.out.println("----------------------");

        if (uangBayar < hargaMakanan) {
            System.out.println("Uang Anda Kurang, Silahkan Tambah Uang");

        } else if (uangBayar == hargaMakanan) {
            System.out.println("Pas! Pembayaran Berhasil, Terima kasih");

        } else {
            int kembalian = uangBayar - hargaMakanan;
            System.out.println("Kembalian Anda: " + kembalian);
        }

    }

}