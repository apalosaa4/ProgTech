package test;

import Exceptions.RecipesNameCannotBeEmptyException;
import Exceptions.RecipesNameTooShortException;
import Exceptions.RecipesDescriptionCannotBeEmptyException;
import Exceptions.RecipesDescriptionTooShortException;
import Observer.RecipesClass;
import org.junit.Test;
import org.junit.Assert;
import recipes_gui.Recipes;

public class RecipesTest
{

    @Test
    public void getRecipeName()
    {
        RecipesClass testRecipe = new RecipesClass("testRecipeName", "testFreeFromName", "testText");
        Assert.assertEquals("testRecipeName", testRecipe.getRecipeName());
    }

    @Test
    public void getFreefromName()
    {

    }

    @Test
    public void getDescription()
    {

    }

    @Test
    public void RecipesNameCannotBeEmptyException()
    {
        Exception exception = Assert.assertThrows(RecipesNameCannotBeEmptyException.class, () ->{
            RecipesClass testRecipes = new RecipesClass("", "testFreeFromName", "testText");
        });
    }

    @Test
    public void RecipesNameTooShortException()
    {
        Exception exception = Assert.assertThrows(RecipesNameTooShortException.class, () ->{
            RecipesClass testRecipes = new RecipesClass("testRec", "testFreeFromName", "testText");
        });
    }

    @Test
    public void RecipesDescriptionCannotBeEmptyException()
    {

    }

    @Test
    public void RecipesDescriptionTooShortException()
    {

    }
}
