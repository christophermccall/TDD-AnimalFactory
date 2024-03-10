package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest(){
        //Given
        CatHouse.clear();
        int expectedNumOfCats = 1;
        //When
        CatHouse.add(new Cat());
       int actualNumOfCats =  CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedNumOfCats,actualNumOfCats);
    }

    @Test
    public void removeCatByIdTest(){
        CatHouse.clear();
        //Given
        int expectedNumOfCats = 0;
        //When
        CatHouse.add(new Cat(562412));
        CatHouse.remove(562412);
        int actualNumOfCats = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedNumOfCats,actualNumOfCats);

    }


    @Test
    public void removeCatTest(){
        CatHouse.clear();
        //Given
        Cat charlieTheCat = new Cat();
        int expectedNumOfCats = 0;
        //When
        CatHouse.add(charlieTheCat);

        CatHouse.remove(charlieTheCat);

        int actualNumOfCats = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedNumOfCats,actualNumOfCats);

    }


    @Test
    public void getCatByIdTest(){
        CatHouse.clear();
        //Given
        String givenCatName = "charlie";
        //When
        CatHouse.add(new Cat(givenCatName,new Date(1992),78));

        String actualCatName = CatHouse.getCatById(78).getName();
        //Then
        Assert.assertEquals(givenCatName,actualCatName);

    }

    @Test
    public void getNumOfCatsTest(){
        CatHouse.clear();
        //Given
        int expectedNumOfCats = 1;
        //When
        CatHouse.add(new Cat());
        int actualNumOfCats =  CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedNumOfCats,actualNumOfCats);
    }

}
