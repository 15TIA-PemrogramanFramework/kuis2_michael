package com.michael.michael.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "identitas_1045")
public class Identitas_1045 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nama;
    @Column(length = 255, nullable = false)
    private String umur;
    @Column(length = 255, nullable = false)
    private String jenis_kelamin;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getUmur() {
        return umur;
    }
    public void setUmur(String umur) {
        this.umur = umur;
    }
    public String getIpk() {
        return jenis_kelamin;
    }
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
}
