package PuntosExtra;
import java.sql.*;


public class Main {
    public static void main(String[] args) {
        ConexionBaseDeDatos conect = new ConexionBaseDeDatos();
        conect.obtenerComics();
        conect.obtenerComicsPorId(5);
        conect.obtenerComicsPorTitulo("The Flash: Rebirth");
        conect.obtenerComicsPorEditorial("DC Comics");
        conect.obtenerComicsPorPrecioMenor(15);
        conect.obtenerComicsPorAnioAnterior(2003);
    }

}

