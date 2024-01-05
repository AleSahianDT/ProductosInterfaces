import java.util.Scanner;

public class Cliente implements iCliente{

    public String nombre;
    public String cedula;
    public int edad;

    @Override
    public void imprimirCliente() {
        System.out.println("El nombre del cliente es:"+nombre);
        System.out.println("La cedula del cliente es:"+cedula);
        System.out.println("La edad del cliente es:"+edad);
    }

    @Override
    public void ingresarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente:");
        this.nombre = sc.next();
        System.out.println("Ingrese la cedula del cliente:");
        this.cedula = sc.next();
        System.out.println("Ingrese la edad del cliente:");
        this.edad = sc.nextInt();
    }

}
