package exercise6;

class AddAmount {

	int amount = 50;
	int count = 0;

	AddAmount() {
		count++;
	}

	AddAmount(int addAmount) {
		amount = amount + addAmount;
		count++;

	}

	public void addAmount(int number) {
		amount = amount + number;
		count++;
	}

	public void displayAmount() {
		System.out.println("Account details:" + amount);
	}

	public void showCount() {
		System.out.println("Count details:" + count);
	}

}

public class SavingBox {

	public static void main(String[] args) {

		AddAmount a1 = new AddAmount(50);

		AddAmount a2 = new AddAmount();

		a1.addAmount(30);

		a1.displayAmount();
		a1.showCount();
		a2.displayAmount();

	}

}
