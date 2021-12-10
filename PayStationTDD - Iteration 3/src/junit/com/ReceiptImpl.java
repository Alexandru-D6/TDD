package junit.com;

public class ReceiptImpl implements Receipt {
	
	int valor;

	public ReceiptImpl(int i) {
		valor = i;
	}

	@Override
	public int value() {
		return valor;
	}

}
