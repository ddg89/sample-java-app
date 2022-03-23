package com.example.demo.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity @Table(name = "articoli")
@NoArgsConstructor
@AllArgsConstructor
public class Articoli {

    @Getter @Setter
    @NotNull
    @Size(min = 1, max = 20)
    @Id
    @Column(name = "codart")
    String codart;

    @Getter @Setter
    @Size(min = 1, max = 80)
    @Column(name = "descrizione")
    String descrizione;

    @Getter @Setter
    @Size(min = 1, max = 2)
    @Column(name = "um")
    String um;

    @Getter @Setter
    @Column(name = "codstat")
    String codstat;

    @Getter @Setter
    @Column(name = "pzcart")
    int pzcart;

    @Getter @Setter
    @Column(name = "pesonetto")
    Double pesonetto;

    @Getter @Setter
    @Column(name = "idiva")
    int idiva;

    @Getter @Setter
    @Column(name = "idstatart")
    String idstatart;

    @Getter @Setter
    @Column(name = "datacreazione") @Temporal(TemporalType.TIMESTAMP)
    Date datacreazione;

    @Getter @Setter
    @Column(name = "idfamass")
    int idfamass;
}
