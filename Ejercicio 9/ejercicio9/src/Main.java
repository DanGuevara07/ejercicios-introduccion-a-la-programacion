public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(25, "Juan","7356894", (float)5896.52);
        Trabajador trabajador= new Trabajador(30, "Pedro","7856963",(float)5651.58);
        System.out.println("Datos del cliente:");
        System.out.println("Edad: "+ cliente.edad +" Nombre: " + cliente.nombre +
                " Telefono: "+cliente.telefono +" Credito: " + cliente.credito );
        System.out.println("Datos del trabajador");
        System.out.println("Edad: "+ trabajador.edad +" Nombre: " + trabajador.nombre +
                " Telefono: "+trabajador.telefono +" Salario: " + trabajador.salario );
    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;


}
class Cliente extends Persona{
    float credito;
    public Cliente(int edad, String nombre, String telefono, float credito){
        this.edad=edad;
        this.nombre=nombre;
        this.telefono=telefono;
        this.credito=credito;

    }

}
class Trabajador extends Persona{
    float salario;
    public Trabajador(int edad, String nombre, String telefono, float salario){
        this.edad=edad;
        this.nombre=nombre;
        this.telefono=telefono;
        this.salario=salario;

    }
}
