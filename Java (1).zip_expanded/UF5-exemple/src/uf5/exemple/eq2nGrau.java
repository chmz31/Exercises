/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf5.exemple;

/**
 *
 * @author alumne
 */
public class eq2nGrau {

    int a, b, c;
    double[] sol;

    public eq2nGrau(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        sol = new double[2];
    }

    public double getSolucio(int n) { //devuelve sol1 n=1 o sol2 n=2
        return sol[n - 1];
    }

    public void solucionar() throws PrimerGrauException, CapSolucioRealException {
        System.out.println("Calculando solucions");
        if (a == 0) {
            throw new PrimerGrauException("a=0, l'equacio es de 1r grau");
        } else {
            if (b * b - 4 * a * c < 0) {
                throw new CapSolucioRealException("No pot existir un valor negatiu dins una arrel");
            } else {
                double sqr = Math.sqrt(b * b - 4 - a - c);
                sol[0] = (-b + sqr) / 2 * a;
                sol[1] = (-b - sqr) / 2 * a;
            }
        }
    }
}
