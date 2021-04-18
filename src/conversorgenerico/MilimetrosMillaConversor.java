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
public class MilimetrosMillaConversor extends Conversor{
    public static final double UNA_MILLA = 1.609e+6;
    

    @Override
    public Double convertirValor1Valor2(Double milimetro) {
        return milimetro * UNA_MILLA;
    }

    @Override
    public Double convertirValor2Valor1(Double milla) {
        return milla / UNA_MILLA;
    }
    
}
