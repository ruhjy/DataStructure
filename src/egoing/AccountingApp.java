package egoing;

class Accounting {
	// 공급가액
	double valueOfSupply;
	// 부가가치세율
	static double vatRate = 0.1;

	Accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}

	double getVAT() {
		return valueOfSupply * vatRate;
	}

	double getTotal() {
		return valueOfSupply + getVAT();
	}
}

class AccountingApp {

	public static void main(String[] args) {

		Accounting a1 = new Accounting(10000.0);

		Accounting a2 = new Accounting(20000.0);

		System.out.println("Value of supply : " + a1.valueOfSupply);
		System.out.println("Value of supply : " + a2.valueOfSupply);

		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());

		System.out.println("Total : " + a1.getTotal());
		System.out.println("Total : " + a2.getTotal());

//		Accounting.valueOfSupply = 10000.0;
//		System.out.println("Value of supply : " + Accounting.valueOfSupply);
//		Accounting.valueOfSupply = 20000.0;
//		System.out.println("Value of supply : " + Accounting.valueOfSupply);
//		
//		Accounting.valueOfSupply = 10000.0;
//		System.out.println("VAT : " + Accounting.getVAT());
//		Accounting.valueOfSupply = 20000.0;
//		System.out.println("VAT : " + Accounting.getVAT());
//		
//		Accounting.valueOfSupply = 10000.0;
//		System.out.println("Total : " + Accounting.getTotal());
//		Accounting.valueOfSupply = 20000.0;
//		System.out.println("Total : " + Accounting.getTotal());
	}
}
