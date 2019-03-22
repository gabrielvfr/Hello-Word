/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chat.mult.tread;

/**
 *
 * @author coltec
 */

 
import java.io.InputStream;
import java.util.Scanner;
 
/**
 *
 * @author Virginia
 */
public class Recebedor implements Runnable {
  
   private InputStream servidor;
  
   public Recebedor(InputStream servidor) {
     this.servidor = servidor;
   }
  
   @Override
   public void run() {
     // recebe msgs do servidor e imprime na tela
     Scanner s = new Scanner(this.servidor);
     while (s.hasNextLine()) {
       System.out.println(s.nextLine());
     }
   }
 }
