/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC4380;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Arilok
 */
public class myBean {
    public static myModel model;
     
    private Connection conn = null;
    private Statement st = null;
    private ResultSet rs;
    
    public myBean() throws ClassNotFoundException, SQLException{
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:../closet.db");
        st = conn.createStatement();
    }

    
    public void addNew(String Table, String typeInput, String colorInput, String brandInput, String sizeInput) throws SQLException{
        String query="insert into " + Table + "values (";
        query+= " " + typeInput + colorInput + brandInput + sizeInput + ")";
        st.executeUpdate(query);
    }
    
    
    public ArrayList read(String Table) throws SQLException{
        String query="SELECT * from " + Table + " ";
        ArrayList output=new ArrayList();
        rs = st.executeQuery(query);
        return output;
    }
    public ArrayList readType(String Table, String typeInput) throws SQLException{
        String query="SELECT" + typeInput + "from " + Table + " ";
        ArrayList output=new ArrayList();
        rs = st.executeQuery(query);
        return output;
    }
    public ArrayList readColor(String Table, String colorInput) throws SQLException{
        String query="SELECT" + colorInput + "from " + Table + " ";
        ArrayList output=new ArrayList();
        rs = st.executeQuery(query);
        return output;
    }
    public ArrayList readBrand(String Table, String brandInput) throws SQLException{
        String query="SELECT" + brandInput + "from " + Table + " ";
        ArrayList output=new ArrayList();
        rs = st.executeQuery(query);
        return output;
    }
    public ArrayList readSize(String Table, String sizeInput) throws SQLException{
        String query="SELECT" + sizeInput + "from " + Table + " ";
        ArrayList output=new ArrayList();
        rs = st.executeQuery(query);
        return output;
    }
    
    
    public int updateType(String Table, String col, String value, String rowID, String valueID) throws SQLException{
        String query="Update "+Table+" SET "+col+" = "+value+" WHERE "+rowID+" = "+valueID+"";
        st.executeUpdate(query);
        int out =0;
        return out;
    }
    public int updateColor(String Table, String col, String value, String rowID, String valueID) throws SQLException{
        String query="Update "+Table+" SET "+col+" = "+value+" WHERE "+rowID+" = "+valueID+"";
        st.executeUpdate(query);
        int out =0;
        return out;
    }
    public int updateBrand(String Table, String col, String value, String rowID, String valueID) throws SQLException{
        String query="Update "+Table+" SET "+col+" = "+value+" WHERE "+rowID+" = "+valueID+"";
        st.executeUpdate(query);
        int out =0;
        return out;
    }
    public int updateSize(String Table, String col, String value, String rowID, String valueID) throws SQLException{
        String query="Update "+Table+" SET "+col+" = "+value+" WHERE "+rowID+" = "+valueID+"";
        st.executeUpdate(query);
        int out =0;
        return out;
    }
    
    
    public int delete(String Table, String typeInput, String colorInput, String brandInput, String sizeInput) throws SQLException{
        String query="";
        
        st.executeUpdate(query);

        return 0;
    }
}