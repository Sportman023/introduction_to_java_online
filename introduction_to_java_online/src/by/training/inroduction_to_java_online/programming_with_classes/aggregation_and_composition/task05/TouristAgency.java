package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task05;

import java.util.ArrayList;

public class TouristAgency {
	private ArrayList<TravelVoucher> vouchers;

	public TouristAgency() {
		vouchers = new ArrayList<TravelVoucher>();
	}

	public ArrayList<TravelVoucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(ArrayList<TravelVoucher> vouchers) {
		this.vouchers = vouchers;
	}
}
