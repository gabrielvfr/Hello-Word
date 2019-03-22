/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corridasapo;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CorridaSapo corrida = new CorridaSapo();
        System.out.println("Qual sera a distancia total do percurso?");
        corrida.defDistancia(input.nextDouble());
        System.out.println("Qual o numero de sapos?");
        corrida.defSapos(input.nextInt());
        corrida.Start();
    }
}
