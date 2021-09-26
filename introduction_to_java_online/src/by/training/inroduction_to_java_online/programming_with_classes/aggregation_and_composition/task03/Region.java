package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task03;

import java.util.ArrayList;

public class Region {
	private Country country;
	private String name;
	private String regionCapitalName;
	private ArrayList<District> districts;

	{
		districts = new ArrayList<District>();
	}

	public Region(Country country) {
		this.country = country;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegionCapitalName() {
		return regionCapitalName;
	}

	public void setRegionCapitalName(String regionCapitalName) {
		this.regionCapitalName = regionCapitalName;
	}

	public ArrayList<District> getDistricts() {
		return districts;
	}

	public void setDistricts(ArrayList<District> districts) {
		this.districts = districts;
	}

}
