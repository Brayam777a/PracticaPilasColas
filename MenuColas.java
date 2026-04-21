import java.util.*;
public class MenuColas {
    public void menuColas(Scanner sc){
        Metodos m= new Metodos();
        Queue<objCliente> cola = new LinkedList<>();
        Queue<objCliente> atendidos = new LinkedList<>();
        boolean seguir=true;
        while (seguir) {
            System.out.println("---------MENU DE COLAS----");
            System.out.println("1. Encolar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. ver Proximo cliente a atender");
            System.out.println("4. Ver toda la cola de clientes");
            System.out.println("5. Mostrar atendidos");
            System.out.println("6. Salir del menu de colas");


            System.out.println("Ingrese una opcion");
            int op=sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    m.EncolarCliente(cola, sc);
                    break;

                case 2:
                    m.AtenderCliente(cola, atendidos);
                    break;

                case 3:
                    m.SiguienteCliente(cola);
                    break;
                
                case 4:
                 m.MostrarCola(cola);
                     
                 break;

                case 5:
                  m.MostrarAtendidos(atendidos);
                
                     
                 break;

                case 6:
                     
                seguir=false;
                     
                 break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
           
        }

    }
}
