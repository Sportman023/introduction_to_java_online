package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task03;

import java.util.ArrayList;

public class View {
	public View() {
		
	}
	
	public void printCapital(Country country) {
		System.out.println("Столица: " + country.getCountryCapitalName());
	}
	public void printRegionsQuantity(Country country) {
		int regionsQuantity;
		regionsQuantity = country.getRegions().size();
		System.out.println("Кол-во областей: "+ regionsQuantity);
	}
	public void printRegionsCapital(Country country) {
		ArrayList<Region> regionList;
		regionList = country.getRegions();
		System.out.println("Список областных городов: ");
		for (int i = 0; i < regionList.size(); i++) {
			System.out.println((i + 1) +  ". " + regionList.get(i).getRegionCapitalName());
		}
	}
	public void printCountryArea(Country country) {
		System.out.println("Площадь страны: " + country.getArea() + " м.кв.");
	}
}
