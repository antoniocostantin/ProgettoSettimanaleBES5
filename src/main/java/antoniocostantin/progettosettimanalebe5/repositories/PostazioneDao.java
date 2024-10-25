package antoniocostantin.progettosettimanalebe5.repositories;

import antoniocostantin.progettosettimanalebe5.entitites.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneDao extends JpaRepository<Postazione, Integer> {
}
