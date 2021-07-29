package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects.aggregation_and_composition.task05;

import java.util.ArrayList;

public class TravelVoucher {
	private TouristAgency agency;
	private String voucherType;
	private String transferType;
	private String food;
	private int duration;
	public TravelVoucher(TouristAgency agency) {
		this.agency = agency;
		agency.getVouchers().add(this);
	}
	public TouristAgency getAgency() {
		return agency;
	}
	public void setAgency(TouristAgency agency) {
		this.agency = agency;
	}
	public String getVoucherType() {
		return voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	

	
}
