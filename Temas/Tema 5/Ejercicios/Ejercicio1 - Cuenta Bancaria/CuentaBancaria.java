package ejericio1;

class CuentaBancaria {

	// Atributos
	private String titular;
	private double saldo;

	// Constructor
	public CuentaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	// Metodos
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
        }
    }
	
	// Creamos Get y Set
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
