public class Venta{

    private Producto producto;
    private Cliente cliente;

    public Venta(){
    }

    public void ingresarVenta(iProducto producto){
        producto.ingresarProducto();
        producto.imprimirProducto();
    }

}
