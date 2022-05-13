package Test;

import Classes.IngredienstClass;
import org.junit.Assert;
import org.junit.Test;

public class IngredientsTest {

    @Test
    public void getIngredientsNameSameIngredient()
    {
        IngredienstClass testIngredients = new IngredienstClass("testIngredientName", 1);
        Assert.assertEquals("testIngredientName", testIngredients.getingredientsName());
    }

    @Test
    public void getIngredientsNameOtherIngredient()
    {
        IngredienstClass testIngredients = new IngredienstClass("testIngredientName", 1);
        Assert.assertNotEquals("otherIngredietsName", testIngredients.getingredientsName());
    }

    @Test
    public void getPositiveAmount(){
        IngredienstClass testAmount = new IngredienstClass("Alma", 2);
        Assert.assertEquals(2, testAmount.getAmount());
    }

    @Test
    public void getNegativeAmount(){
        IngredienstClass testAmount = new IngredienstClass("Alma", 10);
        Assert.assertNotEquals(9, testAmount.getAmount());
    }

}
