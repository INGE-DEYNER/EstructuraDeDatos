package    datos.estructura.Arboles;

import java.util.Scanner;

public class Arbol{
    private Nodo raiz;
    public  Nodo crearArbol(Scanner sc){
        system.out.println("Ingrese el valor del nodo : ");
        int dato = sc.nextInt();

        Nodo nodo = new Nodo(dato);

        system.out.println("¿Desea agregar un nodo izquierdo a " + dato + "? (s/n)");
        int izq  = sc.nextInt();
        if(izq=='s'){
            nodo.setIzquierdo(crearArbol(sc));
        }

        system.out.println("¿Desea agregar un nodo derecho a " + dato + "? (s/n)");
        int der = sc.nextInt();
        if(der=='s'){
            nodo.setDerecho(crearArbol(sc));

        }
        return(nodo);
    }

    /* RECORRIDOS */
    //PREORDEN
    public void preOrden(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        System.out.print(nodo.getDato() + " ");
        //Arbol Izquierdo
        preOrden(nodo.getIzquierdo());
        //Arbol Derecho
        preOrden(nodo.getDerecho());

    }

    //EN ORDEN
    public void enOrden(Nodo nodo){
        if (nodo == null) {
            return;
        }
        enOrden(nodo.getIzquierdo());
        System.out.print(nodo.getDato() + " ");
        enOrden(nodo.getDerecho());
    }

    //POSTORDEN
    public void postOrden(Nodo nodo){
        if (nodo == null) {
            return;
        }
        postOrden(nodo.getIzquierdo());
        postOrden(nodo.getDerecho());
        System.out.print(nodo.getDato() + " ");
    }


}