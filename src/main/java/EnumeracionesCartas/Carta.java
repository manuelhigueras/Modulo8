package EnumeracionesCartas;

import java.util.Random;

public class Carta {
    //ATRIBUTO
    private Carta cartaPrincipal;
    private Palo palo; //"OROS","COPAS","ESPADAS", "BASTOS"
    private int valor;
    private Random rd = new Random();
    private Random rd2 = new Random();
    private int cartaAleatorio = rd.nextInt(4);
    private int paloAleatorio = rd.nextInt(12);
    private int pos = 4;
    private Palo[] cartaPalo;
    
    //CONSTRUCTOR
    public Carta(Palo palo, int valor){
        //VALIDAR
        this.palo = palo;
        this.valor = valor;
    }
    
    public Carta(){
        this.palo = null;
        this.valor = -1;
    }
 
    //falta parametro
//    public Carta(){
//        this.cartaPalo = new Palo[pos];
//    }
    
    //METODOS
    public int comparar(Carta otraCarta, Carta cartaPrincipal){
        int valorCarta = otraCarta.getValor();
        int valorCarta2 = cartaPrincipal.getValor();        
        if(valorCarta > valorCarta2)
            return valorCarta;
        if(valorCarta2 > valorCarta)
            return valorCarta2;
        else{
            System.out.println("NADIE GANA");
            return 0;
        }
    }
    
    
    public int compararV2(){
        return 0;
    }

    public Carta cambiarCartaValor(Carta otraCarta){
        if((otraCarta.palo.BASTOS == palo.BASTOS) || (otraCarta.palo.COPAS == palo.COPAS) || (otraCarta.palo.ESPADAS == palo.ESPADAS) || (otraCarta.palo.OROS == palo.OROS)){
            switch(this.cartaAleatorio){
                case 1: 
                    otraCarta.palo = palo.OROS;
                    this.valor = cartaAleatorio;
                break;
                case 2:
                    otraCarta.palo = palo.COPAS;
                    this.valor = cartaAleatorio;
                break;
                case 3:
                    otraCarta.palo = palo.ESPADAS;
                    this.valor = cartaAleatorio;
                break;
                case 4:
                    otraCarta.palo = palo.BASTOS;
                    this.valor = cartaAleatorio;
                break;
                default:
                    otraCarta.palo = getPalo();
                    this.valor = cartaAleatorio;
                break;
            }
        }
        return otraCarta;
    }
    
    public Palo getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }    

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", valor=" + valor + '}';
    }
    
    
    
}
