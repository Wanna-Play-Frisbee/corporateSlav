package main;

public class playerBalance {
    int Balance;
    public void Balance(int startingBal){
		Balance = startingBal;
    }
    public void rem(int amt){
		Balance -= amt;
    }
    public void add(int amt){
		Balance += amt;
    }
}
