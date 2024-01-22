package com.giray.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_sorular")
public class Sorular {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer soruSayisi;
    Integer sure;


    @ManyToOne
    Yarismacilar yarismacilar;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "sorular",fetch = FetchType.EAGER)
    List<Ipuclari> ipuclariList;


    @OneToOne(mappedBy = "sorular",cascade = CascadeType.ALL)
    UnluKisi unluKisi;





    public Sorular() {
    }

    public Sorular(Integer soruSayisi, Integer sure) {
        this.soruSayisi = soruSayisi;
        this.sure = sure;
    }

    public Sorular(Long id, Integer soruSayisi, Integer sure) {
        this.id = id;
        this.soruSayisi = soruSayisi;
        this.sure = sure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSoruSayisi() {
        return soruSayisi;
    }

    public void setSoruSayisi(Integer soruSayisi) {
        this.soruSayisi = soruSayisi;
    }

    public Integer getSure() {
        return sure;
    }

    public void setSure(Integer sure) {
        this.sure = sure;
    }

    @Override
    public String toString() {
        return "Sorular{" +
                "id=" + id +
                ", soruSayisi=" + soruSayisi +
                ", sure=" + sure +
                '}';
    }
}
