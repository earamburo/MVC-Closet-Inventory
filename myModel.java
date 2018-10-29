package CSC4380;

import java.awt.event.ActionListener;
import java.beans.*;
import java.io.Serializable;



public class myModel implements Serializable{
    
    public static myView view;
    
    public static final String PROP_SAMPLE_BRAND = "sampleBrand";
    public static final String PROP_SAMPLE_COLOR = "sampleColor";
    public static final String PROP_SAMPLE_TYPE = "sampleType";
    public static final String PROP_SAMPLE_SIZE = "sampleSize";
    private String values = "";
    private String sampleBrand;
    private String sampleColor;
    private String sampleType;
    private String sampleSize;
    private PropertyChangeSupport propertySupport;
    
    public myModel(){
        propertySupport = new PropertyChangeSupport(this); 
    }
    public String getDisplay(){
        if (values=="") values="0";
        return values;
    }
    
    public String getSampleBrand(){
        return sampleBrand;
    }
    public void setSampleBrand(String value){
        String oldValue = sampleBrand;
        sampleBrand = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_BRAND, oldValue, sampleBrand);
        
    }
    public String getSampleColor(){
        return sampleColor;
    }
    public void setSampleColor(String value){
        String oldValue = sampleColor;
        sampleColor = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_COLOR, oldValue, sampleColor);
        
    }
    public String getSampleType(){
        return sampleType;
    }
    public void setSampleType(String value){
        String oldValue = sampleType;
        sampleType = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_TYPE, oldValue, sampleType);
       
    }
    public String getSampleSize(){
        return sampleSize;
    }
    public void setSampleSize(String value){
        String oldValue = sampleSize;
        sampleSize = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_SIZE, oldValue, sampleSize);
        
    }
    public void addPropertyChangeListener(PropertyChangeListener listener){
        propertySupport.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListner(PropertyChangeListener listener){
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
