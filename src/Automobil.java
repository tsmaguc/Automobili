/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tsmaguc
 */
public class Automobil {
    public String proizvodac;
    public String model;
    public int brojVrata;
    public String boja;
    public Motor engine;

    Automobil(String germany, String opel, int i, String crna) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getProizvodac() {
        return this.proizvodac;
    }

    public String getModel() {
        return this.model;
    }

    public int getBrojVrata() {
        return this.brojVrata;
    }

    public String getBoja() {
        return this.boja;
    }

    public Motor getEngine() {
        return this.engine;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public void setEngine(Motor engine) {
        this.engine = engine;
    }
    
    public Automobil(String aProizvodac, String aModel, int aBrojVrata, String aBoja, Motor aEngine){
        this.proizvodac=aProizvodac;
        this.model=aModel;
        this.brojVrata=aBrojVrata;
    }
    
    
     @Override
    public String toString(){
        return "engine "+ getEngine()+ "boja "+getBoja()+ "proizvodac "+ getProizvodac()+"model "+getModel()+ "broj vrata "+ getBrojVrata();
        
    }
    
  
   
    
    
}
