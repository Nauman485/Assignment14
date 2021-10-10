package geekster;

public class Stock_buy_and_sell {
	public static void main(String []args) {
		int prices[]= {7,1,5,3,6,4};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int profit;
		int buyday=0;
		int sellday=0;
		for(int i=0;i<prices.length;i++) {
			if(min>prices[i]) {
				min=prices[i];
				buyday=i;
			}
			if(max<prices[i]) {
				sellday=i;
				if(sellday>buyday) {
				max=prices[i];
				}
			}
		}
		if(sellday>buyday) {
			profit=max-min;
			System.out.println(profit);
		}
		if(buyday==0 && sellday==0) {
			profit=0;
			System.out.println(profit);
		}
	}

}
