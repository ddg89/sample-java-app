package com.example.demo.entities;

import com.sun.istack.NotNull;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.Date;

@Entity @Table(name = "articoli")
@NoArgsConstructor
@AllArgsConstructor
public class Campi {

    @Getter @Setter
    @NotNull @Id
    @Column(name = "codart")
    String codart;
    @Getter @Setter
    @Column(name = "descrizione")
    String descrizione;
    @Getter @Setter
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
    int pesonetto;
    @Getter @Setter
    @Column(name = "idiva")
    int idiva;
    @Getter @Setter
    @Column(name = "idstatart")
    char idstatart;
    @Getter @Setter
    @Column(name = "datacreazione") @Temporal(TemporalType.TIMESTAMP)
    Date datacreazione;
    @Getter @Setter
    @Column(name = "idfamass")
    int idfamass;


}
