import java.util.Scanner;

public class Alimento extends Producto{

    public String fechaElaboracion;
    public String fechaExpiracion;

    public Alimento(String fechaElaboracion, String fechaExpiracion) {
        this.fechaElaboracion = fechaElaboracion;
        this.fechaExpiracion = fechaExpiracion;
    }
    public Alimento(){
    }
    public void ingresarAlimento(){
        this.ingresarProducto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha de elaboracion del producto:");
        fechaElaboracion=sc.next();
        System.out.println("Ingrese la fecha de expiracion del producto");
        fechaExpiracion=sc.next();
    }
}
