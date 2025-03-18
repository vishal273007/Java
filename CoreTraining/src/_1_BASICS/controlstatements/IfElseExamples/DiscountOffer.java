// if else program to check bill if the cost is eligible for discount.

package _1_BASICS.controlstatements.IfElseExamples;

public class DiscountOffer {

	void billing(int units) {
		int final_bill = units * 100;

		if (final_bill >= 1000) {
			int discount = (final_bill / 100) * 10;
			System.out.println("Your bill is " + (final_bill - discount));
			System.out.println("Your discount " + discount);
		}

		else {
			System.out.println("Total bill: " + final_bill);
			System.out.println("Purchase more " + (1000 - final_bill) + " to avail discount.");
		}
	}

	public static void main(String[] args) {
		DiscountOffer aobj = new DiscountOffer();
//		aobj.billing(8);
		aobj.billing(11);
	}
}
