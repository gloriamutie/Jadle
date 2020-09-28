package dao;

import models.Foodtype;
import models.Restaurant;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.ArrayList;
import java.util.List;

public class Sql2oRestaurantDao implements RestaurantDao {

@Override
public void add (Restaurant restaurant) {

}

@Override
public List<Restaurant> getAll () {
	return null;
}

@Override
public Restaurant findById (int id) {
	return null;
}

@Override
public void update (int id, String name, String address, String zipcode, String phone, String website, String email) {

}

@Override
public void deleteById (int id) {

}

@Override
public void clearAll () {

}

@Override
public void addRestaurantToFoodtype(Restaurant restaurant, Foodtype foodtype){
//do stuff here.
}

@Override
public List<Foodtype> getAllFoodtypesByRestaurant(int restaurantId){
    List<Foodtype> foodtypes = new ArrayList (); //empty list
    return foodtypes;
}
}
