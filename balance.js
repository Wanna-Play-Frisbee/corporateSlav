public balance{
	function Balance(int startingBal){
		var Balance = new Object(startingBal);
	}
	function buy(int shopNum){
		if (Balance>=shop.getValue(shopNum)){
			Balance-=shop.getValue(shopNum);
		}else{
			alert("Hoe ass hoe you can't afford that.");
		}
	}
	function gains(int addBal){
		Balance+=addBal;
	}
	function value(){
		return Balance;
	}
}
