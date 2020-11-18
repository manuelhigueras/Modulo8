/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumeracionesCartas;

public enum Palo {
    OROS(40), COPAS(30), ESPADAS(20), BASTOS(10);
    private int valor;
    private String simbolo;
    
    private Palo(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public String getSimbolo() {
        return simbolo;
    }

}
