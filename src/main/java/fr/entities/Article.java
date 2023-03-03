package fr.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {

    private String id;
    private String auteur;
    private String nom;
    private long date;
    private String url;

    private String text;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
