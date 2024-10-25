package antoniocostantin.progettosettimanalebe5.repositories;

import antoniocostantin.progettosettimanalebe5.entitites.Prenotazione;
import antoniocostantin.progettosettimanalebe5.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneDao extends JpaRepository<Prenotazione, Integer> {
    List<Prenotazione> findByUsers(User user);
    
    List<Prenotazione> findByDataAndUsers(LocalDate data, User user);
}
