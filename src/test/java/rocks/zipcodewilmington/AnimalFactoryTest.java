package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        //Given
        String givenName = "Pancake";
        Date givenBirthDate = new Date(2005-6-27);
        //When
        Dog dog = AnimalFactory.createDog(givenName,givenBirthDate);
        String createdDogName = dog.getName();
        Date createdDogBirthDate = dog.getBirthDate();
        //Then
        Assert.assertEquals(givenName,createdDogName);
        Assert.assertEquals(givenBirthDate,createdDogBirthDate);

    }



    @Test
    public void createCatTest(){
        //Given
        String givenName = "Arnold";
        Date givenBirthDate = new Date(2020-9-12);
        //When
        Cat cat = AnimalFactory.createCat(givenName,givenBirthDate);
        String createdCatName = cat.getName();
        Date createdCatBirthDate = cat.getBirthDate();
        //Then
        Assert.assertEquals(givenName,createdCatName);
        Assert.assertEquals(givenBirthDate,createdCatBirthDate);

    }
}
