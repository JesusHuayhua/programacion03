
package org.pucp.airsoft.companies.aerolinea.mysql;

import org.pucp.airsoft.companies.aerolinea.dao.AerolineaDao;
import org.pucp.airsoft.companies.model.Aerolinea;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import org.pucp.airsoft.config.DBManager;
/**
 *
 * @author USUARIO
 */
public class AerolineaMySQL implements AerolineaDao{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    @Override
    public int insertar(Aerolinea value) {
        int resultado = 0;
        try{
            //registrar un driver de conexion
            Class.forName("com.mysql.cj.jdbc.Driver");
            //realizamos la conexion
            con = DBManager.getInstance().getConnection(); //otra forma
            //FORMATEAMOS LA FECHA SINO SALE ERROR DE DATE
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFormateada = sdf.format(value.getFechaFundacion());
            String sql = "INSERT INTO aerolinea (nombre, callsign, tiene_programa_fidelidad, fecha_fundacion, descripcion) " +
             "VALUES ('" + value.getNombre() + "', '" + value.getCallsign() + "', 1, '" + fechaFormateada + "', '" + value.getDescripcion() + "')";
            st = con.createStatement();
            st.executeUpdate(sql); // si fuuera query solo seria query en vez de update
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){ System.out.println(ex.getMessage());}
            
            
        }
        //buscar en mysql driver -> conectors
        return resultado;
    }

    @Override
    public int modificar(Aerolinea area) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminar(int idArea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
