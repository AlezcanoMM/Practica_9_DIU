package es.ulpgc.diu.diu_p9_maven;

import com.mysql.cj.jdbc.DatabaseMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DataBaseInfoLoader {
    private String user;
    private String password;
    private Connection cn;
    private Statement st;
    private DatabaseMetaData md;
    private ArrayList<String> tables;
    private ArrayList<String> fields;

    public void initialize(String user, String password){
        this.user = user;
        this.password = password;
        this.tables = new ArrayList<>();
        this.fields = new ArrayList<>();
    }
    
    public Boolean connect(){
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?zeroDateTimeBehavior=CONVERT_TO_NULL",user,password);
            st =cn.createStatement();
            md = (DatabaseMetaData) cn.getMetaData();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
    public ArrayList<String> getTables(){
        this.tables.clear();
        try {
            String[] types = {"TABLE"};
            ResultSet rs = md.getTables(null, null, "%", types);
            while (rs.next()) {
                String nombreTabla = rs.getString("TABLE_NAME");
                tables.add(nombreTabla);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseInfoLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tables;
    }
    public ArrayList<String> getFieldsTable(String table){
        this.fields.clear();
        ResultSet rs2;
        try {
            rs2 = md.getColumns(null, null, table, null);
            while (rs2.next()) {
                String nombreCampo = table+"."+rs2.getString("COLUMN_NAME");
                fields.add(nombreCampo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseInfoLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fields;
    }
}
