package datos.estructura;

public class ListaDoble {
	
	// Establecer el nodo cabeza
	private NodoDoble CAB1;
	private NodoDoble CAB2;

	
	
	public ListaDoble() {
		CAB1=null;
		CAB2=null;
	}
	
	//Metodo para determinar si la lista esta vacia 
	public boolean esVacia() {
		return CAB1==null && CAB2==null;
	}
	
	public void insertarComienzo(int dato) {
		//Crear el nuevo nodo
		NodoDoble nuevo = new NodoDoble();
		//Almacenar el dato en el nodo
		nuevo.info=dato;
		//Enlazar los nodos 
		if(esVacia()) {
			CAB1=nuevo;
			nuevo.ant=null;
			CAB2=nuevo;
			nuevo.sig= null;
			
		}else {
			CAB1.ant=nuevo;
			nuevo.sig=CAB1;
			CAB1=nuevo;
			nuevo.ant= null;
			
		}
	}//Metodo

}
