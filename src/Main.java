import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Venta venta1 = new Venta();
        System.out.println("Ingrese los datos del alimento");
        venta1.ingresarVenta(new iProducto() {

            Alimento alimento = new Alimento();

            @Override
            public void imprimirProducto() {
                System.out.println("El nombre del alimento es: "+alimento.nombre);
            }

            @Override
            public void ingresarProducto() {
                Scanner sc= new Scanner(System.in);
                System.out.println("Ingrese el nombre del alimento:");
                alimento.nombre = sc.next();
            }
        });
        System.out.println("Ingrese los datos del producto");
        venta1.ingresarVenta(new iProducto() {
            Producto producto = new Producto();

            @Override
            public void imprimirProducto() {
                System.out.println("El codigo del prodcuto es: " + producto.nombre);
            }

            @Override
            public void ingresarProducto() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese el codigo del alimento:");
                producto.nombre = sc.next();
            }
        });
    }
}