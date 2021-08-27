package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task05;

import java.util.ArrayList;

public class View {
	public View() {
		
	}
	
	public void printAllvouchers(ArrayList<TravelVoucher> vouchers){

		
		System.out.println("voucherType; transferType; food; duration\n");
		
		for (TravelVoucher travelVoucher : vouchers) {
			System.out.println(travelVoucher.getVoucherType() + "; " + travelVoucher.getTransferType() + 
					"; " + travelVoucher.getFood() + "; " + travelVoucher.getDuration());
			
		}
	}
}
