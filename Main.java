/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres
 * 
 * 
 */

package CSC4380;

    
    
 

/**
 *
 * @author Andres
 */
public class Main {
    //Declare the model view and controller here!
    
    
    public static myModel model;
    public static myController controller;
    public static myView view;
    
    
    
    public static void main(String[] args) {
    //Initialize each variable
    model = new myModel();
    view = new myView();
    controller = new myController(view,model);
    
    //Lets us see the view when project is running
    view.setVisible(true);
       
        
        
       
        
        
    }
}
