package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task03;

public class City {
	private District district;
	private String name;

	public City(District district) {
		this.district = district;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
