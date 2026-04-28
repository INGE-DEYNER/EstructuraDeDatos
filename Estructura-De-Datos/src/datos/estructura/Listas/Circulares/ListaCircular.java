package datos.estructura.Listas.Circulares;

import java.util.Scanner;
public class ListaCircular {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int opc;
        boolean salir;
        Lista doble =new Lista();
        ListaCircular c = new ListaCircular();


        do { 
            System.out.println(
            "1. Insertar Comienzo"
            + "2. Insertgar Final"
            + "3. Mostrar Lista"
            + "Ingrese su opcion"
        );
        opc=sc.nextInt();
        switch () {
            case 1:
                System.out.print("Ingrese el dato:");
                c.insertStart(sc.nextInt());
                break;
            case 1:
                System.out.print("Ingrese el dato:");
                c.insertEnd(sc.nextInt());
                break;
            case 2:
                System.out.print("Ingrese el dato:");
                c.showList;
                break;
            case 3:
                salir = true;
                break;
        }

        } while (!salir);
    }
    
}
