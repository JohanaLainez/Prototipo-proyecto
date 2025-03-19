public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Johana Lainez", "12345678", "Natural",
                "2239-4696", "lainez@gmail.com", "Ciudad Futura 3", "Activo",
                "Lainez", "2025-03-19");

        Empleado empleado1 = new Empleado(2, "Nicolas Mora", "91011123", "Natural",
                "3334-2728", "niko@gmail.com", "Soyapango 3", "Activo",
                "Permanente");

        System.out.println(cliente1);
        System.out.println(empleado1);

        cliente1.actualizarCliente("Inactivo");
        System.out.println("\nCliente Actualizado:");
        System.out.println(cliente1);

        cliente1.inactivarCliente();
        System.out.println("\nCliente Inactivo:");
        System.out.println(cliente1);
    }
}
