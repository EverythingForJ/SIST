

public class Output {
	
	void print(Product[] array) {
		for(Product p : array) {
			System.out.println("<<상품별 판매 이익금 및 이익율표>>");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("상품명\t 수량\t 판매단가\t 매입단가\t 운송료\t 이익금\t 이익율");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.2f%n",
									p.getName(), p.getQuantity(), p.getSellmoney(), p.getBuymoney(), p.getFee(), p.getProfit(), p.getRate());
		}
	}
}
