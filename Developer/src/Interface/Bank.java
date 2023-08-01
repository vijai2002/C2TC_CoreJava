package Interface;

public interface Bank {
	int Minbalance=5000;
	float Minlimit=15000;
	void deposit(int amount);
	void withdraw(int amount);

}
