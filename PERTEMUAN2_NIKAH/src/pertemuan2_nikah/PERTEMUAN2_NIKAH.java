/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan2_nikah;

/**
 *
 * @author christselvon
 */
public class PERTEMUAN2_NIKAH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int umur = 25;
        String muka = "Gak Cantik";
        String otak = "Gak Pintar";
        
        if (umur>=20&&umur<=23&&muka=="Cantik"&&otak=="Pintar"){
            
        System.out.println("Pasti Mau!");
    }
    else if ((umur>=20&&umur<=23)&&(muka=="Cantik"||otak=="Gak Pintar")){
            System.out.println("Ok Lah");
    }
    else if ((umur>23||otak=="Gak Pintar")&& muka=="Cantik"){
            System.out.println("Saya Pikir Dulu");
    }
    else {
            System.out.println("No Way!");
    }
   
}
}
