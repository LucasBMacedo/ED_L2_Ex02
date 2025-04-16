package controller;

public class RestoDaDivisao {

	public RestoDaDivisao() {
		super();
	}
	public int CalcularRestoDaDivisao(int dividendo, int divisor) {
		if (dividendo == divisor) {
			return 0;
		}
		if (dividendo > divisor) {
			return CalcularRestoDaDivisao(dividendo - divisor, divisor);
		}
		else {
			return dividendo;
		}
	}
}