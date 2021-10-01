/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formulas;


/**
 *
 * @author Vladimir
 */
public class Esfera implements IEsfera {
    
    public Esfera(){
       
      }
    private Double r;
        
    private String radio;

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public Esfera(String radio) {
        this.radio = radio;
    }
    
    
    @Override
    public Double volumen(Double r) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //return ( Math.PI*(r*r*r)*(4/3) );
         
        float a = 4;
        float b = 3;
        return ( Math.PI*(r*r*r)*(a/b) );
        
    }

    @Override
    public Double superficie(Double r) {
      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
        float a = 4;
        float b = 1;
        return ( Math.PI*(r*r)*(a/b) );
      
    }

    @Override
    public Double areaCirculo(Double r) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 2*(Math.PI)*r*r;
    }

    @Override
    public Double perimetroCirculo(Double r) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 2*(Math.PI)*r;
    }

    @Override
    public void setR(Double r) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        r=r;
    }

    @Override
    public Double getR() {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return r;
    }
    
    
    
}
    
    
    

