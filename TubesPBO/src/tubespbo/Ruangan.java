/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author lenovo
 */
public class Ruangan {
    String id_ruang;
    String nama_ruang;
    String lokasi;
    String keterangan;
  
    public Ruangan (String id_ruang,String nama_ruang, String lokasi, String keterangan){
       this.id_ruang = id_ruang;
       this.nama_ruang = nama_ruang;
       this.lokasi = lokasi;
       this.keterangan = keterangan;
    }
    
    public String getid_ruang(){
        return id_ruang;
    }
    public String getnama_ruang(){
        return nama_ruang;
    }
    public String getlokasi(){
        return lokasi;
    }
    public String getketerangan (){
        return keterangan;
    }
    }
