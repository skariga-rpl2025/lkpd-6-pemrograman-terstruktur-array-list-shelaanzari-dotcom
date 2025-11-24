package data.mahasiswa.com;

import java.util.ArrayList;

public class MahasiswaList {

    private ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

    public int jumlahMahasiswa() {
        return listMahasiswa.size();
    }

    public void tambahMahasiswa(String nama, String alamat, String npm) {
        listMahasiswa.add(new Mahasiswa(nama, alamat, npm));
    }

    // edit mahasiswa dengan data baru
    public void gantiMahasiswa(int index, String nama, String alamat, String npm){
        listMahasiswa.set(index, new Mahasiswa(nama, alamat, npm));
    }

    // edit mahasiswa dengan objek baru
    public void gantiMahasiswa(int index, Mahasiswa baru){
        listMahasiswa.set(index, baru);
    }

    public void hapusMahasiswa(int index){
        listMahasiswa.remove(index);
    }

    public Mahasiswa lihatMahasiswa(int index){
        return listMahasiswa.get(index);
    }

    // cari mahasiswa berdasarkan nama
    public Mahasiswa cariMahasiswa(String nama) {
        for (Mahasiswa m : listMahasiswa) {
            if (m.getNama().toLowerCase().contains(nama.toLowerCase())) {
                return m;
            }
        }
        return null; // tidak ditemukan
    }

    public int cariIndexMahasiswa(Mahasiswa m){
        return listMahasiswa.indexOf(m);
    }
}
