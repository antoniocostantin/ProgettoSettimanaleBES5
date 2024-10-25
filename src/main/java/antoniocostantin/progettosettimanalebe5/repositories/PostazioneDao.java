package antoniocostantin.progettosettimanalebe5.repositories;

import antoniocostantin.progettosettimanalebe5.entitites.Postazione;
import antoniocostantin.progettosettimanalebe5.entitites.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneDao extends JpaRepository<Postazione, Integer> {
    public List<Postazione> findByTipo(Tipo tipo);

    List<Postazione> findByCitta(String city);
}
