
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import parcialnromanos.EntradaTexto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan Garay   Daniel Beltran
 */
public class PruebasEntrada {
    
    @Test
    public void valorVacio() throws IOException{
        String textoesperado="6";
        EntradaTexto entrada=new EntradaTexto();
        entrada.noVacio(textoesperado);
    }
    
    @Test
    public void enteroNoString() throws IOException{
        String textoesperado="5";
        EntradaTexto entrada=new EntradaTexto();
        entrada.esEntero(textoesperado);
    }
    
    @Test
    public void valorNegativo() throws IOException{
        int textoesperado=-13;
        EntradaTexto entrada=new EntradaTexto();
        entrada.esNegativo(textoesperado);
    }
    
    @Test
    public void valorCero() throws IOException{
        int textoesperado= 0;
        EntradaTexto entrada=new EntradaTexto();
        entrada.esCero(textoesperado);
    }
    
    @Test
    public void toDoSimbolosRomanos(){
        String simbolo = "5";
        String valorEsperado ="V";
        String simbolos = Constantes.getSimbolo(simbolo);
        Assert.assertEquals(valorEsperado, simbolo);
    }
    
    @Test
    public void toDoConcatenarValores(){
        String valor = "143";
        String valorEsperado = "CIVIII";
        String romano = NumerosRomanos.getNumeroRomano(valor);
        Assert.assertEquals(valorEsperado, romano);
    }
}
