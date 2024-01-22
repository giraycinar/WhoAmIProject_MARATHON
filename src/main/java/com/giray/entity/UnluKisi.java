package com.giray.entity;

import jakarta.persistence.*;

import java.net.URL;
import java.util.List;

@Entity
@Table(name = "tbl_unlukisi")
public class UnluKisi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String soyad;
    String telefon;
    String adres;
    String email;
    String resim;
    Integer boy;
    Integer kilo;
    Integer yas;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "unlukisi",fetch = FetchType.EAGER)
    List<DikkatCekiciBilgiler> dikkatCekiciBilgilerList;


    @OneToOne
    Sorular sorular;



    public UnluKisi() {
    }

    public UnluKisi(String ad, String soyad, String telefon, String adres, String email, String resim, Integer boy, Integer kilo, Integer yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.adres = adres;
        this.email = email;
        this.resim = resim;
        this.boy = boy;
        this.kilo = kilo;
        this.yas = yas;
    }

    public UnluKisi(Long id, String ad, String soyad, String telefon, String adres, String email, String resim, Integer boy, Integer kilo, Integer yas) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.adres = adres;
        this.email = email;
        this.resim = resim;
        this.boy = boy;
        this.kilo = kilo;
        this.yas = yas;
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
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

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public Integer getBoy() {
        return boy;
    }

    public void setBoy(Integer boy) {
        this.boy = boy;
    }

    public Integer getKilo() {
        return kilo;
    }

    public void setKilo(Integer kilo) {
        this.kilo = kilo;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "UnluKisi{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adres='" + adres + '\'' +
                ", email='" + email + '\'' +
                ", resim=" + resim +
                ", boy=" + boy +
                ", kilo=" + kilo +
                ", yas=" + yas +
                '}';
    }
}
