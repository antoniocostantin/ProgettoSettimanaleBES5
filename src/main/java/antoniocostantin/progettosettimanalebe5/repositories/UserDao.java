package antoniocostantin.progettosettimanalebe5.repositories;

import antoniocostantin.progettosettimanalebe5.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
