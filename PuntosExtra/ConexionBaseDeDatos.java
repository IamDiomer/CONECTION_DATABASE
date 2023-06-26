package PuntosExtra;

import java.sql.*;

public class ConexionBaseDeDatos {
    private static final String URL = "jdbc:mysql://localhost:3306/ComicsDB?characterEncoding=UTF-8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    public void obtenerComics (){
        try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Comics");
            while (rs.next()) {
                System.out.println(rs.getInt("id")+ " | " + rs.getString("titulo") + " | " + rs.getString("autor")+ " | " +rs.getString("editorial")+ " | " +rs.getInt("anio_publicacion") + " | " +rs.getDouble("precio"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void obtenerComicsPorId (int id) {
        try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Comics WHERE id = '" + id + "'");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("titulo") + " | " + rs.getString("autor") + " | " + rs.getString("editorial") + " | " + rs.getInt("anio_publicacion") + " | " + rs.getDouble("precio"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void obtenerComicsPorTitulo (String titulo) {
        try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Comics WHERE titulo = '" + titulo + "'");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("titulo") + " | " + rs.getString("autor") + " | " + rs.getString("editorial") + " | " + rs.getInt("anio_publicacion") + " | " + rs.getDouble("precio"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void obtenerComicsPorEditorial (String editorial) {
        try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Comics WHERE editorial = '" + editorial + "'");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("titulo") + " | " + rs.getString("autor") + " | " + rs.getString("editorial") + " | " + rs.getInt("anio_publicacion") + " | " + rs.getDouble("precio"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void obtenerComicsPorPrecioMenor (int precio) {
        try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Comics WHERE precio < '" + precio + "'");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("titulo") + " | " + rs.getString("autor") + " | " + rs.getString("editorial") + " | " + rs.getInt("anio_publicacion") + " | " + rs.getDouble("precio"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void obtenerComicsPorAnioAnterior (int anio) {
        try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Comics WHERE anio_publicacion < '" + anio + "'");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("titulo") + " | " + rs.getString("autor") + " | " + rs.getString("editorial") + " | " + rs.getInt("anio_publicacion") + " | " + rs.getDouble("precio"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
