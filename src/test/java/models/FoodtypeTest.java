package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoodtypeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        Foodtype testFoodtype = setupFoodtype();
        assertEquals("dessert", testFoodtype.getName());
    }

    @Test
    public void setName() {
        Foodtype testFoodtype = setupFoodtype();
        testFoodtype.setName("breakfast");
        assertNotEquals("dessert", testFoodtype.getName());
    }
    

    // helper
    public Foodtype setupFoodtype(){
        return new Foodtype("dessert");
    }
}
