package datos.estructura;

//Opercaion con los nodos y la lista
public class Listaa {
	
	// Establecer el nodo cabeza
	private Nodo CAB;

	
	
	public Listaa() {
		CAB=null;
	}
	
	//Metodo para determinar si la lista esta vacia 
	public boolean esVacia() {
		return CAB==null;
		
	}

	//Insertar por el comienzo de la lista 
	public void insertarComienzo(int dato) {
		//Crear el nuevo nodo
		Nodo nuevo = new Nodo();
		//Almacenar el dato en el nodo
		nuevo.info=dato;
		//Enlazar los nodos 
		if(esVacia()) {
			CAB=nuevo;
			nuevo.sig=null;	
			
		}else {
			nuevo.sig=CAB;
			CAB= nuevo;
			
		}
	}//Metodo
	
	
	//Insertar al final de la lista
	public void insertarFinal(int dato) {
		Nodo nuevo = new Nodo();
		
		nuevo.info=dato;
		if(esVacia()) {
			CAB=nuevo;
			nuevo.sig=null;
		}else {
			//Recorrer toda la lista hasta el ultimo nodo 
			Nodo t = CAB;
			
			while(t.sig!=null) {
				t=t.sig; //Avanzar al siguiente nodo
				
			}
			
			t.sig=nuevo;
			nuevo.sig=null;
			
		}
		System.out.println("Se ha registrado el dato!");
	}//Metodo
	
	
	//Metodo para mostrar la los elementos de la lista
	public void mostrarLista() {
		Nodo t=CAB;
		if(!esVacia()) {
			
			while(t!=null) {
				System.out.print(t.info+"->");
				t=t.sig;
				
			}
		 System.out.println("");

		}else {
			System.out.println("Lista Vacia!");
		}
	}
	
	public void sumaNomina() {
		int sumaSalario = 0;
		Nodo t = CAB;
		
		if(!esVacia()) {
			while(t!=null) {
				sumaSalario+=t.info;
				t=t.sig;
			}
		}else {
			System.out.println("Lista vacia, no se puede sumar!");
		}
		System.out.println("Suma del la nomina: "+sumaSalario);
		
		
	}
	
	public void mayorYMenor() {
		int mayor =0, menor = 0;
		Nodo t = CAB;
		
		
		if (!esVacia()) {
			while(t != null) { 
			if(mayor < t.info) {
		mayor = t.info;
		t = t.sig;
		
		
		System.out.println("El salraio mayor es:  " + mayor);
			}else {
				menor = t.info;
				t= t.sig;
				
				System.out.println("El salario menor es: " + menor);
				}
			}
			}else {
			System.out.println("Lista vacia , no hay elementos!");
			}
		}
		
	public void cantidadIngresados(){
		Nodo t = CAB;
		int i = 0;
		
		if (!esVacia()) {
			while(t != null) {
				i++;
				t = t.sig;
				
			}
			System.out.println("Cantidad de datos ingresados: " + i );
		}else {
			System.out.println("Lista Vacia, no hay datos ingresados!");
		}
		
	}
	
	public void insertarDespuesReferencia(int dato, int refe) {
		Nodo nuevo = new Nodo();
		nuevo.info=dato;
		
		if(esVacia()) {
			System.out.println("Lista Vacia!");
		}else {
			Nodo t = CAB;
			while (t !=null && t.info!=refe) {
				t=t.sig;
			}
			if(t!=null) {
				nuevo.sig = t.sig;
				t.sig = nuevo;
				System.out.println("Se ha ingresado el dato");
			}else {
				System.out.println("El nodo referencia no existe");
			}
		}
		
	}
	public void insertarAntesReferencia(int dato, int refe) {
		Nodo nuevo = new Nodo();
		nuevo.info=dato;
		
		if(esVacia()) {
			System.out.println("Lista  Vacia");
		}else {
			if(CAB.info == refe) {
				nuevo.sig = CAB;
				CAB= nuevo;
			}else {
				Nodo anterior = CAB;
				Nodo actual = CAB.sig;
				while(actual!=null && actual.info !=refe) {
					anterior = actual;
					actual= actual.sig;
					
				}
				if(actual!=null) {
					nuevo.sig=actual;
					anterior.sig=nuevo;
					System.out.println("Se ha ingresado el dato");
				}else {
					System.out.println("Nodo de referencia non existe");
				}
			}
			
			
			
		}
	}
	
