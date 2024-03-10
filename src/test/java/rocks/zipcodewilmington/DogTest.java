package rocks.zipcodewilmington;

import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);

        String givenName = "Milo";


        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }



    @Test
    public void constructorTest(){
        //Given Dog Data
        String givenName = "Honey";
        Date givenBirthDate = new Date(1999-5-12);
        Integer givenId = 38738;


        //When
        Dog dog = new Dog(givenName,givenBirthDate,givenId);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        //Then
        Assert.assertEquals(givenName,retrievedName);
        Assert.assertEquals(givenBirthDate,retrievedBirthDate);
        Assert.assertEquals(givenId,retrievedId);

    }



    @Test
    public void setBirthDateTest(){
        Dog dog = new Dog(null,null,null);

        //Given
        Date givenBrthDate = new Date(1987-9-27);

        //When
        dog.setBirthDate(givenBrthDate);
        Date actualBirthDate = dog.getBirthDate();

        //Then
        Assert.assertEquals(givenBrthDate,actualBirthDate);

    }



    @Test
    public void speakTest(){
        Dog dog = new Dog(null,null,null);
        //Given
        String expectedSound = "bark!";
        //When
        String actualSound = dog.speak();
        //Then
        Assert.assertEquals(expectedSound,actualSound);

    }



    @Test
    public void eatTest(){
        Dog dog = new Dog(null,null,null);
        //Given
        int expectedMealCount = 1;
        //When
        dog.eat(new Food());
        int actualMealCount = dog.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expectedMealCount,actualMealCount);
    }



    @Test
    public void getIdTest(){
        Dog dog = new Dog(null,null,3121);
        //Given
        Integer expectedId = 3121;
        //When
        Integer actualId = dog.getId();
        //Then
        Assert.assertEquals(expectedId,actualId);
    }



    @Test
    public void animalInstanceTest(){
        Dog dog = new Dog(null,null,null);
        //Given
        boolean isExpectedAnimal = true;
        //When
        boolean actuallyAnAnimal = dog instanceof Animal;
        //Then
        Assert.assertEquals(isExpectedAnimal,actuallyAnAnimal);
    }



    @Test
    public void mammalInstanceTest(){
        Dog dog = new Dog(null,null,null);
        //Given
        boolean isExpectedMammal = true;
        //When
        boolean actuallyAMammal = dog instanceof Mammal;
        //Then
        Assert.assertEquals(isExpectedMammal,actuallyAMammal);
    }


}
