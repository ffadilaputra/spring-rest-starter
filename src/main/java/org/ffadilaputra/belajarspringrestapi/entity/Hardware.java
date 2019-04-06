package org.ffadilaputra.belajarspringrestapi.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


@Setter
@Getter
@Entity
public class Hardware {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "tipe")
    private String tipe;

    @Column(name = "merk")
    private String merk;

    @Column(name = "harga")
    private Long harga;

    @Column(name = "jenis_garansi")
    private String jenisGaransi;


}
