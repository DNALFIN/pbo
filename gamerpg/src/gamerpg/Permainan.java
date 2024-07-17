package gamerpg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.Random;

public class Permainan {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    Pahlawan pahlawan;
    long waktuMulai;
    String waktuMulaiString;

    public Permainan() {
        waktuMulai = System.currentTimeMillis();
        LocalTime waktuSekarang = LocalTime.now();
        waktuMulaiString = waktuSekarang.getHour() + ":" + waktuSekarang.getMinute() + ":" + waktuSekarang.getSecond();
        System.out.println("Permainan dimulai pada : " + waktuMulaiString);
        mulaiPermainan();
    }

    public void mulaiPermainan() {
        while (true) {
            System.out.println("Selamat Datang di Dunia Monster");
            System.out.println();
            System.out.println("Pilih pahlawan yang akan Anda gunakan!");
            System.out.println("1. Pemanah");
            System.out.println("2. Petarung");
            System.out.println("3. Penyihir");
            System.out.println("-- Tekan 4 untuk keluar dari permainan --");
            System.out.println();
            System.out.print("Pahlawan : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi baris baru setelah input integer

            if (pilihan == 4) {
                System.out.println("Sampai jumpa, terima kasih telah bermain!");
                System.exit(0);
            }

            System.out.print("Masukkan nama pahlawan Anda : ");
            String nama = scanner.nextLine();

            if (pilihan == 1) {
                pahlawan = new Pahlawan("Pemanah", nama, 1, 50, 20);
                break;
            } else if (pilihan == 2) {
                pahlawan = new Pahlawan("Petarung", nama, 1, 100, 10);
                break;
            } else if (pilihan == 3) {
                pahlawan = new Pahlawan("Penyihir", nama, 1, 35, 30);
                break;
            } else {
                System.out.println("Pilihan tidak tersedia, coba lagi!");
                System.out.println();
            }
        }

        System.out.println("");
        System.out.println("Selamat datang " + pahlawan.nama + " ke Dunia Monster, Anda adalah seorang " + pahlawan.tipe);
        System.out.println("Mari bebaskan dunia ini dari para monster!");
        System.out.println();

        menuSetelahPilihPahlawan();
    }

    public void menuSetelahPilihPahlawan() {
        while (true) {
            System.out.println("Pahlawan siap berpetualang di Dunia Monster...");
            System.out.println("1. Jalan");
            System.out.println("2. Istirahat");
            System.out.println("3. Keluar dari permainan");
            System.out.print("Pilih : ");
            int pilihan = scanner.nextInt();
            if (pilihan == 1) {
                mainkanPermainan();
                break;
            } else if (pilihan == 2) {
                istirahat();
            } else if (pilihan == 3) {
                keluarPermainan();
                break;
            } else {
                System.out.println("Pilihan tidak tersedia, coba lagi!");
            }
        }
    }

    public void istirahat() {
        System.out.println(pahlawan.tipe + " " + pahlawan.nama + " sedang beristirahat...");
        System.out.println("Tekan Enter untuk bangun dan melanjutkan petualangan.");
        scanner.nextLine(); // Menunggu input untuk melanjutkan
        scanner.nextLine(); // Membaca input Enter
        System.out.println(pahlawan.tipe + " " + pahlawan.nama + " sudah bangun dan siap untuk berpetualang kembali!");
    }

    public void mainkanPermainan() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("");
            System.out.println("Babak " + i);

            if (i == 1) {
                lawanNPC(1); // Babak 1 melawan monster level 1
            } else if (i == 2) {
                lawanNPC(random.nextInt(5) + 1); // Babak 2 melawan monster level random
            } else {
                while (true) {
                    System.out.println("");
                    System.out.println("EXP Level " + pahlawan.getTingkat() + " : " + pahlawan.getExp() + "/" + pahlawan.getExpLevelSelanjutnya());
                    System.out.println("HP Pahlawan: " + pahlawan.hpSaatIni);
                    System.out.println("Damage Pahlawan : " + pahlawan.getSerangan());
                    System.out.println("");
                    System.out.println("Babak 3, Anda bertemu dengan Bos Monster");
                    System.out.println("1. Melawan Bos Monster");
                    System.out.println("2. Kembali ke Babak 2 untuk Leveling Up");
                    System.out.println("3. Keluar dari permainan");
                    System.out.print("Pilih: ");
                    int pilihan = scanner.nextInt();
                    if (pilihan == 1) {
                        lawanBos(); // Babak 3 melawan boss monster
                        break;
                    } else if (pilihan == 2) {
                        lawanNPC(random.nextInt(5) + 1);
                    } else if (pilihan == 3) {
                        keluarPermainan();
                    } else {
                        System.out.println("Pilihan tidak tersedia, coba lagi!");
                    }
                }
            }
        }

