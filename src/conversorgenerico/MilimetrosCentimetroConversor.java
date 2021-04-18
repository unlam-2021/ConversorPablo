/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorgenerico;

import javax.swing.SwingConstants;

/**
 *
 * @author pablo.ziegler
 */
public class MilimetrosCentimetroConversor extends Conversor{
    public static final int UN_CENTIMETRO = 10;
    
    
    @Override
    public Double convertirValor1Valor2(Double milimetros) {
        
        return milimetros * UN_CENTIMETRO;
        
    }

    @Override
    public Double convertirValor2Valor1(Double centimetros) {
        
        return centimetros / UN_CENTIMETRO;
        
    }
    
    
}
