/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corridasapo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class CorridaSapo {
private double distaciaCorrida;
private int numSapos;
List < Sapo > sapos = new ArrayList <Sapo>() ;

public void defDistancia(double distancia){
    this.distaciaCorrida = distancia; 
}

public void defSapos(int num){
    this.numSapos = num;
    for(int i =0;i<this.numSapos;i++){
        this.sapos.add(new Sapo(this.distaciaCorrida));
    }
}


public void Start(){
  for(int i =0;i<this.sapos.size();i++){
      sapos.get(i).start();
  }
}
  
}
    

