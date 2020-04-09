/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
import java.util.Scanner;
public class Kettomb {
    public static void main(String[]args){
        int[] a=new int[5];
        int[] b=new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            do{
                System.out.println("Kérem a számot "+(i+1)+".: " );
                a[i]=sc.nextInt();
            }
            while((a[i]<1)||(a[i]>90));
        }
        boolean bennevan;
        int generalt;
        int c=0;
        while(c<5){
            generalt=(int)(Math.random()*90)+1;
            bennevan=false;
            for(int j=0; j<b.length; j++){
            if(generalt==b[j]){
                bennevan=true;
            }
            }
            if(bennevan==false){
                b[c]=generalt;
                c++;
            }        
    }
        System.out.println();
        System.out.print("a: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("b: ");
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
        int talalat=0;
        System.out.println();
        System.out.print("A találatok: ");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    talalat++;
                    System.out.print(b[j]+" ");
                }
            }
        }
        System.out.println();
        System.out.print("A találatok száma: "+talalat);
        System.out.println();
       
        int y;
        for (int i=0; i<(b.length-1); i++){
            for(int j=i+1; j<b.length; j++){
                if(b[i]>b[j]){
                    y=b[i];
                    b[i]=b[j];
                    b[j]=y;                   
                }
            }
        }
        System.out.println();
        System.out.print("Sorban b: ");
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
    }
}
