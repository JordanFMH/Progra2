package taller1;

public class Principal {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("01", "Mendoza Bladimir", 500);

        CuentaBancaria cuenta2 = new CuentaBancaria("02", "Jordan Morales", 1500);

        cuenta1.depositar(1200);
        cuenta2.depositar(500);

        cuenta1.retirar(300);
        cuenta2.retirar(2500);
        
        System.out.println("------------------");
        System.out.println("CUENTAS BANCARIAS");
        System.out.println("------------------\n");
        System.out.println("-------CUENTA 1-------");
        System.out.println("Número: " + cuenta1.getNumeroCuenta());
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo: $" + cuenta1.getSaldo());

        System.out.println();

        System.out.println("-------CUENTA 2-------");
        System.out.println("Número: " + cuenta2.getNumeroCuenta());
        System.out.println("Titular: " + cuenta2.getTitular());
        System.out.println("Saldo: $" + cuenta2.getSaldo());

        System.out.println("\nTotal de cuentas creadas: "+ CuentaBancaria.getTotalCuentas());
    }
}