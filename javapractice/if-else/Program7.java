//calculate profit or loss
class Program7{
	public static void main(String[] args){
		int sell=1200;
		int cost=1000;
		if(sell>cost){
			System.out.println(sell-cost+" Is Profit");
		}else if(cost>sell){
			System.out.println(cost-sell+" Is Loss");
		}else{
			System.out.println("No Profit No Loss");
		}
	}
}
