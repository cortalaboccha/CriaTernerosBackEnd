package com.backend.CriaTernerosBackEnd.Modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alimento {
	
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
  
	@Column(nullable = false, name= "ID")
    private int id;

    @Column(nullable = false, name= "nombre")
    private String nombre;

 
    @Column(nullable = false, name= "stock")
    private int stock;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}
	  public Alimento() {
	    }

	public Alimento(int id, String nombre, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.stock = stock;
	}
    
	 @Override
	    public Alimento clone() {
	        return new Alimento(getId(), getNombre(), getStock());
	    }
}
