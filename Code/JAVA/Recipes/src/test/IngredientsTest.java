package test;

import Observer.IngredienstClass;
import org.junit.Assert;
import org.junit.Test;

public class IngredientsTest {

    @Test
    public void getIngredientsName()
    {
        IngredienstClass testIngredients = new IngredienstClass("testIngredientsName");
        Assert.assertEquals("testIngredientsName", testIngredients.getingredientsName());
    }

    @Test
    public void getIngredientsName1()
    {
        IngredienstClass testIngredients = new IngredienstClass("testIngredientsName");
        Assert.assertNotEquals("otherIngredientsName", testIngredients.getingredientsName());
    }

}
