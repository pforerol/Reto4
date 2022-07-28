
package Controlador;

import Modelo.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Patricia Forero López
 */
public class CbSucursal {
    Connection connection;
    Conexion conexion = new Conexion();
    Statement st;
    ResultSet rs;
    
    public CbSucursal() {
        
    }
    
    public ArrayList getListaSucursales(){
        System.out.println("Funcion getListaSucursales");
        ArrayList mListaSucursales = new ArrayList();
        Sucursal sucursal = null;
//        String query ="SELECT idSucursal, nombreSucursal FROM `sucursal` ORDER BY nombreSucursal;";
        try{
            connection = conexion.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery("SELECT idSucursal, nombreSucursal FROM `sucursal` ORDER BY nombreSucursal;");
            while (rs.next()) {
                sucursal = new Sucursal();
                sucursal.setIdSucursal(rs.getInt("idSucursal"));
                sucursal.setNombreSucursal(rs.getString("nombreSucursal"));
                mListaSucursales.add(sucursal);
                }
            
        }catch(SQLException e){
            System.out.println(e);
        }
        System.out.println(mListaSucursales);
        return mListaSucursales;
    }
}
