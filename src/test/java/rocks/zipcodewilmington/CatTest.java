package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        //Given
        Cat cat = new Cat();
        String expected = "Charlie";
        //When
        cat.setName(expected);
        String actual = cat.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void setBirthDateTest(){
        //Given
        Cat cat = new Cat();
        Date expected = new Date(1994-5-24);
        //When
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();

        //Then
        Assert.assertEquals(expected,actual);
    }



    @Test
    public void speakTest(){
        //Given
        Cat cat = new Cat();
        String expected = "meow!";
        //When

        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }



    @Test
    public void eatTest(){

        Cat cat = new Cat();
        Food tuna = new Food();

        //Given
        int expectedMealsEaten = 1;

        //When
        cat.eat(tuna);


        int actual = cat.getNumberOfMealsEaten();


        //Then
        Assert.assertEquals(expectedMealsEaten,actual);
    }


    @Test
    public void idTest(){
        Cat cat = new Cat(1772);


        //Given
        int expectedId = 1772;

        //When


        int actualId = cat.getId();


        //Then
        Assert.assertEquals(expectedId,actualId);
    }


    @Test
    public void instanceOfAnimalTest(){

        Cat cat = new Cat();

        //Given
        boolean expectedTrueOrFalseAnimalInstance = true;
        //When
        boolean actualTrueOrFalseAnimalInstance = cat instanceof Animal;
        //Then
        Assert.assertEquals(expectedTrueOrFalseAnimalInstance,actualTrueOrFalseAnimalInstance);
    }


    @Test
    public void instanceOfMammalTest(){

        Cat cat = new Cat();

        //Given
        boolean expectedTrueOrFalseMammalInstance = true;
        //When
        boolean actualTrueOrFalseMammalInstance = cat instanceof Mammal;
        //Then
        Assert.assertEquals(expectedTrueOrFalseMammalInstance,actualTrueOrFalseMammalInstance);
    }

}
