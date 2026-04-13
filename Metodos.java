import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;

public class Metodos {
    public Stack<ObjPagina>ingresarPagina (Stack<ObjPagina> pila, Scanner sc){
     boolean op = true;

        while (op) {
            ObjPagina o = new ObjPagina();
            System.out.println("Digite la direccion de la pagina");
            o.setUrl(sc.nextLine());

          

           
            
            System.out.println("Digite el nomnbre de la pagina");
            o.setNombre(sc.nextLine());
            
            

            System.out.println("Digite la fecha en que ingreso a la pagina");
            o.setFecha(sc.nextLine());
            
            pila.push(o);

            System.out.println("desea continuar 1) si , 2) no");
            int opt = sc.nextInt();
            if (opt == 2) {
                op = false;
            }
            sc.nextLine();
        }


        return pila;

    } 

public void MostrarPila(Stack<ObjPagina> p) {
        for (ObjPagina o : p) {
            System.out.print("----------------------" + "\nla url es:" + o.getUrl() + "\nEl nombre de la pagina es; " + o.getNombre() + 
        "\nLa fecha de ingreso fue :  " + o.getFecha() + "\n---------------------------------------");
        }
        System.out.println();
    }

    

}
