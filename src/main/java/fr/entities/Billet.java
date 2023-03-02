package fr.entities;

import javax.persistence.*;

@Entity
public class Billet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bil_id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "T_CONCERT_con_id")
    private Concert concert;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Concert getConcert() {
        return concert;
    }

    public void setConcert(Concert concert) {
        this.concert = concert;
    }
}
