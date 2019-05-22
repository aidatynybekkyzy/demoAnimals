package Animals.demoAnimals.bootstrap;

import Animals.demoAnimals.model.Animals;
import Animals.demoAnimals.repository.AnimalsInterface;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AnimalsBootstrap implements CommandLineRunner { //интерфейс для сччитаниявания данных с командной строки
    private  final AnimalsInterface animalsInterface;

    public AnimalsBootstrap(AnimalsInterface animalsInterface) {
        this.animalsInterface = animalsInterface;
    }
    @Override
    public void run(String...args) throws Exception{
         Animals dog = new Animals("Pumba",45.0);
         Animals cat = new Animals("Tom",45.0);
         Animals wolf = new Animals("Wolf",50.0) ;
         Animals fox = new Animals("Foxy",60.0);
         Animals pig = new Animals("Piggy",15.0);
         Animals cow = new Animals("Cow",15.0);
         animalsInterface.save(dog);
         animalsInterface.save(fox);
         animalsInterface.save(pig);
         animalsInterface.save(cat);
         animalsInterface.save(wolf);
         animalsInterface.save(cow);
    }
}
