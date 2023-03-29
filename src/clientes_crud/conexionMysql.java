
/*package clientes_crud;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class conexionMysql {
    
    Connection cn;
    
    public Connection conectar(){
        try{
         Class.forName("com.mysql.jdbc.Driver");
         cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/crudclientes","root","");
         System.out.println("CONECTADO");
        }catch(Exception e){
                System.out.println("ERROR"+e);
        }return cn;
    }
}*/
package clientes_crud;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexionMysql {

    Connection cn;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/crudclientes", "root", "");
            System.out.println("CONECTADO");
        } catch (Exception e) {
            System.out.println("ERROR" + e);
        }
        return cn;
    }
}
