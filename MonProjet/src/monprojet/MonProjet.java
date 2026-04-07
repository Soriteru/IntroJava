/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monprojet;

import java.util.ArrayList;

/**
 *
 * @author sohan
 */
public class MonProjet {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        ArrayList<Float> notes = new ArrayList<Float>();
        
        notes.add((float)12.5);
        notes.add((float)13);
        notes.add((float)15);
        
        System.out.println("Affichage de la liste :"+notes);
        
        notes.set(1,15F);
        
        System.out.println("Affichage de la liste modifier :"+notes);
        
        notes.add((float)12);
        notes.add((float)15);
        notes.add((float)16);
        
        System.out.println("Affichage de la liste :"+notes);
        
        float somme = 0;
        
        for(int i=0; i < notes.size(); i++){
            somme = somme + notes.get(i);
        }
        
        int len = notes.size();
        float moyenne = somme/len;
        
        System.out.println("La moyenne des notes est : "+moyenne);
    }
}
