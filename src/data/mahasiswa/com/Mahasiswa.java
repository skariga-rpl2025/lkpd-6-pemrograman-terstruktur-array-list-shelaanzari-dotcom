
package data.mahasiswa.com;

public class Mahasiswa {
    private String nama;
    private String alamat;
    private String npm;

    public Mahasiswa(String nama, String alamat, String npm){
        this.nama = nama;
        this.alamat = alamat;
        this.npm = npm;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public String getNpm(){
        return npm;
    }

    @Override
    public String toString() {
        return nama + " | " + alamat + " | " + npm;
    }
}


