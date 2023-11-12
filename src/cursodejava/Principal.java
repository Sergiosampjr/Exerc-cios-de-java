package cursodejava;


public class Principal {

	
	public static void main(String[] args) {
		ContaBancaria principal = new ContaBancaria();
			principal.titular = "Sérgio";
			principal.numerodaconta = 123456;
			principal.saldo = 1700;
	principal.depositarvalor(40);
	principal.saquevalor(2000);
	}

}
