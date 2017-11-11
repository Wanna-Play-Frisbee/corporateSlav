public class balance{
	constant int Balance(int startingBal){
		Balance = startingBal;
	}
	void buy(int shopNum){
		if (Balance>=shop.getValue(shopNum)){
			Balance-=shop.getValue(shopNum);
		}else{
			alert("Hoe ass hoe you can't afford that.");		
		}
	}
	void gains(int addBal){
		Balance+=addBal;	
	}
}
