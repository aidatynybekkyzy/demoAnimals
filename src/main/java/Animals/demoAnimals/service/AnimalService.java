package Animals.demoAnimals.service;

import Animals.demoAnimals.model.Animals;

import java.util.List;

//Сервис нужен для работы с бд , с сервисами будут работать ресурсы можно указать все что угодно. сервис это прослока которая взаимодействует сресурами

public interface AnimalService {
    List<Animals> findAllAnimals();
    Animals animalsId(Long id);
    Animals saveAnimals(Animals animals);

}
