/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorgenerico;

/**
 *
 * @author pablo.ziegler
 */
public class MilimetrosMetrosConversor extends Conversor{
    public static final int UN_METRO = 1000;
    
    @Override
    public Double convertirValor1Valor2(Double milimetro) {
        return milimetro * UN_METRO;
    }

    @Override
    public Double convertirValor2Valor1(Double metro) {
        return metro / UN_METRO;
    }
    
}
