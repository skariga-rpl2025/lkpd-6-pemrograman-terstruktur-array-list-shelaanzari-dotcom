/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package your.app.packagee;

/**
 *
 * @author LENOVO IP3
 */
public class Buku {
    private final String judul;
    private final String pengarang;
    
    public Buku(String judul, String pengarang){
        this.judul = judul;
        this.pengarang = pengarang;
    }
    public String getJudul(){
        return judul;
    }
    public String getPengarang(){
        return pengarang;
    }
    
    public String tampil(){
        return "judul : " + judul + ", pengarang : " + pengarang;
    }
}
