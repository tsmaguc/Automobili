/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tsmaguc
 */
public class Elektromotor extends Motor{
    private double moment;
    private double napon;
    private double efikasnost;

    public double getMoment() {
        return moment;
    }

    public double getNapon() {
        return napon;
    }

    public double getEfikasnost() {
        return efikasnost;
    }
    
    @Override
    public String toString(){
        return "Snaga "+ getSnaga()+ "proizvodac " + getProizvodac()+ "napon "+getNapon()+ "moment "+getMoment()+"efikasnost " + getEfikasnost();
        
    }
    
  
    public Elektromotor(double aMoment, double aEfikasnost, double aSnaga, double aProizvodac, double aNapon){
        this.moment=aMoment;
        this.efikasnost=aEfikasnost;
        this.napon=aNapon;
        
        
    }
    
    
    
}
