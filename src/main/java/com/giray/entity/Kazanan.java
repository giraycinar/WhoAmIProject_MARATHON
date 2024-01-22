package com.giray.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_kazanan")
public class Kazanan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String soyad;

    Integer dogruCevapSayisi;
    Integer cevaplamaSuresi;
    String odul;

    @OneToOne
    Yarisma yarisma;










    public Kazanan() {
    }

    public Kazanan(String ad, String soyad, Integer dogruCevapSayisi, Integer cevaplamaSuresi, String odul) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogruCevapSayisi = dogruCevapSayisi;
        this.cevaplamaSuresi = cevaplamaSuresi;
        this.odul = odul;
    }

    public Kazanan(Long id, String ad, String soyad, Integer dogruCevapSayisi, Integer cevaplamaSuresi, String odul, Yarisma yarisma) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.dogruCevapSayisi = dogruCevapSayisi;
        this.cevaplamaSuresi = cevaplamaSuresi;
        this.odul = odul;
        this.yarisma = yarisma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDogruCevapSayisi() {
        return dogruCevapSayisi;
    }

    public void setDogruCevapSayisi(Integer dogruCevapSayisi) {
        this.dogruCevapSayisi = dogruCevapSayisi;
    }

    public Integer getCevaplamaSuresi() {
        return cevaplamaSuresi;
    }

    public void setCevaplamaSuresi(Integer cevaplamaSuresi) {
        this.cevaplamaSuresi = cevaplamaSuresi;
    }

    public String getOdul() {
        return odul;
    }

    public void setOdul(String odul) {
        this.odul = odul;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Kazanan{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", dogruCevapSayisi=" + dogruCevapSayisi +
                ", cevaplamaSuresi=" + cevaplamaSuresi +
                ", odul='" + odul + '\'' +
                ", yarisma=" + yarisma +
                '}';
    }
}
