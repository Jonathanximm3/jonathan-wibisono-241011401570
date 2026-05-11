import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class latihan2p6 {
    public station void main(String args []){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int grade = 0;
        try {
            System.out.print("Masukan nilai anda: ");
            String nilai = input.readLine();
            grade = Integer.parseInt(nilai);
            if (grade == 100) {
                System.out.println("Selamat Annda Lulus dengan Kategori Sempurna");
            }
            else if (grade >= 95) {
                System.out.println("Selamat Anda Lulus dengan Kategori Sangat memuaskan");
            }
            else if (grade >= 90) {
                System.out.println("Selamat Anda Lulus dengan Kategori Memuaskan");
            }
            else if (grade >=80) {
                System.out.println("Selamat Anda Lulus dengan Kategori Baik");
            }
            else {
                System.out.println("Maaaf Anda Belum Lulus");
            }
            System.out.println("Nilai anda: " + grade);
        } catch (IEOxception e){
            System.out.println("Terjadi Kesalahan input");
        } catch (NumberFormatException e) {
            System.out.println("Input Harus Berupa Angka!");
        }

    }
}
