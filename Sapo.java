/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corridasapo;

/**
 *
 * @author Gabriel
 */
public class Sapo extends Thread {
    private double distanciaPulo;
    private double distanciaPercorrida;    
    private double distanciaTotal;

public Sapo (double distanciaTotal){
   this.distanciaTotal = distanciaTotal; 
    }

    @Override
    public void run(){
    while(this.distanciaTotal>this.distanciaPercorrida){
        distanciaPulo++;
        distanciaPercorrida = distanciaPulo;
        System.out.println("Pulo: " + this.distanciaPulo + "distancia percorrdia " + this.distanciaPercorrida);
    }
        System.out.println("Atingiu a distancia total");
    }
}