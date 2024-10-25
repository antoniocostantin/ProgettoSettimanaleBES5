package antoniocostantin.progettosettimanalebe5.entitites;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String nome_cognome;
    private String email;
    @ManyToMany(mappedBy = "users")
    private List<Prenotazione> prenotazioni;


    //getter e setter

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome_cognome() {
        return nome_cognome;
    }

    public void setNome_cognome(String nome_cognome) {
        this.nome_cognome = nome_cognome;
    }

    public List<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(List<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }


    // costruttori


    public User(String username, String nome_cognome, String email) {
        this.username = username;
        this.nome_cognome = nome_cognome;
        this.email = email;
    }

    public User() {
    }

    public User(List<Prenotazione> prenotazioni, String email, String nome_cognome, String username) {
        this.prenotazioni = prenotazioni;
        this.email = email;
        this.nome_cognome = nome_cognome;
        this.username = username;
    }

    // to string


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nome_cognome='" + nome_cognome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
