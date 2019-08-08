/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import java.util.Scanner;
/**
 *
 * @author Harkirat Cheema
 */
public class Main {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        //int size=input.nextInt();
        System.out.println("Enter Name of Four Players ");
        
        System.out.print("Enter first player Name: ");
        String name1=input.nextLine();
        
        System.out.print("Enter Second player Name: ");
        String name2=input.nextLine();
        
        System.out.print("Enter Third player Name: ");
        String name3=input.nextLine();
        
        System.out.print("Enter Fourth player Name: ");
        String name4=input.nextLine();
        
        Player player=new Player(name1,name2,name3,name4){
            public void play(){
                System.out.println("");  
            };
        };
        
        GroupOfCards.generateHand();
        GroupOfCards.shuffle();
        GroupOfCards.showCards();
        
    }
    
}
