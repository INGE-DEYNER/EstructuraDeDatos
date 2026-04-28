package datos.estructura.PilasYColas;

public class Cola {
    private Nodo inicio, fin;

    public Cola(){
        inicio=fin=null;
        
    }

    public boolean isEmpty(){
        return(inicio==null && fin==null);
    }

    public void enequeue(int dato){
        Nodo nuevo = new Nodo(dato);

        if ( isEmpty() ){
            inicio=fin=nuevo;
        }else{
            fin.sig=nuevo;
            fin=fin.sig;

        }
        System.out.println("se ha agregado el valor en la cola");

    }

    public void dequeue(){
        if ( !isEmpty()){
            inicio=inicio.sig;

        } 
    }

    public void mostrar(){
        Nodo t = inicio;
        while (t!=null){
            System.out.println(t.dato);
            t=t.sig;
        }
    }
}
