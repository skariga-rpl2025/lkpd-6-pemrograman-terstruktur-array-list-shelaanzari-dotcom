/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package your.app.packagee;

/**
 *
 * @author LENOVO IP3
 */
public class main {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        perpus.tambahBuku("Belajar Java", "Umar Bakrie");
        perpus.tambahBuku("Java Untuk Pemula", "Amir Mahmud");
        perpus.tambahBuku("Java Untuk Ahli", "Salim Iklim");
        System.out.println("jumlah buku : " + perpus.jumlahbuku());
        perpus.tambahBuku("Java Untuk Mahasiswa", "Fahri Akbar");
        
        //cari buku 
        String cari = "Pemula";
        System.out.println("Cari buku dengan kata kunci : " + cari);
        Buku buku = perpus.cariBuku(cari);
        if(buku == null){
            System.out.println("buku tidak ditemukan");
        }else{
            System.out.println("buku ditemukan dengan judul : " + buku.getJudul() + ", pengarang " + buku.getPengarang());
        }
        
        //ganti buku
        perpus.gantiBuku(2, "Belajar Java Baru", "Umar Bakrie Salim");
        buku = perpus.lihatBuku(0);
        System.out.println("buku ditemukan dengan judul : " + buku.getJudul() + ", pengarang " + buku.getPengarang()); 
        
        //hapus buku
        perpus.hapusBuku(2);
        System.out.println("Jumlah buku : " + perpus.jumlahbuku());
    }
}
