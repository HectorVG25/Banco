import java.time.LocalDate;

public class AppBanco {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente(
            "24465324P", 
            "Juan", 
            "Garcia", 
            "C/ San Juan", 
            "Madrid", 
            LocalDate.of(1992, 3, 12)
        );
        c1.nombreCompleto();
        Cuenta cuenta1 = new Cuenta(1, 243, c1);
        System.out.println(c1);
        System.out.println(cuenta1);

    }
}