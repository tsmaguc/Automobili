/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tsmaguc
 */
public class MotorSUnutarnjimIzgaranjem extends Motor{
    private String gorivo;
    private double volumen;
    private double potrosnja;

    public String getGorivo() {
        return gorivo;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getPotrosnja() {
        return potrosnja;
    }
    
    @Override
    public String toString(){
        return "Snaga"+ getSnaga()+ "proizvodac" + getProizvodac()+ "gorivo "+getGorivo()+"volumen "+getVolumen()+"potrosnja "+getPotrosnja();
        
    }
    
    public MotorSUnutarnjimIzgaranjem(String aGorivo, double aVolumen, double aPotrosnja, double aSnaga, String aProizvodac){
        this.gorivo=aGorivo;
        this.volumen=aVolumen;
        this.potrosnja=aPotrosnja;
    }
    
}
