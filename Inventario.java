import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();
    private String[] categorias = {"Libro", "Revista", "Cuaderno"};

    public void agregar(Producto p) {
        productos.add(p);

    }

public void mostrarTodos() {
    System.out.println("Categorias disponibles: " + String.join(", ", categorias));
    
    double valorTotal = 0;

    for (Producto p : productos) {
        p.mostrarInformacion();
        valorTotal += p.getPrecio() * p.getCantidad();
    }

    System.out.println("Valor total del inventario: " + valorTotal);
}

public Producto buscarPorCodigo(int codigo) throws ProductoNoEncontradoException {
    for (Producto p : productos) {
        if (p.getCodigo() == codigo) {
            return p;
        }
    }

    throw new ProductoNoEncontradoException("producto no encontrado");

   }

}