	public void actualizarDato(int nuevoDato, int datoViejo) {
		
		if(esVacia()) {
			System.out.println("Lista Vacia");
		
		}else {
			Nodo t = CAB;
			while(t!=null && t.info!= datoViejo) {
				t=t.sig;
				
				
			}
			if(t!=null) {
				t.info=nuevoDato;
				System.out.println("Dato Actualizado");
			}else {
				System.out.println("El dato no esta en la lista");
			}
		}
		
	}
	
	public void eliminarDato(int dato) {
		Nodo t = CAB;
		Nodo ant = null;
		 while( t!= null && t.info != dato) {
			 ant= t ;
			 t=t.sig;
		}if(t!= null) {
			if(t==CAB) {
				CAB=CAB.sig;
			}else {
				ant.sig=t.sig;
			}
			System.out.println("Dato Eliminado");
		}else{
			System.out.println("El dato no esta en la lista");
		}
	}
	
	
	public void insertarDatos(String vendedor, String producto, int valor) {
		
		
				Nodo nuevo = new Nodo();
				
				
				nuevo.infoVendedor= vendedor;
				
				
				nuevo.infoProduc = producto;
				
			
				nuevo.infoValor = valor;
				
				if(esVacia()) {
					CAB=nuevo;
					nuevo.sig=null;	
					
				}else {
					nuevo.sig=CAB;
					CAB= nuevo;
					
				}
						
				
				
	}
	
	
	public void mostrarListaChucho() {
		Nodo t=CAB;
		if(!esVacia()) {
			
			while(t!=null) {
				System.out.println("Vendedor - "+t.infoVendedor+"Producto - "+t.infoProduc+"Precio - "+t.infoValor);
				t=t.sig;
				
			}
		 System.out.println("");

		}else {
			System.out.println("Lista Vacia!");
		}
	}
	
	
	
	// Calcular el promedio de las ventas
    private double calcularPromedio() {
        double suma = 0;
        int cantidad = 0;
        Nodo t = CAB;
        while (t != null) {
            suma += t.infoValor;
            cantidad++;
            t = t.sig;
        }
        return cantidad > 0 ? suma / cantidad : 0;
    }

    // Eliminar ventas menores a $3000 o 2 veces por debajo del promedio
    public void eliminarVentas() {
        if (esVacia()) {
            System.out.println("Lista vacia");
            return;
        }
        double promedio = calcularPromedio();
        int eliminados = 0;

        // Eliminar nodos desde el inicio mientras cumplan la condicion
        while (CAB != null && (CAB.infoValor < 3000 || CAB.infoValor < promedio / 2)) {
            CAB = CAB.sig;
            eliminados++;
        }

        if (CAB != null) {
            Nodo anterior = CAB;
            Nodo actual = CAB.sig;
            while (actual != null) {
                if (actual.infoValor < 3000 || actual.infoValor < promedio / 2) {
                    anterior.sig = actual.sig;
                    eliminados++;
                } else {
                    anterior = actual;
                }
                actual = actual.sig;
            }
        }

        System.out.println("Se eliminaron " + eliminados + " ventas.");
    }

    // Actualizar venta por nombre del vendedor
    public void actualizarVenta(String nVendedor, String nProducto, int nValor) {
        if (esVacia()) {
            System.out.println("Lista vacia");
            return;
        }
        Nodo t = CAB;
        while (t != null && !t.infoVendedor.equalsIgnoreCase(nVendedor)) {
            t = t.sig;
        }
        if (t != null) {
            t.infoProduc = nProducto;
            t.infoValor = nValor;
            System.out.println("SE HA ACTUALIZADO LA VENTA");
        } else {
            System.out.println("No se encontro la venta del vendedor: " + nVendedor);
        }
    }
}
