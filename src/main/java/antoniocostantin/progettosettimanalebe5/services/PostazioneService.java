package antoniocostantin.progettosettimanalebe5.services;

import antoniocostantin.progettosettimanalebe5.entitites.Postazione;
import antoniocostantin.progettosettimanalebe5.repositories.PostazioneDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostazioneService {
    @Autowired
    PostazioneDao postazioneDao;

    public void save(Postazione postazione) {
        postazioneDao.save(postazione);
        System.out.println("Postazione " + postazione + " saved");
    }

    public Optional<Postazione> getPostazioneById(int id) {
        return postazioneDao.findById(id);
    }

    public void deletePostazione(int id) {
        System.out.println("Postazione " + postazioneDao.findById(id) + " deleted");
        postazioneDao.deleteById(id);
    }

}
