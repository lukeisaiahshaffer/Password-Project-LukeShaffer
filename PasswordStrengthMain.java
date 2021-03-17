/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasswordStrengthProject;

import java.util.Scanner;

/**
 *
 * @author Luke Shaffer
 */
public class PasswordStrengthMain {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        PS_ClientClass passwordChecker = new PS_ClientClass();
        
        System.out.println("Hello, Please create a password. Here are the guidelines...");
        System.out.println("1. At least 10 characters.");
        System.out.println("2. At least one lowercase character.");
        System.out.println("3. At least one uppercase character.");
        System.out.println("4. At least one special character.");
        System.out.println("5. NO SPACES");
        System.out.print("Enter your new password here --> ");
        
        String userPassword = userInput.nextLine();
        
        if(passwordChecker.passwordLegitimacy(userPassword)){
            System.out.println("This password is VALID!");
        } else {
            int incorrectPassword = 1;
            while (incorrectPassword == 1){
                System.out.println("Remember, your password needs:");
                System.out.println("1. At least 10 characters.");
                System.out.println("2. At least one lowercase character.");
                System.out.println("3. At least one uppercase character.");
                System.out.println("4. At least one digit.");
                System.out.println("5. NO SPACES");
                
                System.out.print("Please enter a new password --> ");
                userPassword = userInput.nextLine();
                if(passwordChecker.passwordLegitimacy(userPassword)){
                    incorrectPassword = 0;
                    System.out.println("Congratulations, this password is VALID!");
                }
            }
        }
        
        
    }
    
    
    
    
}
