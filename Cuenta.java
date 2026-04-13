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

//GETTER Y SETTERS
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

//METODOS

public void ingreso(double cantidad){
    //la cantidad no puede ser negativa
    if(cantidad<0){
        System.out.println("Erro: La cantidad no puede ser negativa");
    }else 
        saldo +=cantidad;
        //falta movimientos
        System.out.println("Se ha ingresado " + cantidad + "€");
}

public void retiro(double cantidad){
    //la cantidad no puede ser negativa
    if(cantidad<0){
        System.out.println("Erro: La cantidad no puede ser negativa");
        return;
    }
    if(cantidad>saldo){
        System.out.println("ERROR: No hay suficiente saldo");
        return;
    }
    //Retiramos el dinero
        saldo -=cantidad;
        //falta movimiento
        System.out.println("Se ha retirado " + cantidad + "€");
}



    @Override
    public String toString() {
        return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
    }

    



    
}
