package fr.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "article")
public class ArticleDto {
    @Id
    private String id;
    private String auteur;
    private long date;
    private String url;
    private int entite_id;
    private String entite_type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getEntite_id() {
        return entite_id;
    }

    public void setEntite_id(int entite_id) {
        this.entite_id = entite_id;
    }

    public String getEntite_type() {
        return entite_type;
    }

    public void setEntite_type(String entite_type) {
        this.entite_type = entite_type;
    }
}
