

public class Calc {
	void calculate(Product[] array){
		for(int i=0; i<array.length; i++) {
			int sell = array[i].getQuantity() * array[i].getSellmoney();
			int buy = array[i].getQuantity() * array[i].getBuymoney();
			array[i].setProfit(sell - (buy+array[i].getFee()));
			array[i].setRate((double)array[i].getProfit() / buy*100);
		}
	}
}
