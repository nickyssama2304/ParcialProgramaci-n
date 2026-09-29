public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        Empleado vendedor = new Vendedor("Juan", 2000.0, new ComisionEstarar());
=======
        Empleado vendedor = new Vendedor("Juan", 1000.0, new ComisionPersonalizada());
>>>>>>> feature/comision-personalizada
        vendedor.mostrarDetalle();
    }
}