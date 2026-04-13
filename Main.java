import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuPilas mP= new MenuPilas();
        boolean seguir=true;
        while (seguir) {
            System.out.println("BIENVENIDO");
            System.out.println("Elige un menu");
            System.out.println("1. Menu pilas");
            System.out.println("2. Menu colas");
            int op= sc.nextInt();
            switch (op) {
                case 1:
                    mP.menuPi(sc);
                    break;

                case 2:
                    
                    break;

                case 3:
                if (op==3) {
                seguir=false;
                
                             }
                    break;
            
                default:
                    System.out.println("opcion no valida");
                    break;
            }
               
        }
    
       
    }
}
