package com.michael.michael.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ipk_1045")
public class Ipk_1045 implements Serializable {   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String ips;
    @Column(length = 100, nullable = false)
    private String nama;
    @Column(length = 255, nullable = false)
    private String keterangan;
    @Column(length = 255, nullable = false)
    private String ipk;
    @ManyToOne
    private Identitas_1045 Identitas_1045;
    
    public String getId() {
        return ips;
    }
    public void setId(String ips) {
        this.ips = ips;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getKeterangan() {
        return keterangan;
    }
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    public String getIpk() {
        return ipk;
    }
    public void setIpk(String ipk) {
        this.ipk = ipk;
    }
}
