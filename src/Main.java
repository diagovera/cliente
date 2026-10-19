public class Main {
    public static void main(String[] args) {

        System.out.println("Clientes registrados al inicio: " + Cliente.getTotalClientes());
        System.out.println();

        Cliente cliente1 = new Cliente("Ana Pérez", "ana@correo.com");
        Cliente cliente2 = new Cliente("Luis Gómez", "luis@correo.com");
        Cliente cliente3 = new Cliente("María Torres", "maria@correo.com");

        System.out.println("=== Clientes creados ===");
        mostrar(cliente1);
        mostrar(cliente2);
        mostrar(cliente3);

        System.out.println();
        System.out.println("Total de clientes: " + Cliente.getTotalClientes());

        System.out.println();
        System.out.println("=== Se desactiva solo el cliente 2 ===");
        cliente2.desactivar();
        mostrar(cliente1);
        mostrar(cliente2);
        mostrar(cliente3);

        System.out.println();
        cliente2.activar();
        mostrar(cliente2);

        System.out.println();
        System.out.println("Total de clientes: " + Cliente.getTotalClientes());
    }

    private static void mostrar(Cliente c) {
        System.out.println("ID: " + c.getId()
                + " | Nombre: " + c.getNombre()
                + " | Correo: " + c.getCorreo()
                + " | Activo: " + c.isActivo());
    }
}
