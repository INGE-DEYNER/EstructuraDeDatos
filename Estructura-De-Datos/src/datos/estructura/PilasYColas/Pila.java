package datos.estructura.PilasYColas;


public class Pila {


private Nodo cima;

public Pila() {
    cima = null;
}


private boolean isEmpty() {
    return cima == null;
}


public void push(int dato) {
    Nodo nuevo = new Nodo(dato);
    if (isEmpty()) {
        cima = nuevo;
    } else {

    nuevo.sig = cima;
    cima = nuevo;
    }
}

public void pop() {
    if (isEmpty()) {
        cima= cima.sig;
    }

}

public int peek() {
return (cima != null)?cima.dato:null;
}

}


public void mostrar(){
    if (isEmpty()) {
        System.out.println("La pila esta vacia");
        return;
    } 

    Nodo t=cima;
    while (t != null) {
        System.out.println(t.dato);
        t = t.sig;
    }
    System.out.println("------------------");

}