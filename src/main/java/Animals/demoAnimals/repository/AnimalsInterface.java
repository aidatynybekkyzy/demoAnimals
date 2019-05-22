package Animals.demoAnimals.repository;


import Animals.demoAnimals.model.Animals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalsInterface extends JpaRepository<Animals,Long> { // передаем клласс и тип ключа

}
