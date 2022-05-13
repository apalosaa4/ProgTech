package test;

import Exceptions.RecipesNameCannotBeEmptyException;
import Exceptions.RecipesNameTooShortException;
import Classes.RecipesClass;
import org.junit.Test;
import org.junit.Assert;

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
        RecipesClass testFreefromName = new RecipesClass("testFreefromName", "testFreefromName", "testText");
        Assert.assertEquals("testFreefromName", testFreefromName.getFreefromName());
    }

    @Test
    public void getDescription()
    {
        RecipesClass testDescription = new RecipesClass("testDesc", "testFreefromName", "This is a test description.");
        Assert.assertEquals("This is a test description.", testDescription.getDescription());
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
