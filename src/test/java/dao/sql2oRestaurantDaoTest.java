package dao;

import models.Restaurant;
import models.Foodtype;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class sql2oRestaurantDaoTest {
	@Test
public void RestaurantReturnsFoodtypesCorrectly() throws Exception {
       Foodtype testFoodtype  = new Foodtype("Seafood");
       foodtypeDao.add(testFoodtype);

       Foodtype otherFoodtype  = new Foodtype("Bar Food");
       foodtypeDao.add(otherFoodtype);

       Restaurant testRestaurant = setupRestaurant();
       restaurantDao.add(testRestaurant);
       restaurantDao.addRestaurantToFoodtype(testRestaurant,testFoodtype);
       restaurantDao.addRestaurantToFoodtype(testRestaurant,otherFoodtype);

       Foodtype[] foodtypes = {testFoodtype, otherFoodtype}; //oh hi what is this? Observe how we use its assertion below.

       assertEquals(Arrays.asList(foodtypes), restaurantDao.getAllFoodtypesByRestaurant(testRestaurant.getId()));
   }
}