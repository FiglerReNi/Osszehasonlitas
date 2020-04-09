/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class Ketszam {
    public static void main(String[]args){
        int a=(int)(Math.random()*101);
        int b=(int)(Math.random()*101);
        System.out.println("Az első szám: "+a);
        System.out.println("A második szám: "+b);
        int c=a;
        if(c<b){
           c=b;
        }
            System.out.println("A nagyobb szám a "+c);
    }    
}
