package datos.estructura.arboles;

import java.util.Scanner;
public class ArbolBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        boolean salir = false;
        Arbol arbol = new Arbol();
        do {
            System.out.println("1. Crear Arbol");
            System.out.println("2. Recorrido PreOrden");
            System.out.println("3. Recorrido EnOrden");
            System.out.println("4. Recorrido PostOrden");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    arbol.setRaiz(arbol.crearArbol(sc));
                    system.out.println("Se ha creado el arbol");
                    break;
                case 2:
                   System.out.print("En Preorden: ");
                   arbol.preOrden(arbol.getRaiz());
                    break;
                case 3:
                   System.out.print("En EnOrden: ");
                   arbol.enOrden(arbol.getRaiz());
                   break;
                case 4:
                   System.out.print("En Postorden: ");
                   arbol.postOrden(arbol.getRaiz());
                   break;
               case 5:
                   salir = true;
                   break;
        }while (!salir);
    }
}