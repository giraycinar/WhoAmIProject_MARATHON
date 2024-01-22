package com.giray.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tbl_dikkatcekicibilgiler")
public class DikkatCekiciBilgiler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String yetenek;
    String basarilar;
    String projeler;
    String skandalOlaylar;
    String stil;
    String toplumsalEtkilesim;
    String gorunum;
    String sosyalSorumluluk;


    @ManyToOne
    UnluKisi unlukisi;







    public DikkatCekiciBilgiler() {
    }

    public DikkatCekiciBilgiler(String yetenek, String basarilar, String projeler, String skandalOlaylar, String stil, String toplumsalEtkilesim, String gorunum, String sosyalSorumluluk) {
        this.yetenek = yetenek;
        this.basarilar = basarilar;
        this.projeler = projeler;
        this.skandalOlaylar = skandalOlaylar;
        this.stil = stil;
        this.toplumsalEtkilesim = toplumsalEtkilesim;
        this.gorunum = gorunum;
        this.sosyalSorumluluk = sosyalSorumluluk;
    }

    public DikkatCekiciBilgiler(Long id, String yetenek, String basarilar, String projeler, String skandalOlaylar, String stil, String toplumsalEtkilesim, String gorunum, String sosyalSorumluluk) {
        this.id = id;
        this.yetenek = yetenek;
        this.basarilar = basarilar;
        this.projeler = projeler;
        this.skandalOlaylar = skandalOlaylar;
        this.stil = stil;
        this.toplumsalEtkilesim = toplumsalEtkilesim;
        this.gorunum = gorunum;
        this.sosyalSorumluluk = sosyalSorumluluk;
    }

    public DikkatCekiciBilgiler(String yetenek, String projeler, String stil) {
        this.yetenek = yetenek;
        this.projeler = projeler;
        this.stil = stil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYetenek() {
        return yetenek;
    }

    public void setYetenek(String yetenek) {
        this.yetenek = yetenek;
    }

    public String getBasarilar() {
        return basarilar;
    }

    public void setBasarilar(String basarilar) {
        this.basarilar = basarilar;
    }

    public String getProjeler() {
        return projeler;
    }

    public void setProjeler(String projeler) {
        this.projeler = projeler;
    }

    public String getSkandalOlaylar() {
        return skandalOlaylar;
    }

    public void setSkandalOlaylar(String skandalOlaylar) {
        this.skandalOlaylar = skandalOlaylar;
    }

    public String getStil() {
        return stil;
    }

    public void setStil(String stil) {
        this.stil = stil;
    }

    public String getToplumsalEtkilesim() {
        return toplumsalEtkilesim;
    }

    public void setToplumsalEtkilesim(String toplumsalEtkilesim) {
        this.toplumsalEtkilesim = toplumsalEtkilesim;
    }

    public String getGorunum() {
        return gorunum;
    }

    public void setGorunum(String gorunum) {
        this.gorunum = gorunum;
    }

    public String getSosyalSorumluluk() {
        return sosyalSorumluluk;
    }

    public void setSosyalSorumluluk(String sosyalSorumluluk) {
        this.sosyalSorumluluk = sosyalSorumluluk;
    }

    @Override
    public String toString() {
        return "DikkatCekiciBilgiler{" +
                "id=" + id +
                ", yetenek='" + yetenek + '\'' +
                ", basarilar='" + basarilar + '\'' +
                ", projeler='" + projeler + '\'' +
                ", skandalOlaylar='" + skandalOlaylar + '\'' +
                ", stil='" + stil + '\'' +
                ", toplumsalEtkilesim='" + toplumsalEtkilesim + '\'' +
                ", gorunum='" + gorunum + '\'' +
                ", sosyalSorumluluk='" + sosyalSorumluluk + '\'' +
                '}';
    }
}
