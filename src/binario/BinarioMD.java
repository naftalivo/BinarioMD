/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class BinarioMD {

    /**
     * @param args the command line arguments
     */
    
    private static char um='1';
    private static char zero ='0';
    private static String frase="";
    private static int quant;
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        gerar(5,3);
    }
    
   

    
    public static void gerar(int n,int m){
        for(int i = 0; i<m;i++)
         frase = frase + um;
        
        for(int i = m; i<n;i++)
         frase = frase + zero;
   
        quant = n;
        
       
        bin(frase);
        
        
        
        
    }
    
    
    static int cont= 0;
    static String nw="";
    static String other;
    public static void bin(String outra){
        
        if(!outra.equalsIgnoreCase(frase) || cont ==0){
           
          
                nw = nw+ outra.charAt(quant-1);
                
                for (int i = 0; i<quant-1;i++)
                    nw = nw + outra.charAt(i);
                
               
            cont++;
            System.out.println(nw);
            other = nw;
            nw="";
            bin(other);
            
        }
    }
    
}
