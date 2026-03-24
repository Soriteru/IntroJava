/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monprojet;

/**
 *
 * @author sohan
 */
public class MonProjet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nom = "Dupont";
    String prenom = "Pierre";
    int anneeDeNaissance = 2002;
    
    int age = 2026 - anneeDeNaissance;
    
    String nomComplet = prenom + " " + nom;
        
        System.out.println(nomComplet + " est né en 2002 il a donc " + age + " ans.");
    
    }
    
}
