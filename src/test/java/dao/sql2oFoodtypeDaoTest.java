package dao;

import models.Foodtype;
import models.Restaurant;
import org.junit.Test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class sql2oFoodtypeDaoTest {
	
	@Test
public void addFoodTypeToRestaurantAddsTypeCorrectly() throws Exception {

   Restaurant testRestaurant = setupRestaurant();
   Restaurant altRestaurant = setupAltRestaurant();

   restaurantDao.add(testRestaurant);
   restaurantDao.add(altRestaurant);

   Foodtype testFoodtype = setupNewFoodtype();

   foodtypeDao.add(testFoodtype);

   foodtypeDao.addFoodtypeToRestaurant(testFoodtype, testRestaurant);
   foodtypeDao.addFoodtypeToRestaurant(testFoodtype, altRestaurant);

   assertEquals(2, foodtypeDao.getAllRestaurantsForAFoodtype(testFoodtype.getId()).size());
}
@Override
public List<Restaurant> getAllRestaurantsForAFoodtype(int foodtypeId) {

   ArrayList<Restaurant> restaurants = new ArrayList<>();

   String joinQuery = "SELECT restaurantid FROM restaurants_foodtypes WHERE foodtypeid = :foodtypeId";

   try (Connection con = sql2o.open()) {
       List<Integer> allRestaurantIds = con.createQuery(joinQuery)
               .addParameter("foodtypeId", foodtypeId)
               .executeAndFetch(Integer.class); //what is happening in the lines above?
       for (Integer restaurantId : allRestaurantIds){
           String restaurantQuery = "SELECT * FROM restaurants WHERE id = :restaurantId";
           restaurants.add(
                   con.createQuery(restaurantQuery)
                           .addParameter("restaurantId", restaurantId)
                           .executeAndFetchFirst(Restaurant.class));
       } //why are we doing a second sql query - set?
   } catch (Sql2oException ex){
       System.out.println(ex);
   }
   return restaurants;
}
@Override
public List<Restaurant> getAllRestaurantsForAFoodtype(int foodtypeId) {

   ArrayList<Restaurant> restaurants = new ArrayList<>();

   String joinQuery = "SELECT restaurantid FROM restaurants_foodtypes WHERE foodtypeid = :foodtypeId";

   try (Connection con = sql2o.open()) {
       List<Integer> allRestaurantIds = con.createQuery(joinQuery)
               .addParameter("foodtypeId", foodtypeId)
               .executeAndFetch(Integer.class); //what is happening in the lines above?
       for (Integer restaurantId : allRestaurantIds){
           String restaurantQuery = "SELECT * FROM restaurants WHERE id = :restaurantId";
           restaurants.add(
                   con.createQuery(restaurantQuery)
                           .addParameter("restaurantId", restaurantId)
                           .executeAndFetchFirst(Restaurant.class));
       } //why are we doing a second sql query - set?
   } catch (Sql2oException ex){
       System.out.println(ex);
   }
   return restaurants;
}

	
}