/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumne
 */
public class CategoryDAO {
    
     DataBase d;
    
    public CategoryDAO(String ruta) {
       d=new DataBase(ruta+"/files/categories.txt"); 
    }
    
    public boolean findCategory(Category c){
        
        boolean flag=false;
        List<String> allFile=new ArrayList();
        allFile=d.allFile();
        
        for(String line: allFile){
            String [] pieces=line.split(":");
           
        }
        //recullo tot el fitxer
        //miro línia a línia si el meu usuari u esta en la línia
        //res més el trobi break i retorno true
        //si no el trobo el meu flag ja està a false
        return flag;
        
    }
    
    public int insertCategory(Category c){
        int inserted=0;
        //codi per inserir dins del fitxer
        
        inserted=d.insertToFile(c.toString());
        
        return inserted;
        
        
        
    }
}
