import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("SISTEMA DE INVENTARIO");
            System.out.println("Gestion de productos de la biblioteca");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Buscar producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opcion no validad");
                opcion = 0;
            }
            switch (opcion) {
                case 1:
                    System.out.println("Registrar producto");
                    System.out.print("Ingrese el codigo: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese el precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = scanner.nextInt();
                    Producto producto = new Producto(codigo, nombre, precio, cantidad);
                    inventario.agregar(producto);
                    break;
                    
                case 2:
                    inventario.mostrarTodos();
                    break;

                case 3:
                    System.out.print("Ingrese el codigo del producto: ");
                    int codigoBuscar = scanner.nextInt();

                    try {
                         Producto productoEncontrado = inventario.buscarPorCodigo(codigoBuscar);
                         productoEncontrado.mostrarInformacion();
                        
                    } catch (ProductoNoEncontradoException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                    
                
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

        
            }

        } while (opcion !=4);

        scanner.close();
    }
}