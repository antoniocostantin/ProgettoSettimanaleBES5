package antoniocostantin.progettosettimanalebe5;

import antoniocostantin.progettosettimanalebe5.entitites.Postazione;
import antoniocostantin.progettosettimanalebe5.entitites.Prenotazione;
import antoniocostantin.progettosettimanalebe5.entitites.Tipo;
import antoniocostantin.progettosettimanalebe5.entitites.User;
import antoniocostantin.progettosettimanalebe5.services.PostazioneService;
import antoniocostantin.progettosettimanalebe5.services.PrenotazioneService;
import antoniocostantin.progettosettimanalebe5.services.UserService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@SpringBootApplication
public class Progettosettimanalebe5Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = (AnnotationConfigApplicationContext) SpringApplication.run(Progettosettimanalebe5Application.class, args);
        PostazioneService postazioneService = ctx.getBean(PostazioneService.class);
        UserService userService = ctx.getBean(UserService.class);
        PrenotazioneService prenotazioneService = ctx.getBean(PrenotazioneService.class);
        Faker faker = new Faker();
        Random r = new Random();

        Prenotazione p = new Prenotazione(LocalDate.now(), List.of(userService.findById(4).orElseThrow()), List.of(postazioneService.getPostazioneById(9).orElseThrow()));
        prenotazioneService.save(p);


    }

}
