/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kruskalov;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dominik
 */
public class Kruskalov {
    private ArrayList<Integer> sled;
    private double[][] cena;
    private int pocetVrcholov, pocetHran;
    private int[] k;

    private Hrana[] hrana;

    public static void main(String[] args) {
        Kruskalov alg = new Kruskalov();
        alg.nacitajSubor();
        alg.vypisMaticu();
        alg.vypisK();

    }

    public Kruskalov() {

         Scanner klav = new Scanner(System.in) ;
            this.pocetVrcholov = klav.nextInt();
            this.pocetHran = klav.nextInt();
            klav.close();
            this.cena = new double[pocetVrcholov][pocetVrcholov];
            this.k=new int[pocetVrcholov];
            this.hrana=new Hrana[pocetHran];
            this.sled = new ArrayList<>();
        for (int i = 0; i < pocetVrcholov; i++) {
            k[i]=i+1;            
        }

    }

    public void nacitajSubor() {
            Scanner klav = new Scanner(System.in);
            klav.nextLine();
            int a=0;
            do {
                int x = klav.nextInt() - 1;
                int y =klav.nextInt() - 1;
                int cena = klav.nextInt();
                this.cena[x][y] = cena;
                hrana[a].setU(x);
                hrana[a].setV(y);
                hrana[a].setCena(cena);
                a++;
            }while (klav.hasNext());

            for (int i = 0; i < this.cena.length; i++) {
                for (int j = 0; j < this.cena.length; j++) {

                    if (this.cena[i][j] == 0) {
                        this.cena[i][j] = Double.POSITIVE_INFINITY; //vsetky nuly zmeni na nekonecno

                    }
                }
            }
    }


    public void vypisMaticu() {
        for (int i = 0; i < this.cena.length; i++) {

            for (int j = 0; j < this.cena.length; j++) {
                System.out.printf("%.0f", this.cena[i][j]);
                
            }
            System.out.println();
        }
    }
    
        public void vypisK() {
               System.out.println(" ");
            for (int i = 0; i < this.k.length; i++) {
               System.out.print(this.k[i]+ " ");
            }
        }
        
        public void vypisHrany() {
               System.out.println("");
               for (int i = 0; i < this.pocetHran; i++) {
                   System.out.print(this.hrana[i].getU()+ " - "+this.hrana[i].getV()+ "  "+this.hrana[i].getU()+ " ");
               }
       
        }

}
