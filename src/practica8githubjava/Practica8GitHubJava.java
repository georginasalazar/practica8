/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8githubjava;

/**
 *
 * @author 52449
 */
public class Practica8GitHubJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        System.out.println("Practica8 GitHub-Java-Netbeans");
        System.out.println("Gina");
        int n1=7, n2=9;
        System.out.println("suma("+n1+","+n2+")="+suma(n1,n2));
        n1=4; n2=6;
        System.out.println("multiplica("+n1+","+n2+")="+multiplica(n1,n2));
    }
    
    public static int suma(int a, int b){
        return a+b;
    }
     public static int multiplica(int a, int b){
        return a*b;
    }
    
}