        long waktuAkhir = System.currentTimeMillis();
        long waktuBermain = (waktuAkhir - waktuMulai) / 1000;
        System.out.println("Selamat! Anda telah membebaskan dunia dari para monster.");
        System.out.println("Waktu bermain: " + waktuBermain + " detik");
        System.out.println("Skor akhir: " + pahlawan.tingkat);
        System.out.println("");

        simpanKeDatabase(pahlawan.nama, waktuBermain, pahlawan.skor, waktuMulaiString);
    }

    public void lawanNPC(int tingkat) {
        Karakter npc = new Karakter("Monster NPC", tingkat, tingkat * 30, tingkat * 7);

        while (npc.masihHidup() && pahlawan.masihHidup()) {
            System.out.println("");
            System.out.println("EXP Level " + pahlawan.getTingkat() + " : " + pahlawan.getExp() + "/" + pahlawan.getExpLevelSelanjutnya());
            System.out.println("HP Pahlawan: " + pahlawan.hpSaatIni);
            System.out.println("Damage Pahlawan : " + pahlawan.getSerangan());
            System.out.println("");
            System.out.println("Anda bertemu dengan Monster NPC level " + npc.tingkat + ", kalahkan dia!");
            System.out.println("HP Monster : " + npc.hpSaatIni);
            System.out.println("Damage Monster : " + npc.serangan);
            System.out.println("Pilih aksi!");
            System.out.println("1. Serang");
            System.out.println("2. Bertahan");
            System.out.println("3. Lari menjauh");
            System.out.println("4. Keluar dari permainan");
            System.out.print("Aksi: ");
            int aksi = scanner.nextInt();
            if (aksi == 1) {
                serang(pahlawan, npc);
                pahlawan.expHit = pahlawan.expHit + 50;
                int hitMonster = 1000;
                pahlawan.skor = pahlawan.skor + hitMonster;
                System.out.println(pahlawan.tipe + " " + pahlawan.nama + " mendapatkan 50 exp !");
            } else if (aksi == 2) {
                System.out.println(pahlawan.nama + " bertahan!");
            } else if (aksi == 3) {
                pahlawan.hpSaatIni = pahlawan.getMaxHp();
                System.out.println(pahlawan.nama + " berhasil melarikan diri dan memulihkan HP!");
                lawanNPC(random.nextInt(5) + 1);
                return;
            } else if (aksi == 4) {
                keluarPermainan();
            } else {
                System.out.println("Aksi tidak tersedia, coba lagi!");
                continue;
            }

            if (npc.masihHidup()) {
                serang(npc, pahlawan);
            }

            System.out.println("HP Pahlawan Tersisa: " + pahlawan.hpSaatIni);
            System.out.println("HP Monster NPC Tersisa: " + npc.hpSaatIni);
        }

        if (pahlawan.masihHidup()) {
            pahlawan.expKill = pahlawan.expKill + 150; // Mengalahkan monster mendapatkan 150 EXP
            int killMonster = 2000;
            pahlawan.skor = pahlawan.skor + killMonster; // Skor kill
            System.out.println("");
            System.out.println(pahlawan.nama + " mengalahkan monster dan mendapatkan " + pahlawan.expKill + " EXP!");
            pahlawan.dapatkanExp(pahlawan.expKill, pahlawan.expHit);
            System.out.println("EXP Pahlawan: " + pahlawan.getExp() + "/" + pahlawan.getExpLevelSelanjutnya());
        } else {
            kalah();
        }
    }

    public void lawanBos() {
        Karakter bos = new Karakter("Bos Monster", 1, 2000, 300);

        while (bos.masihHidup() && pahlawan.masihHidup()) {
            System.out.println("");
            System.out.println("EXP Level " + pahlawan.getTingkat() + " : " + pahlawan.getExp() + "/" + pahlawan.getExpLevelSelanjutnya());
            System.out.println("HP Pahlawan: " + pahlawan.hpSaatIni);
            System.out.println("Damage Pahlawan : " + pahlawan.getSerangan());
            System.out.println("");
            System.out.println("Anda bertemu dengan Bos Monster, kalahkan dia!");
            System.out.println("HP Bos Monster : " + bos.hpSaatIni);
            System.out.println("Damage Bos Monster : " + bos.serangan);
            System.out.println("Pilih aksi!");
            System.out.println("1. Serang");
            System.out.println("2. Bertahan");
            System.out.println("3. Lari menjauh");
            System.out.println("4. Keluar dari permainan");
            System.out.print("Aksi: ");
            int aksi = scanner.nextInt();
            if (aksi == 1) {
                serang(pahlawan, bos);
                pahlawan.expHit = pahlawan.expHit + 50;
                int hitBos = 1000;
                pahlawan.skor = pahlawan.skor + hitBos;
            } else if (aksi == 2) {
                System.out.println(pahlawan.nama + " bertahan!");
            } else if (aksi == 3) {
                pahlawan.hpSaatIni = pahlawan.getMaxHp();
                System.out.println(pahlawan.nama + " berhasil melarikan diri dan memulihkan HP!");
                continue;
            } else if (aksi == 4) {
                keluarPermainan();
            } else {
                System.out.println("Aksi tidak tersedia, coba lagi!");
                continue;
            }

            if (bos.masihHidup()) {
                serang(bos, pahlawan);
            }

            System.out.println("HP Pahlawan Tersisa: " + pahlawan.hpSaatIni);
            System.out.println("HP Bos Monster Tersisa: " + bos.hpSaatIni);
            System.out.println("");
        }

        if (pahlawan.masihHidup()) {
            pahlawan.expKill = pahlawan.expKill + 150; // Mengalahkan monster mendapatkan 150 EXP
            int killBos = 2000; // Skor kill
            pahlawan.skor = pahlawan.skor + killBos;
            pahlawan.dapatkanExp(pahlawan.expKill, pahlawan.expHit);
            System.out.println("EXP Pahlawan: " + pahlawan.getExp() + "/" + pahlawan.getExpLevelSelanjutnya());
            System.out.println("Selamat " + pahlawan.tipe + " " + pahlawan.nama + ", Anda berhasil mengalahkan Bos Monster!");
            System.out.println("Dunia Monster telah terbebas dari para monster!");
        } else {
            kalah();
        }
    }

    public void serang(Karakter penyerang, Karakter musuh) {
        System.out.println(penyerang.nama + " menyerang " + musuh.nama + " dengan " + penyerang.serangan + " damage!");
        musuh.terimaSerangan(penyerang.serangan);
    }

    public void keluarPermainan() {
        long waktuAkhir = System.currentTimeMillis();
        long waktuBermain = (waktuAkhir - waktuMulai) / 1000;
        pahlawan.hitungSkor(pahlawan.skor, waktuBermain);
        System.out.println("Anda memutuskan untuk keluar dari permainan. Terima kasih telah bermain!");
        System.out.println("Skor bermain : " + pahlawan.hitungSkor(pahlawan.skor, waktuBermain));
        System.out.println("Waktu bermain : " + waktuBermain + " detik");
        simpanKeDatabase(pahlawan.nama, waktuBermain, pahlawan.skor, waktuMulaiString);
        System.exit(0);
    }

    public void kalah() {
        long waktuAkhir = System.currentTimeMillis();
        long waktuBermain = (waktuAkhir - waktuMulai) / 1000;
        pahlawan.hitungSkor(pahlawan.skor, waktuBermain);
        System.out.println(pahlawan.tipe + " " + pahlawan.nama + " dikalahkan oleh monster!");
        System.out.println("Skor bermain : " + pahlawan.hitungSkor(pahlawan.skor, waktuBermain));
        System.out.println("Waktu bermain: " + waktuBermain + " detik");
        simpanKeDatabase(pahlawan.nama, waktuBermain, pahlawan.skor, waktuMulaiString);
        System.exit(0);
    }

    public void simpanKeDatabase(String namaPahlawan, long waktuBermain, int skor, String waktuMulai) {
        String url = "jdbc:mysql://127.0.0.1/game"; // Ganti dengan URL database Anda
        String user = "root"; // Ganti dengan user database Anda
        String password = ""; // Ganti dengan password database Anda

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO riwayat_permainan (nama_pahlawan, waktu_bermain, skor, waktu_mulai) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, namaPahlawan);
                statement.setLong(2, waktuBermain);
                statement.setInt(3, pahlawan.hitungSkor(pahlawan.skor, waktuBermain));
                statement.setString(4, waktuMulai);
                statement.executeUpdate();
                System.out.println("Skor berhasil disimpan ke database.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal menyimpan skor ke database: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Permainan();
    }
}
