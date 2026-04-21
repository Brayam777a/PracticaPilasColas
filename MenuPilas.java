import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;

public class MenuPilas {
    public void menuPi(Scanner sc){
        Metodos m= new Metodos();
        Stack<ObjPagina> pila = new Stack<>();
        boolean seguir=true;
        while (seguir) {
            System.out.println("---------MENU DE PILAS----");
            System.out.println("1. Ingresar pagina");
            System.out.println("2. Regresar a pagina anterior y mostrarla");
            System.out.println("3. ver historial ");
            System.out.println("4. salir del menu de pilas");

            System.out.println("Ingrese una opcion");
            int op=sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    m.ingresarPagina(pila, sc);
                    break;

                case 2:
                    m.retrocerPag(pila);
                    break;

                case 3:
                    m.MostrarPila(pila);
                    break;
                
                case 4:
                     
                seguir=false;
                     
                 break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
           
        }

    }
}
