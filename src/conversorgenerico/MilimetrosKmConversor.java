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
public class MilimetrosKmConversor extends Conversor{
    public static final double UN_KILOMETRO = 1e+6;
    

    @Override
    public Double convertirValor1Valor2(Double milimetro) {
        return milimetro * UN_KILOMETRO;
    }

    @Override
    public Double convertirValor2Valor1(Double km) {
        return km / UN_KILOMETRO;
    }
    
}
