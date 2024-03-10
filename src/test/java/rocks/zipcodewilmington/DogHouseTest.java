package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        DogHouse.clear();
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }


    @Test
    public void removeDogsByIdTest(){
        DogHouse.clear();
        //Given
        int expectedNumOfDogs = 0;
        //When
        DogHouse.add(new Dog(null,null,562412));
        DogHouse.remove(562412);
        int actualNumOfDogs = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedNumOfDogs,actualNumOfDogs);

    }


    @Test
    public void removeDogTest(){
        DogHouse.clear();
        //Given
        Dog samTheDog = new Dog("Sam",null,null);
        int expectedNumOfDogs = 0;
        //When
        DogHouse.add(samTheDog);

        DogHouse.remove(samTheDog);

        int actualNumOfDogs = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedNumOfDogs,actualNumOfDogs);

    }


    @Test
    public void getDogByIdTest(){
        DogHouse.clear();
        //Given
        String givenDogName = "Manny";
        //When
        DogHouse.add(new Dog(givenDogName,new Date(1992),78));

        String actualDogName = DogHouse.getDogById(78).getName();
        //Then
        Assert.assertEquals(givenDogName,actualDogName);

    }

    @Test
    public void getNumOfDogsTest(){
        DogHouse.clear();
        //Given
        int expectedNumOfDogs = 1;
        //When
        DogHouse.add(new Dog(null,null,null));
        int actualNumOfDogs =  DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedNumOfDogs,actualNumOfDogs);
    }

}
