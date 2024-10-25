package antoniocostantin.progettosettimanalebe5.services;

import antoniocostantin.progettosettimanalebe5.entitites.Postazione;
import antoniocostantin.progettosettimanalebe5.entitites.Tipo;
import antoniocostantin.progettosettimanalebe5.repositories.PostazioneDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Postazione> getByType(String type) {
        Tipo tipo = Tipo.valueOf(type);
        if(!(tipo instanceof Tipo)) System.out.println("Tipo non valido");
        return postazioneDao.findByTipo(tipo);
    }

    public List<Postazione> getByCity(String city) {
        return postazioneDao.findByCitta(city);
    }

}
