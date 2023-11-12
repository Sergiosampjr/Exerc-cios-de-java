package cursodejava;


public class ContaBancaria {
	String titular;
	int numerodaconta;
	double saldo;
void depositarvalor(double valor) {
	saldo = saldo + valor;
}

void saquevalor(double saque) {
	if(saldo>saque) {
		saldo = saldo - saque;
	}	else{
			saldo = 0;
		}
				
	}
}

