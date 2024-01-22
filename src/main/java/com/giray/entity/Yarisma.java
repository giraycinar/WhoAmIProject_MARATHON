package com.giray.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbl_yarisma")
public class Yarisma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date tarih;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "yarisma",fetch = FetchType.EAGER)
    List<Yarismacilar> yarismacilarList;

    @OneToOne(mappedBy = "yarisma",cascade = CascadeType.ALL)
    Kazanan kazanan;








    public Yarisma() {
    }

    public Yarisma(Date tarih) {
        this.tarih = tarih;
    }

    public Yarisma(Long id, Date tarih) {
        this.id = id;
        this.tarih = tarih;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    @Override
    public String toString() {
        return "Yarisma{" +
                "id=" + id +
                ", tarih=" + tarih +
                '}';
    }
}
