package antoniocostantin.progettosettimanalebe5.entitites;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate data;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "prenotazione_postazione",
            joinColumns = @JoinColumn(name = "prenotazione_id"),
            inverseJoinColumns = @JoinColumn(name = "postazione_id")
    )
    private List<Postazione> postazioni;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "prenotazione_user",
            joinColumns = @JoinColumn(name = "prenotazione_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users;

    // setter e getter

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Postazione> getPostazioni() {
        return postazioni;
    }

    public void setPostazioni(List<Postazione> postazioni) {
        this.postazioni = postazioni;
    }


    // costruttori

    public Prenotazione(LocalDate data, List<User> users, List<Postazione> postazioni) {
        this.data = data;
        this.users = users;
        this.postazioni = postazioni;
    }

    public Prenotazione() {
    }

    // tostring

    @Override
    public String toString() {
        return "Prenotazione{" +
                "id=" + id +
                ", data=" + data +
                ", postazioni=" + postazioni +
                ", users=" + users +
                '}';
    }
}
