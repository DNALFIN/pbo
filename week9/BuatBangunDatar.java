package week9;
import java.util.Scanner;

public class BuatBangunDatar 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("=== Menu Bangun Datar ===");
            System.out.println("1. Luas Persegi (int)");
            System.out.println("2. Luas Segitiga (int)");
            System.out.println("3. Luas Persegi Panjang (Double)");
            System.out.println("4. Luas Lingkaran (Double)");
            System.out.println("5. Keliling Persegi (int)");
            System.out.println("6. Keliling Segitiga (Double)");
            System.out.println("7. Keliling Persegi Panjang (Double)");
            System.out.println("8. Keliling Lingkaran (Double)");
            System.out.println("9. Volume Kubus (Double)");
            System.out.println("10. Volume Tabung (Double)");
            System.out.println("11. Keluar");
            System.out.println("");
            System.out.print("Pilih menu : ");
            int menu = scanner.nextInt();

            switch (menu) 
            {
                case 1:
                    System.out.print("Masukkan sisi persegi: ");
                    int a = scanner.nextInt();
                    BangunDatar luasPersegi = new BangunDatar(0.0);
                    System.out.println("Luas Persegi: " + luasPersegi.luas(a) + " cm\u00B2");
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Masukkan alas   : ");
                    int alas = scanner.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    int tinggi = scanner.nextInt();
                    BangunDatar luasSegitiga = new BangunDatar(0.0, 0.0);
                    System.out.println("Luas Segitiga   : " + luasSegitiga.luas(alas, tinggi) + " cm\u00B2");
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Masukkan panjang     : ");
                    double p = scanner.nextDouble();
                    System.out.print("Masukkan lebar       : ");
                    double l = scanner.nextDouble();
                    BangunDatar luasPersegiPanjang = new BangunDatar(0.0, 0.0); // dummy value
                    System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang.luas(p, l) + " cm\u00B2");
                    System.out.println("");
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari : ");
                    double jariJari = scanner.nextDouble();
                    BangunDatar luasLingkaran = new BangunDatar(0.0); // dummy value
                    System.out.println("Luas Lingkaran     : " + luasLingkaran.luas(jariJari) + " cm\u00B2");
                    System.out.println("");
                    break;

                case 5:
                    System.out.print("Masukkan sisi    : ");
                    int sisi = scanner.nextInt();
                    BangunDatar kelilingPersegi = new BangunDatar(0.0);
                    System.out.println("Keliling Persegi : " + kelilingPersegi.keliling(sisi) + " cm");
                    System.out.println("");
                    break;

                case 6:
                    System.out.print("Masukkan sisi kiri  : ");
                    double sisi1 = scanner.nextDouble();
                    System.out.print("Masukkan sisi bawah : ");
                    double sisi2 = scanner.nextDouble();
                    System.out.print("Masukkan sisi kanan : ");
                    double sisi3 = scanner.nextDouble();
                    BangunDatar kelilingSegitiga = new BangunDatar(0.0);
                    System.out.println("Keliling Segitiga   : " + kelilingSegitiga.keliling(sisi1, sisi2, sisi3) + " cm");
                    System.out.println("");
                    break;

                case 7:
                    System.out.print("Masukkan panjang         : ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar           : ");
                    double lebar = scanner.nextDouble();
                    BangunDatar kelilingPersegiPanjang = new BangunDatar(0.0);
                    System.out.println("Keliling Persegi Panjang : " + kelilingPersegiPanjang.keliling(panjang, lebar) + " cm");
                    System.out.println("");
                    break;

                case 8:
                    System.out.print("Masukkan jari-jari : ");
                    double jariJariKel = scanner.nextDouble();
                    BangunDatar kelilingLingkaran = new BangunDatar(0.0);
                    System.out.println("Keliling Lingkaran : " + kelilingLingkaran.keliling(jariJariKel) + " cm");
                    System.out.println("");
                    break;

                case 9:
                    System.out.print("Masukkan sisi : ");
                    double sisiVol = scanner.nextDouble();
                    BangunRuang volumeKubus = new BangunRuang(sisiVol); // menggunakan parameter variabel utk inisialisasi
                    System.out.println("Volume Kubus  : " + volumeKubus.volume(sisiVol) + " cm³");
                    System.out.println("");
                    break;

                case 10:
                    System.out.print("Masukkan jari-jari : ");
                    double jariJariVol = scanner.nextDouble();
                    System.out.print("Masukkan tinggi    : ");
                    double tinggiVol = scanner.nextDouble();
                    BangunRuang volumeTabung = new BangunRuang(0.0); // tanpa parameter karna pi sudah terinisialisasi
                    System.out.println("Volume Tabung      : " + volumeTabung.volume(jariJariVol, tinggiVol) + " cm\u00B3");
                    System.out.println("");
                    break;

                case 11:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
