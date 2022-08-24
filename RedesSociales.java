
package com.mycompany.redessociales;

/**
 *
 * @author Ana
 */
 import java.io.*;
public class RedesSociales {
    public static void main(String[] args)  {
        String archivo = "C:\\RedesSociales\\src\\main\\java\\com\\mycompany\\redessociales\\presenciaredes.csv";
  BufferedReader lector = null;
  String texto = "";
  int columnas=0;
  int filas=0;
  
  try {
   lector = new BufferedReader(new FileReader(archivo));
   while((texto = lector.readLine()) != null) {
    
    String[] row = texto.split(",(?=([^\"]\"[^\"]\")[^\"]$)"); 
    for(String index : row) {
     System.out.printf("%-10s", index);
    }
    System.out.println();
   }
  }
  catch(Exception e) {
   e.printStackTrace();
  }
 finally {
   try {
    lector.close();
   } catch (IOException e) {
    e.printStackTrace();
   }
  }
  String matriz [][] = new String [19][15];
  
 }
}
    
    

