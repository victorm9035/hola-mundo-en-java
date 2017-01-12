package beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Contador implements Serializable {
	private int contador;
	
	public Contador(){
		this.contador=0;
	}
	
	public int getContador(){
		return contador;
	}
	public void setContador(int cont){
		this.contador++; 
	}
}
