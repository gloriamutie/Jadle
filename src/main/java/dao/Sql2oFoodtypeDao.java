package dao;

import models.Foodtype;
import models.Restaurant;
import org.sql2o.Sql2o;

import java.util.ArrayList;
import java.util.List;



public class Sql2oFoodtypeDao implements FoodtypeDao{
	
	private Sql2o sql2o;
	
    public Sql2oFoodtypeDao (Sql2o sql2o) {
	 this.sql2o = sql2o;
    }
  

@Override
public boolean equals (Object o) {
	return super.equals (o);
}

@Override
public int hashCode () {
	return super.hashCode ();
}

public Sql2oFoodtypeDao () {
	super ();
}

@Override
protected Object clone () throws CloneNotSupportedException {
	return super.clone ();
}

@Override
public String toString () {
	return super.toString ();
}

@Override
public void add (Foodtype foodtype) {

}

@Override
public List<Foodtype> getAll () {
	return null;
}

@Override
public void deleteById (int id) {

}

@Override
public void clearAll () {

}

@Override
public void addFoodtypeToRestaurant(Foodtype foodtype, Restaurant restaurant){
   //do stuff here.
}

@Override
public List<Restaurant> getAllRestaurantsForAFoodtype(int foodtypeId) {
   List<Restaurant> restaurants = new ArrayList ();
   return restaurants;
}
}
