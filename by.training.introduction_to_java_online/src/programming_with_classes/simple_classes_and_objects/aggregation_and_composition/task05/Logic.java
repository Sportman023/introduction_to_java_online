package programming_with_classes.simple_classes_and_objects.aggregation_and_composition.task05;

import java.util.ArrayList;
import java.util.Scanner;

public class Logic {
	
	public Logic() {
		
	}
	
	public void generateVoucher(TouristAgency agency) {
		TravelVoucher voucher;
		int voucherQnt = 5;
		
		for (int i = 0; i < 5; i++) {
			voucher = new TravelVoucher(agency);
			voucher.setDuration(generateDuration());
			voucher.setFood(generatefood());
			voucher.setTransferType(generateTransferType());
			voucher.setVoucherType(generateVoucherType());
			
		}
	}
	
	public String generateVoucherType() {
		String[] voucherTypes = {"rest", "excursions", "treatment", "shopping", "cruise"};
		String voucherType;
		int randomIndex;
		randomIndex = (int)(Math.random() * voucherTypes.length);
		voucherType = voucherTypes[randomIndex];
		return voucherType;		
	}
	
	public String generateTransferType() {
		String[] transferTypes = {"bus", "plane", "bus shuttle", "ship", "car"};
		String transferType;
		int randomIndex;
		randomIndex = (int)(Math.random() * transferTypes.length);
		transferType = transferTypes[randomIndex];
		return transferType;
	}
	
	public String generatefood() {
		String[] foods = {"All inclusive", "Only breakfast"};
		String food;
		int randomIndex = (int)(Math.random() * foods.length);
		return foods[randomIndex];
	}
	
	public int generateDuration() {
		final int MAX_DURATION = 21;
		final int MIN_DURATION = 5;
		int diff = MAX_DURATION - MIN_DURATION + 1;
		int duration;
		duration = (int)(Math.random() * diff + MIN_DURATION);
		return duration;
	}
	
	public ArrayList<TravelVoucher> filterVouchers(TouristAgency agency) {
		ArrayList<TravelVoucher> vouchers;
		ArrayList<TravelVoucher> filteredVouchers;
		String userTransferType;
		String userFood;
		int userDuration;
		vouchers = agency.getVouchers();
		filteredVouchers = new ArrayList<TravelVoucher>();
		
		userTransferType = userInputString("Enter transfer type");
		userFood = userInputString("Enter food type");
		userDuration = userInputInt("Enter duration");
		
		for (TravelVoucher travelVoucher : vouchers) {
			
			if (travelVoucher.getTransferType().equals(userTransferType) && 
					travelVoucher.getFood().equals(userFood) && travelVoucher.getDuration() == userDuration ) {
				filteredVouchers.add(travelVoucher);

			}
		}
		return filteredVouchers;
	}
	
	private String userInputString(String message) {
		String userInput;
		System.out.println(message);
		Scanner input = new Scanner(System.in);
		userInput = input.nextLine();
		return userInput;
	}
	
	private int userInputInt(String message) {
		int userInput;
		System.out.println(message);
		Scanner input = new Scanner(System.in);
		userInput = input.nextInt();
		return userInput;
	}
	
}