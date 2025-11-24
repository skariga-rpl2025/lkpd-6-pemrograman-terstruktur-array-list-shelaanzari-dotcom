package data.mahasiswa.com;

import java.util.Scanner;

public class Mainapp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MahasiswaList list = new MahasiswaList();

        int pilih;

        do {
            System.out.println("\n=== MENU APLIKASI DATA MAHASISWA ===");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Cari Mahasiswa");
            System.out.println("3. Edit Data Mahasiswa");
            System.out.println("4. Hapus Data Mahasiswa");
            System.out.println("5. Lihat Semua Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine(); // buang enter

            switch (pilih) {
                case 1:
                    System.out.println("\n=== TAMBAH DATA ===");
                    System.out.print("Nama   : ");
                    String nama = input.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = input.nextLine();
                    System.out.print("NPM    : ");
                    String npm = input.nextLine();

                    list.tambahMahasiswa(nama, alamat, npm);
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n=== CARI DATA ===");
                    System.out.print("Masukkan nama: ");
                    String cari = input.nextLine();
                    Mahasiswa hasil = list.cariMahasiswa(cari);

                    if (hasil != null) {
                        System.out.println("Data ditemukan:");
                        System.out.println("Nama   : " + hasil.getNama());
                        System.out.println("Alamat : " + hasil.getAlamat());
                        System.out.println("NPM    : " + hasil.getNpm());
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.println("\n=== EDIT DATA ===");
                    System.out.print("Masukkan nama yang ingin diubah: ");
                    String cariEdit = input.nextLine();
                    Mahasiswa target = list.cariMahasiswa(cariEdit);

                    if (target != null) {
                        int index = list.cariIndexMahasiswa(target);

                        System.out.println("Data lama:");
                        System.out.println(target);

                        System.out.println("\nMasukkan data baru:");
                        System.out.print("Nama baru   : ");
                        String namaBaru = input.nextLine();
                        System.out.print("Alamat baru : ");
                        String alamatBaru = input.nextLine();
                        System.out.print("NPM baru    : ");
                        String npmBaru = input.nextLine();

                        list.gantiMahasiswa(index, namaBaru, alamatBaru, npmBaru);
                        System.out.println("Data berhasil diubah!");
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan!");
                    }
                    break;

                case 4:
                    System.out.println("\n=== HAPUS DATA ===");
                    System.out.print("Masukkan nama yang ingin dihapus: ");
                    String hapusNama = input.nextLine();
                    Mahasiswa del = list.cariMahasiswa(hapusNama);

                    if (del != null) {
                        int index = list.cariIndexMahasiswa(del);
                        list.hapusMahasiswa(index);
                        System.out.println("Data berhasil dihapus!");
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan!");
                    }
                    break;

                case 5:
                    System.out.println("\n=== SEMUA DATA MAHASISWA ===");
                    if (list.jumlahMahasiswa() == 0) {
                        System.out.println("Tidak ada data.");
                    } else {
                        for (int i = 0; i < list.jumlahMahasiswa(); i++) {
                            Mahasiswa m = list.lihatMahasiswa(i);
                            System.out.println((i + 1) + ". " + m);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilih != 0);

        input.close();
    }
}
