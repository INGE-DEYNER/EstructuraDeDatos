package datos.estructura.Listas.Circulares;

public class Lista {
    
    private Nodo CAB;
    private Nodo ultimo;

    public Lista() {
        CAB = null;
        ultimo = null;  
    }

    public boolean isEmpty() {
        return CAB == null && ultimo == null;

    }

    public void insertStart(int dato){
        Nodo nuevo = new Nodo();

        nuevo.setInfo(dato);
        if(isEmpty()){
            
            CAB = nuevo;
            ultimo = nuevo;
            nuevo.sig= CAB;
            
        }
        else {
            nuevo.sig=CAB;
            CAB=nuevo;
            ultimo.sig=CAB;

        }
        System.out.println("Se ha registrado el dato");
    }

    public void insertEnd(int dato){
        Nodo nuevo = new Nodo();

        nuevo.setInfo(dato);
        if(isEmpty()){
            
            CAB = nuevo;
            ultimo = nuevo;
            nuevo.sig= CAB;
            
        }
        else {
            ultimo.sig=nuevo;
            ultimo=nuevo;
            ultimo.sig=CAB;

        }
        System.out.println("Se ha registrado el dato");

    }

    public void showList(){
        if(!isEmpty()){
            Nodo t=CAB;
            System.out.println("->");
            do { 
                System.out.println(t.getInfo() + "->");
                t=t.sig;

            } while (t!=CAB);

        }else{
            System.out.println("Lista Vacia!");
        }


    }


}
