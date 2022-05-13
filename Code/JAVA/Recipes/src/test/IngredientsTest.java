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

}
