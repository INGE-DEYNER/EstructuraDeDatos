package datos.estructura.Listas.Circulares;

import java.util.Scanner;
public class ListaCircular {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opc;
            boolean salir = false;
            Lista listaCircular = new Lista();

            do {
                System.out.println("1. Insertar comienzo");
                System.out.println("2. Insertar final");
                System.out.println("3. Mostrar lista");
                System.out.println("4. Salir");
                System.out.print("Ingrese su opcion: ");
                opc = sc.nextInt();

                switch (opc) {
                    case 1 -> {
                        System.out.print("Ingrese el dato: ");
                        listaCircular.insertStart(sc.nextInt());
                    }
                    case 2 -> {
                        System.out.print("Ingrese el dato: ");
                        listaCircular.insertEnd(sc.nextInt());
                    }
                    case 3 -> listaCircular.showList();
                    case 4 -> salir = true;
                    default -> System.out.println("Opcion invalida");
                }
            } while (!salir);
        }
    }
    
}
