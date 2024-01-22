package com.giray.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_yarismacilar")
public class Yarismacilar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String soyad;
    String adres;
    String email;
    Integer yas;
    Integer cevaplamasuresi;
    @ManyToOne
    Yarisma yarisma;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "yarismacilar",fetch = FetchType.EAGER)
    List<Sorular> sorularList;







    public Yarismacilar() {
    }

    public Yarismacilar(String ad, String soyad, String adres, String email, Integer yas, Integer cevaplamasuresi) {
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.email = email;
        this.yas = yas;
        this.cevaplamasuresi = cevaplamasuresi;
    }

    public Yarismacilar(String ad, String soyad, String adres, String email, Integer yas, Integer cevaplamasuresi, Yarisma yarisma, List<Sorular> sorularList) {
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.email = email;
        this.yas = yas;
        this.cevaplamasuresi = cevaplamasuresi;
        this.yarisma = yarisma;
        this.sorularList = sorularList;
    }

    public Yarismacilar(Long id, String ad, String soyad, String adres, String email, Integer yas, Integer cevaplamasuresi, Yarisma yarisma, List<Sorular> sorularList) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.email = email;
        this.yas = yas;
        this.cevaplamasuresi = cevaplamasuresi;
        this.yarisma = yarisma;
        this.sorularList = sorularList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    public Yarismacilar(Integer cevaplamasuresi) {
        this.cevaplamasuresi = cevaplamasuresi;
    }



    @Override
    public String toString() {
        return "Yarismacilar{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", adres='" + adres + '\'' +
                ", email='" + email + '\'' +
                ", yas=" + yas +
                ", cevaplamasuresi=" + cevaplamasuresi +
                ", yarisma=" + yarisma +
                ", sorularList=" + sorularList +
                '}';
    }
}
