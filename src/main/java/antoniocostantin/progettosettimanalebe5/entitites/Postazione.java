package antoniocostantin.progettosettimanalebe5.entitites;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int max_occupanti;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private String indirizzo;
    private String citta;
    @ManyToMany(mappedBy = "postazioni")
    private List<Prenotazione> prenotazioni;

    // getter e setter


    public int getId() {
        return id;
    }

    public int getMax_occupanti() {
        return max_occupanti;
    }

    public void setMax_occupanti(int max_occupanti) {
        this.max_occupanti = max_occupanti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public List<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(List<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }
// costruttori


    public Postazione(int max_occupanti, String nome, Tipo tipo, String indirizzo, String citta, List<Prenotazione> prenotazioni) {
        this.max_occupanti = max_occupanti;
        this.nome = nome;
        this.tipo = tipo;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.prenotazioni = prenotazioni;
    }

    public Postazione(int max_occupanti, String nome, Tipo tipo, String indirizzo, String citta) {
        this.max_occupanti = max_occupanti;
        this.nome = nome;
        this.tipo = tipo;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public Postazione() {
    }

    // tostring

    @Override
    public String toString() {
        return "Postazione{" +
                "id=" + id +
                ", max_occupanti=" + max_occupanti +
                ", nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", indirizzo='" + indirizzo + '\'' +
                ", citta='" + citta + '\'' +
                '}';
    }
}
