/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tsmaguc
 */
public class Motor {
    private double snaga;
    private String proizvodac;

    public String getProizvodac() {
        return this.proizvodac;
    }

    public double getSnaga() {
        return this.snaga;
    }
    
    @Override
    public String toString(){
        return "Snaga"+ getSnaga()+ "proizvodac" + getProizvodac();
        
    }
    
}
