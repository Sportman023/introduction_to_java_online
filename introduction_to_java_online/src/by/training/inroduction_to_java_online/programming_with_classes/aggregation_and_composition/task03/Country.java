package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task03;

import java.util.ArrayList;

public class Country {
	Logic logic;
	View view;
	private String name;
	private String countryCapitalName;
	private ArrayList<Region> regions;
	private int Area;
	
	{
		regions = new ArrayList<Region>();
	}
	
	public Country(Logic logic, View view) {
		this.logic = logic;
		this.view = view;
		logic.generateCountry(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCapitalName() {
		return countryCapitalName;
	}

	public void setCountryCapitalName(String capitalName) {
		this.countryCapitalName = capitalName;
	}

	public ArrayList<Region> getRegions() {
		return regions;
	}

	public void setRegions(ArrayList<Region> regions) {
		this.regions = regions;
	}

	
	public int getArea() {
		return Area;
	}


	public void setArea(int area) {
		Area = area;
	}
	
	
}
