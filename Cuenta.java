import java.util.ArrayList;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private Cliente titular;
    private ArrayList<Movimiento> movimientos;

    
    public Cuenta(int numeroCuenta, double saldo, Cliente titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }


    public int getNumeroCuenta() {
        return numeroCuenta;
    }


    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public Cliente getTitular() {
        return titular;
    }


    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


    @Override
    public String toString() {
        return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
    }

    



    
}
