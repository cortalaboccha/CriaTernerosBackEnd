package com.backend.CriaTernerosBackEnd.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Ternero {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    //@Column(nullable = false, name= "ID")
    private int id;

    //@Column(nullable = false, name= "nroTernero")
    private String nroTernero;

    //nacimiento
   // @Column(nullable = false, name= "fechNac")
    private Date fechaNac;
    //@Column(nullable = false, name= "parto")
    private String parto;
    //@Column(nullable = false, name= "image")
    private String imagen;
   // @Column(nullable = false, name= "peso")
    private double peso;

    //calostrado
   // @Column(nullable = false, name= "canCal")
    private double cantCal;
   // @Column(nullable = false, name= "tiempo")
    private int tiempo;

    //refractometria
   // @Column(nullable = false, name= "fechaRef")
    private Date fechaRef;
  //  @Column(nullable = false, name= "valor")
    private double valor;

    //desleche
   // @Column(nullable = false, name= "fechaDes")
    private Date fechaDes;
   // @Column(nullable = false, name= "pesoDes")
    private double pesoDes;
   // @Column(nullable = false, name= "altura")
    private double altura;


    public Ternero() {
    }


    public Ternero(int id, String nroTernero, Date fechaNac, String parto, String imagen, double peso, double cantCal, int tiempo, Date fechaRef,
                   double valor, Date fechaDes, double pesoDes, double altura) {
        super();
        this.id = id;
        this.nroTernero= nroTernero;
        this.fechaNac = fechaNac;
        this.parto = parto;
        this.peso = peso;
        this.imagen= imagen;
        this.cantCal = cantCal;
        this.tiempo = tiempo;
        this.fechaRef = fechaRef;
        this.valor = valor;
        this.fechaDes = fechaDes;
        this.pesoDes = pesoDes;
        this.altura = altura;
    }



    @Override
    public Ternero clone() {
        return new Ternero(getId(), getNroTernero(), getFechaNac(), getParto(), getImagen(), getPeso(), getCantCal(), getTiempo(), getFechaRef(), getValor(), getFechaDes(), getPesoDes(), getAltura());
    }




    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getNroTernero() {
        return nroTernero;
    }


    public void setNroTernero(String nroTernero) {
        this.nroTernero = nroTernero;
    }



    public Date getFechaNac() {
        return fechaNac;
    }



    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }



    public String getParto() {
        return parto;
    }



    public void setParto(String parto) {
        this.parto = parto;
    }



    public String getImagen() {
        return imagen;
    }


    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


    public double getPeso() {
        return peso;
    }



    public void setPeso(double peso) {
        this.peso = peso;
    }



    public double getCantCal() {
        return cantCal;
    }



    public void setCantCal(double cantCal) {
        this.cantCal = cantCal;
    }



    public int getTiempo() {
        return tiempo;
    }



    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }



    public Date getFechaRef() {
        return fechaRef;
    }



    public void setFechaRef(Date fechaRef) {
        this.fechaRef = fechaRef;
    }



    public double getValor() {
        return valor;
    }



    public void setValor(double valor) {
        this.valor = valor;
    }



    public Date getFechaDes() {
        return fechaDes;
    }



    public void setFechaDes(Date fechaDes) {
        this.fechaDes = fechaDes;
    }



    public double getPesoDes() {
        return pesoDes;
    }



    public void setPesoDes(double pesoDes) {
        this.pesoDes = pesoDes;
    }



    public double getAltura() {
        return altura;
    }



    public void setAltura(double altura) {
        this.altura = altura;
    }




}
