
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package CSC4380;

//The controller

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Button;
import CSC4380.myView;


public class myController {
    

    
public static myModel m;
public static myView v;
private ActionListener actionListener;


    public myController(myView v, myModel m){
        
        this.v = v;
        this.m = m;
        
        editItemListeners();
        addItemListeners();
        removeItemListeners();
        findTypeListeners();
        findColorListeners();
        findBrandListeners();
        findSizeListeners();
        findAllListeners();
        
}

   
    
    
    //Add Item Listener
    private void addItemListeners() {
        actionListener=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
                //Gets the type of clothing 
                String Type = m.getSampleType();
                
                //Gets the color
                String Color = m.getSampleColor();
                
                //Gets the brand of clothing 
                String Brand = m.getSampleBrand();
                
                //Gets the size of clothing 
                String Size = m.getSampleSize();
                
                
               
                //To access a private text field you must set getters and setters in the view
                
                //This should work but no database got connected
                //m.insert(Type,Color,Brand,Size);
                
                //View will display the values in the database that were added
                m.getDisplay(Type, Color, Brand, Size);
                v.setDisplay(Type, Color, Brand, Size);
                
                
            }
    };
    }
    
    
    //Edit Item Listener
    private void editItemListeners() {
        actionListener=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
                //Gets the type of clothing 
                String Type = m.getSampleType();
                
                //Gets the color
                String Color = m.getSampleColor();
                
                //Gets the brand of clothing 
                String Brand = m.getSampleBrand();
                
                //Gets the size of clothing 
                String Size = m.getSampleSize();
                
                
                
                
                
                

                //To access a private text field you must set getters and setters in the view
                

                 //m.update(Type,Color,Brand,Size);
                
                //This will show the inventory
                m.getDisplay(Type, Color, Brand, Size);
                v.setDisplay(Type, Color, Brand, Size);
                //v.setDisplay(m.getDisplay(Type, Color, Brand, Size));
                
                
            }
    };
    }
    
    
    //Remove Item Listener
    private void removeItemListeners() {
        actionListener=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              //Gets the type of clothing 
                String Type = m.getSampleType();
                
                //Gets the color
                String Color = m.getSampleColor();
                
                //Gets the brand of clothing 
                String Brand = m.getSampleBrand();
                
                //Gets the size of clothing 
                String Size = m.getSampleSize();
                
                
                
                
                

                
                
                //This will remove the item with these specific credentials
                
                //m.delete(Type, Color, Brand, Size);
                

                //This will show the current  inventory
                m.getDisplay(Type, Color, Brand, Size);
                v.setDisplay(Type, Color, Brand, Size);
                
                //v.setDisplay(m.getDisplay(Type, Color, Brand, Size));
                
            }
    };
    }
    
    
     //Find clothing type Listener
    private void findTypeListeners() {
        actionListener=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
               //Gets the type of clothing 
                String Type = m.getSampleType();
                
                //Gets the color
                String Color = m.getSampleColor();
                
                //Gets the brand of clothing 
                String Brand = m.getSampleBrand();
                
                //Gets the size of clothing 
                String Size = m.getSampleSize();
                
                
               
                //To access a private text field you must set getters and setters in the view
                

                //m.search(Type);
                
                //View will display the values in the database that were added
                m.getDisplay(Type, Color, Brand, Size);
                v.setDisplay(Type, Color, Brand, Size);
               // v.setDisplay(m.getDisplay(Type, Color, Brand, Size));                
                
            }
    };
    }
    
    
    //Find clothing color Listener
    private void findColorListeners() {
        actionListener=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
                //Gets the type of clothing 
                String Type = m.getSampleType();
                
                //Gets the color
                String Color = m.getSampleColor();
                
                //Gets the brand of clothing 
                String Brand = m.getSampleBrand();
                
                //Gets the size of clothing 
                String Size = m.getSampleSize();
               
                //To access a private text field you must set getters and setters in the view
                
                //This will search the database for a specific color 
                //This will make model search value to the color
                //m.read(Color);
                
                //View will display the values in the database that were added
                m.getDisplay(Type, Color, Brand, Size);
                v.setDisplay(Type, Color, Brand, Size);
               // v.setDisplay(m.getDisplay(Type, Color, Brand, Size));
                
                
            }
    };
    }
    
    //Find clothing brand Listener
    private void findBrandListeners() {
        actionListener=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
                //Gets the type of clothing 
                String Type = m.getSampleType();
                
                //Gets the color
                String Color = m.getSampleColor();
                
                //Gets the brand of clothing 
                String Brand = m.getSampleBrand();
                
                //Gets the size of clothing 
                String Size = m.getSampleSize();
                
                
               
                //To access a private text field you must set getters and setters in the view
                
                //This will search the database for a specific color 
                //This will make model search value to the color
                //m.search(Brand);
                
                //View will display the values in the database that were added
                m.getDisplay(Type, Color, Brand, Size);
                v.setDisplay(Type, Color, Brand, Size);
               //v.setDisplay(m.getDisplay(Type, Color, Brand, Size));
                
                
            }
    };
    }
    
    //Find clothing size Listener
    private void findSizeListeners() {
        actionListener=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
                //Gets the type of clothing 
                String Type = m.getSampleType();
                
                //Gets the color
                String Color = m.getSampleColor();
                
                //Gets the brand of clothing 
                String Brand = m.getSampleBrand();
                
                //Gets the size of clothing 
                String Size = m.getSampleSize();
                
               
                //To access a private text field you must set getters and setters in the view
                
                //This will search the database for a specific color 
                //This will make model search value to the color
               // m.read(Brand);
                
                //View will display the values in the database that were added
                m.getDisplay(Type, Color, Brand, Size);
                v.setDisplay(Type, Color, Brand, Size);
               //v.setDisplay(m.getDisplay(Type, Color, Brand, Size));
                
                
            }
    };
    }
    
    
    //Show closet Listener
    private void findAllListeners() {
        actionListener=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
               //Gets the type of clothing 
                String Type = m.getSampleType();
                
                //Gets the color
                String Color = m.getSampleColor();
                
                //Gets the brand of clothing 
                String Brand = m.getSampleBrand();
                
                //Gets the size of clothing 
                String Size = m.getSampleSize();
                
                
              //   m.read();
                m.getDisplay(Type, Color, Brand, Size);
                v.setDisplay(Type, Color, Brand, Size);
                //v.setDisplay(m.getDisplay(Type, Color, Brand, Size));
                 
            }
    };
    
    
    
    
         //Add item 
         v.newBtnListener(actionListener);
         //Edit Button
         v.editBtnListener(actionListener);
         //Remove Buttom
         v.removeBtnListener(actionListener);
         
         //Find Type Button
         v.typeBtnListener(actionListener);
         //Find Color Button
         v.colorBtnListener(actionListener);
          //Find Brand Button
         v.brandBtnListener(actionListener);
          //Find Size Button
         v.sizeBtnListener(actionListener);
         
                
     }


}
