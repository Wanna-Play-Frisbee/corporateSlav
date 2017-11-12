public class Payment extends Thread {

	public Payment(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("START " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
			doProcessing();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("END   " + Thread.currentThread().getName());
	}

	private void doProcessing() throws InterruptedException {
		for (Player p : Tycoon.players) {
			for (Item i : p.playerInv) {
				p.balance += i.generation;
			}
		}
	}

}
