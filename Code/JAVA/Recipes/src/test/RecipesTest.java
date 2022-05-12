package test;

import Observer.RecipesClass;
import org.junit.Test;
import org.junit.Assert;
import recipes_gui.Recipes;

public class RecipesTest {

    @Test
    public void getRecipeName(){
        RecipesClass testRecipe = new RecipesClass("testRecipeName", "testFreeFromName", "testText");
        Assert.assertEquals("testRecipeName", testRecipe.getRecipeName());
    }
}
