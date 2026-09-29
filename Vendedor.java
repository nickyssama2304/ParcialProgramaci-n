public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        super(nombre, ventasMes, estrategia);
    }

    @Override
    public void mostrarDetalle() {
        double comisionCalculada = estrategia.calcularComision(ventasMes);
        System.out.println("Empleado: " + nombre);
        System.out.println("Venta Total: $" + ventasMes);
        System.out.println("Comisión obtenida: $" + comisionCalculada);
    }
}