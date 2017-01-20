/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Category;
/**
 *
 * @author alumne
 */
public class Product {
    private double idprod;
    private String nom;
    private String description;
    private double price;
    private double idcat;

    public Product(double idprod, String nom, String description, double price, double idcat) {
        this.idprod = idprod;
        this.nom = nom;
        this.description = description;
        this.price = price;
        this.idcat = idcat;
    }

    public double getIdprod() {
        return idprod;
    }

    public void setIdprod(double idprod) {
        this.idprod = idprod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getIdcat() {
        return idcat;
    }

    public void setIdcat(double idcat) {
        this.idcat = idcat;
    }
    
}
