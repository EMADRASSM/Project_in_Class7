/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_in_class7;

import java.util.Scanner;

/**
 *
 * @author LAB
 */
public class Project_in_Class7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        DoubleLinkedList<String>  list = new DoubleLinkedList<>();
     
    
        int choice = -1 ; 
        
        Scanner in = new Scanner(System.in) ; 
        System.out.println("1 add First \t 2 add last \t3 remove first \t 4 remove last \n0 exit");
        
        while(choice != 0 )
        {
            System.out.println("Your choice ");
            choice = in.nextInt() ; 
            
            switch(choice)
            {
                case 0 :
                    System.exit(0);
                    break;   
                case 1  : 
                    System.out.println("input name ");
                    list.addFirst(in.next());
                    break;
                    
                case 2 : 
                    System.out.println("input name ");
                    list.addLast(in.next());
                    break;
                case 3 :
                    System.out.println("deleted is " + list.removeFirst());
                    break;
                case 4 :
                    System.out.println("deleted is " + list.removeLast());
                    break;  
            }
        
            System.out.println("first : "+list.first() + "\tlast : " + list.last() + "\tsize : " + list.size());
        }
        
        
        
    }
    
}
