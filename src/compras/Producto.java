package compras;

public class Producto {
    private final int codigo;
    private String nombre;
    private String tipo;
    private int totalProductosPedidos;

    public Producto(int codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    void imprimirNombre() {
        System.out.print(nombre);
    }

    public void setCodigo(int codigo) {
        
    }

    public int getCodigo() {
        return codigo;
    }

    int getTotalProductosPedidos() {
        return totalProductosPedidos;
    }
}
