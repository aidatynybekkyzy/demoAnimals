package Animals.demoAnimals.controller;

import Animals.demoAnimals.model.Animals;
import Animals.demoAnimals.service.AnimalService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// controller - точка входа в наше приложение
@RestController //
@RequestMapping(AnimalsController.URLANIMALS)
public class AnimalsController {
    private  final AnimalService animalService;
    public static  final String URLANIMALS = "/api/v1/animals";

    public AnimalsController(AnimalService animalService) {
        this.animalService=animalService;
    }
    @GetMapping
    public List<Animals> getAnimals(){
        return animalService.findAllAnimals();
    }

    @GetMapping("/{id}") //
    public Animals getAnimalsById(@PathVariable Long id){
        return animalService.animalsId(id);
    }

    @PostMapping //@PostMaping - добавление страны(обьекта)
    @ResponseStatus(HttpStatus.CREATED)
    public Animals saveAnimals(@RequestBody Animals animals){ // метод чтобы принимать занчения или обьекты с постмена
        return animalService.saveAnimals(animals);
    }
    }
/*@RequestMapping -  нужен чтобы после отработки вернул ответ
@ResponseStatus - (HTTPStatus) - для получения http ответа (404,500)*/
