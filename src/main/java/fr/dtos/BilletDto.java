package fr.dtos;

import fr.entities.Concert;


public class BilletDto {
    private Integer id;
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
