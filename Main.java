public class Main {
    public static void main(String[] args) {
        Empleado vendedor = new Vendedor("Juan", 2000.0, new ComisionEstarar());
        vendedor.mostrarDetalle();
    }
}