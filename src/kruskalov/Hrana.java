/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kruskalov;

/**
 *
 * @author Dominik
 */
public class Hrana {
    private int u;
    private int v;
    private double cena;

    public Hrana(int u, int v, double cena) {
        this.u = u;
        this.v = v;
        this.cena = cena;
    }


    public int getU() {
        return this.u;
    }


    public void setU(int u) {
        this.u = u;
    }


    public int getV() {
        return this.v;
    }


    public void setV(int v)
    {
        this.v = v;
    }


    public double getCena() {
        return this.cena;
    }


    public void setCena(double cena) {
        this.cena = cena;
    }
    
}
