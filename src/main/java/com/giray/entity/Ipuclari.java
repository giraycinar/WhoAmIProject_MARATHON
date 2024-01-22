package com.giray.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_ipuclari")
public class Ipuclari {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ipucuBilgiler;

    @ManyToOne
    Sorular sorular;







    public Ipuclari() {
    }

    public Ipuclari(String ipucuBilgiler) {
        this.ipucuBilgiler = ipucuBilgiler;
    }

    public Ipuclari(Long id, String ipucuBilgiler) {
        this.id = id;
        this.ipucuBilgiler = ipucuBilgiler;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIpucuBilgiler() {
        return ipucuBilgiler;
    }

    public void setIpucuBilgiler(String ipucuBilgiler) {
        this.ipucuBilgiler = ipucuBilgiler;
    }

    @Override
    public String toString() {
        return "Ipuclari{" +
                "id=" + id +
                ", ipucuBilgiler='" + ipucuBilgiler + '\'' +
                '}';
    }
}
