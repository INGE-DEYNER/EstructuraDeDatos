package datos.estructura.PilasYColas;


public class PilasYColas {

    public static void main(String[] args) {
        System.out.println("Manejo de pilas");
        Pila pila = new Pila();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.mostrar();
        System.out.println("Elementos almacenados");
        pila.mostrar();
        System.out.println("Sacando elementos de la pila:");
        pila.pop();
        pila.pop();
        pila.mostrar();



        System.out.println("-----------------------------------");
        Cola cola = new Cola();
        cola.enequeue(3);
        cola.enequeue(4);
        cola.enequeue(5);   
        System.out.println("Elementos almacenados en la cola:");
        cola.mostrar();
        System.out.println("Sacando elementos de la cola:");
        cola.dequeue();
        cola.dequeue();
        cola.mostrar();

    }



}