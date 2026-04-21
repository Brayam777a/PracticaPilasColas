import java.util.Scanner;
import java.util.LinkedList;
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

     public Queue<objCliente>EncolarCliente (Queue<objCliente> cola, Scanner sc){
     boolean op = true;

        while (op) {
            objCliente o = new objCliente();
            System.out.println("Digite el nombre del cliente");
            o.setNombre(sc.nextLine());

          System.out.println("Digite el documento(id) del cliente");
            o.setId(sc.nextInt());
            sc.nextLine();
            
          System.out.println("Digite la hora de llegada del cliente");
            o.setHoraLLegada(sc.nextLine());

         System.out.println("Digite el tipo de servicio del cliente");
            o.setTipoServicio(sc.nextLine());

            o.setAtendido(false);

         
            
            cola.offer(o);

            System.out.println("desea continuar 1) si , 2) no");
            int opt = sc.nextInt();
            if (opt == 2) {
                op = false;
            }
            sc.nextLine();
        }


        return cola;

    } 



public void MostrarPila(Stack<ObjPagina> p) {
        for (ObjPagina o : p) {
            System.out.print("----------------------" + "\nla url es:" + o.getUrl() + "\nEl nombre de la pagina es; " + o.getNombre() + 
        "\nLa fecha de ingreso fue :  " + o.getFecha() + "\n---------------------------------------");
        }
        System.out.println();
    }

    public void MostrarCola(Queue<objCliente> c) {
        System.out.println("Los clientes actuales en la cola sin atender son:");
        System.out.println();
        for (objCliente o : c) {
        System.out.println("---------------------------------------");
        System.out.println("el nombre del cliente es: " + o.getNombre());
        System.out.println("el id del cliente es: " + o.getId());
        System.out.println("la hora de llegada del cliente es: " + o.getHoraLLegada());
        System.out.println("el tipo de servicio del cliente es: " + o.getTipoServicio());
        System.out.println("---------------------------------------");
        
        }
        System.out.println();
    }

    


public void retrocerPag (Stack<ObjPagina> pila){
    if (pila.isEmpty()) {
        System.out.println("no has ingresado a ninguna pagina aun");

         } else{
            pila.pop();
            if (pila.isEmpty()) {
                System.out.println("no hay pagina anterior");
            }else{
                ObjPagina actual=pila.peek();
                System.out.print("----------------------" + "\nla url es:" + actual.getUrl() + "\nEl nombre de la pagina es; " + 
                actual.getNombre() + 
        "\nLa fecha de ingreso fue :  " + actual.getFecha() + "\n---------------------------------------");
            }
         }
  }

  public Queue<objCliente> AtenderCliente(Queue<objCliente> cola, Queue<objCliente> atendidos){
    

     if (cola.isEmpty()) {
        System.out.println("No hay clientes por atender");
     } else {
        objCliente atendidooooo=cola.poll();
        atendidooooo.setAtendido(true);
        atendidos.offer(atendidooooo);
        System.out.println("Cliente atendido:");
        System.out.println("---------------------------------------");
        System.out.println("el nombre del cliente es: " + atendidooooo.getNombre());
        System.out.println("el id del cliente es: " + atendidooooo.getId());
        System.out.println("la hora de llegada del cliente es: " + atendidooooo.getHoraLLegada());
        System.out.println("el tipo de servicio del cliente es: " + atendidooooo.getTipoServicio());
        System.out.println("---------------------------------------");
        

     }
    return atendidos;
  }

public void MostrarAtendidos (Queue<objCliente> atendidos){

    if (atendidos.isEmpty()) {
        System.out.println("Aun no han atendido a ningun cliente");
        
    }else{
    System.out.println("Los clientes atendidos de la cola sin atender son:");
        System.out.println();
        for (objCliente o : atendidos) {
        System.out.println("---------------------------------------");
        System.out.println("el nombre del cliente es: " + o.getNombre());
        System.out.println("el id del cliente es: " + o.getId());
        System.out.println("la hora de llegada del cliente es: " + o.getHoraLLegada());
        System.out.println("el tipo de servicio del cliente es: " + o.getTipoServicio());
        System.out.println("---------------------------------------");
        
        }
        System.out.println();
    }
  }

  public void SiguienteCliente(Queue<objCliente> cola){
    if (cola.isEmpty()) {
        System.out.println("No hay clientes por atender");
     }else{
        objCliente o = cola.peek();
        System.out.println("El siguiente por atender es");
        System.out.println("---------------------------------------");
        System.out.println("el nombre del cliente es: " + o.getNombre());
        System.out.println("el id del cliente es: " + o.getId());
        System.out.println("la hora de llegada del cliente es: " + o.getHoraLLegada());
        System.out.println("el tipo de servicio del cliente es: " + o.getTipoServicio());
        System.out.println("---------------------------------------");

     }
  }

}
