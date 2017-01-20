/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alumne
 */
public class Category {
    private int idcat;
    private String name;

    
    //constructor
    
    public Category(int idcat, String name) {
        this.idcat = idcat;
        this.name = name;
    }
    
    //accessors

    public double getIdcat() {
        return idcat;
    }

    public void setIdcat(int idcat) {
        this.idcat = idcat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    //methods
    
    
    
    
}
