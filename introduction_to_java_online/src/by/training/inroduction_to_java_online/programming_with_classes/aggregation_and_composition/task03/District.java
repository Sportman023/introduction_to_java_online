package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task03;

import java.util.ArrayList;

public class District {
	private Region region;
	private String name;
	private String districtCapitalName;
	private ArrayList<City> cities;
	
	{
		cities = new ArrayList<City>();
	}
	
	public District(Region region) {
		this.region = region;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistrictCapitalName() {
		return districtCapitalName;
	}

	public void setDistrictCapitalName(String districtCapitalName) {
		this.districtCapitalName = districtCapitalName;
	}

	public ArrayList<City> getCities() {
		return cities;
	}

	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}
	
	
}
