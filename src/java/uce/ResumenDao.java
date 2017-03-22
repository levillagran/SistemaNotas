/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JESSICA CHALCO
 */
public class ResumenDao {

    public List<Resumen> listar() throws SQLException {
        List<Resumen> lista = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/colegiojjc2?user=root&password=");
            PreparedStatement st = con.prepareStatement("SELECT id_calificaciones, nom_asignatura, final\n"
                    + "FROM calificaciones INNER JOIN asignaturas ON calificaciones.asignatura_id_asignatura=asignaturas.id_asignatura WHERE  calificaciones.estudiante_id_estudiante=6");
            //select codigo,nombreMateria,calificacion from T
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {

                Resumen resumen = new Resumen();
                resumen.setCodigo(rs.getInt("id_calificaciones"));
                resumen.setTipo_inspeccion(rs.getString("nom_asignatura")); //nombreMateria 
                resumen.setValor(rs.getDouble("final")); // nota
                lista.add(resumen);
            }
            rs.close();

        } catch (Exception e) {

        } finally {
            if (con != null) {
                con.close();
            }
        }
        return lista;
    }

    public List<entrar> entrada() throws SQLException {
        List<entrar> lista = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/colegiojjc2?user=root&password=");
            PreparedStatement st = con.prepareStatement("SELECT id,usuario,clave,nivel_acceso FROM usuarios");
            //select codigo,nombreMateria,calificacion from T
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {

                entrar resumen = new entrar();
                resumen.setId(rs.getInt("id"));
                resumen.setUsuario(rs.getString("usuario")); //nombreMateria 
                resumen.setClave(rs.getString("clave")); // nota
                resumen.setNivel_acceso(rs.getInt("nivel_acceso"));
                lista.add(resumen);
            }
            rs.close();

        } catch (Exception e) {

        } finally {
            if (con != null) {
                con.close();
            }
        }
        return lista;
    }

}
