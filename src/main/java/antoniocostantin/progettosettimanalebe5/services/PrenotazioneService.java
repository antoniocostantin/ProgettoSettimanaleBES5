package antoniocostantin.progettosettimanalebe5.services;

import antoniocostantin.progettosettimanalebe5.entitites.Postazione;
import antoniocostantin.progettosettimanalebe5.entitites.Prenotazione;
import antoniocostantin.progettosettimanalebe5.entitites.User;
import antoniocostantin.progettosettimanalebe5.repositories.PrenotazioneDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Service
public class PrenotazioneService {
    @Autowired
    PrenotazioneDao prenotazioneDao;

    public void save(Prenotazione prenotazione) {
        boolean userControll = false;
        for(User user : prenotazione.getUsers()) {
            for(Postazione postazione : prenotazione.getPostazioni()){
                if(postazione.getMax_occupanti() > numPren(prenotazione) && this.getByUserAndData(user, prenotazione.getData()).isEmpty() ){

                }
            }

        }

        if (userControll) {
            prenotazioneDao.save(prenotazione);
            System.out.println("Prenotazione " + prenotazione + " saved");
        }else System.out.println("Prenotazione " + prenotazione + " not saved");
    }

    public void addUser(User user) {

    }

    public Prenotazione getPrenotazioneById(int id) {
        return prenotazioneDao.findById(id).get();
    }

    public List<Prenotazione> getByUserAndData (User user, LocalDate data) {
        return prenotazioneDao.findByDataAndUsers(data, user);
    }

    public List<Prenotazione> getByUser(User user) {
        return prenotazioneDao.findByUsers(user);
    }

    public int numPren (Prenotazione prenotazione) {
        return prenotazione.getUsers().size();
    }

    public void deletebyId(int id) {
        prenotazioneDao.deleteById(id);
    }

}
