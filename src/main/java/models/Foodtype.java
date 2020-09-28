package models;

import java.util.Objects;

public class Foodtype {
private int id;
private String name;

public Foodtype (String name) {
	this.name = name;
}

public String getName () {
	return name;
}

public void setName (String name) {
	this.name = name;
}

@Override
public boolean equals (Object o) {
	if (this == o)
		return true;
	if (o == null || getClass () != o.getClass ())
		return false;
	Foodtype foodtype = (Foodtype) o;
	return id == foodtype.id &&
			       Objects.equals (name, foodtype.name);
}

@Override
public int hashCode () {
	return Objects.hash (id, name);
}


}
