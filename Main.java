import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuPilas mP= new MenuPilas();
        MenuColas mC= new MenuColas();
        boolean seguir=true;
        while (seguir) {
            System.out.println("---------MENU----");
            System.out.println("BIENVENIDO");
            System.out.println("Elige un menu");
            System.out.println("1. Menu pilas (Practica navegador");
            System.out.println("2. Menu colas (practica banco-clientes");
            System.out.println("3. Salir");

            int op= sc.nextInt();
            switch (op) {
                case 1:
                    mP.menuPi(sc);
                    break;

                case 2:
                    mC.menuColas(sc);
                    break;

                case 3:
                
                seguir=false;
                
                             
                    break;
                
                
            
                default:
                    System.out.println("opcion no valida");
                    break;
            }
               
        }
    
       
    }
}
