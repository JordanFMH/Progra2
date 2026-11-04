package taller1;

public class CuentaBancaria {

    private static int totalCuentasCreadas = 0;

    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
        totalCuentasCreadas++;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double monto) {

        double bonificacion = 0; 

        if (monto >= 1000) {
            bonificacion = 20;
        }

        saldo += monto + bonificacion;
    }

    public boolean retirar(double monto) {

        double comision = 2;

        if (saldo >= monto + comision) {
            saldo -= monto + comision;
            return true;
        }

        return false;
    }

    public static int getTotalCuentas() {
        return totalCuentasCreadas;
    }
}