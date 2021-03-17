/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasswordStrengthProject;

/**
 *
 * @author Luke Shaffer
 */
public class PS_ClientClass {
    
    public boolean passwordLegitimacy(String userPassword){
        
        return lengthChecker(userPassword) && digitChecker(userPassword) && spaceChecker(userPassword) && upperCaseChecker(userPassword) &&
            lowerCaseChecker(userPassword);
    }
    
    public boolean lengthChecker(String userPassword){
        if(userPassword.length() > 10) {
            return true;
        } else {
            System.out.println("\n* Please create a password that is at least 10 characters *\n");
            return false;
        }
    }
    
    public boolean digitChecker(String userPassword){
        String digitRequirement = ".*\\d.*";
        if(userPassword.matches(digitRequirement)) {
            return true;
        } else {
            System.out.println("* Your password needs to have at least 2 numbers *\n");
            return false;
        }
   }
    
    public boolean spaceChecker(String userPassword){
        String spaceRequirement = ".*\\s.*";
        if(userPassword.matches(spaceRequirement)) {
            System.out.println("* You cannot have spaces in your password *\n");
            return false;
        } else {
            return true;
        }
    } 
    
    public boolean upperCaseChecker (String userPassword){
        String UCRequirement = ".*\\p{Upper}.*";
        if(userPassword.matches(UCRequirement)) {
            return true;
        } else {
            System.out.println("* Please have at least 1 upper case letter in your password! *\n");
            return false;
        }
    }
    
    public boolean lowerCaseChecker (String userPassword){
        String LCRequirement = ".*\\p{Lower}.*";
        if(userPassword.matches(LCRequirement)) {
            return true;
        } else {
            System.out.println("* Please have at least 1 lower case letter in your password! *\n");
            return false;
        }
    }
    
}
