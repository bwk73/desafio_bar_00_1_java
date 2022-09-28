package entities;

public class Bill {
	
	public double beerPrice = 5.0;
	public double softDrinkPrice = 3.0;
	public double barbacuePrice = 7.0;
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		if(feeding() > 30.0) {
			return 0.0;
		}
		else {
			return 4.0;
		}
	}
	
	public double feeding() {
		return beerPrice * beer + softDrinkPrice * softDrink + barbacuePrice * barbecue;
	}

	public double ticket() {
		if(gender == 'M') {
				return 10.0;
		}
		else {
			return 8.0;
		}
	}
	
	public double total() {
		return cover() + feeding() + ticket();
	}
}
