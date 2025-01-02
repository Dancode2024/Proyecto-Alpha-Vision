package com.Cine.Controller;

import com.Cine.mysql.conexion.Cine_db;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Administrador {

    Cine_db db;

    // Categoria
    public Administrador() {
        db = new Cine_db(); // Inicializar la conexi�n
    }

    public boolean actualizarCategoria(int id, String titulo, String categoria) {
        String sql = "UPDATE peliculas SET titulo =? genero = ?, WHERE id = ?";
        try (Connection con = (Connection) db.getConnection();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {

            pst.setString(1, titulo.trim());
            pst.setString(2, categoria.trim());
            pst.setInt(3, id);

            int filasAfectadas = pst.executeUpdate();

            return filasAfectadas > 0; // Devuelve true si se actualiz� alguna fila
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar los datos: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarCategoriaPorId(int id) {
        // String sqlHorarios = "DELETE FROM horarios WHERE id = ?";
        String sqlPeliculas = "DELETE FROM peliculas WHERE id = ?";
        try (Connection con = (Connection) db.getConnection()) {
            con.setAutoCommit(false); // Iniciar transacci�n
            try (PreparedStatement pstPeliculas = (PreparedStatement) con.prepareStatement(sqlPeliculas)) {

                // Eliminar registro en peliculas
                pstPeliculas.setInt(1, id);
                pstPeliculas.executeUpdate();

                con.commit(); // Confirmar transacci�n
                return true;
            } catch (SQLException e) {
                con.rollback(); // Revertir cambios en caso de error
                JOptionPane.showMessageDialog(null, "Error al eliminar los registros relacionados: " + e.getMessage());
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.getMessage());
            return false;
        }
    }

    public boolean agregarCategoria(String titulo, String categoria) {
        String sql = "INSERT INTO peliculas (titulo, genero) VALUES (?, ?)";
        try (Connection con = (Connection) db.getConnection();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
            pst.setString(1, titulo.trim());
            pst.setString(2, categoria.trim());

            int filasAfectadas = pst.executeUpdate();

            return filasAfectadas > 0; // Devuelve true si se insert� con �xito
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la categor�a: " + e.getMessage());
            return false;
        }
    }

    // HORARIOS
    public boolean eliminarHorarioPorId(int id) {
        String sql = "DELETE FROM horarios WHERE id = ?";
        try (Connection con = (Connection) db.getConnection();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {

            pst.setInt(1, id); // Asignar el ID al par�metro
            int filasAfectadas = pst.executeUpdate();

            return filasAfectadas > 0; // Retorna true si se elimin� con �xito
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el horario: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarHorario(int id, String nuevoHorario) {
        String sql = "UPDATE horarios SET hora = ? WHERE id = ?";
        try (Connection con = (Connection) db.getConnection();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
            pst.setString(1, nuevoHorario.trim());
            pst.setInt(2, id);

            int filasAfectadas = pst.executeUpdate();

            return filasAfectadas > 0; // Devuelve true si se actualiz� con �xito
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el horario: " + e.getMessage());
            return false;
        }
    }

    public boolean agregarHorario(String horario) {
        String sql = "INSERT INTO horarios (hora) VALUES (?)";
        try (Connection con = (Connection) db.getConnection();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
            pst.setString(1, horario.trim());

            int filasAfectadas = pst.executeUpdate();

            return filasAfectadas > 0; // Devuelve true si se agreg� con �xito
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar horario: " + e.getMessage());
            return false;
        }
    }

    // USUARIO
    public boolean eliminarUsuario(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try (Connection con = (Connection) db.getConnection();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
            pst.setInt(1, id);
            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0; // Devuelve true si se elimin� con �xito
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar usuario: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarUsuario(int id, String nombre, String usuario, String pass) {
        String sql = "UPDATE usuarios SET nombre = ?, usuario = ?, contrase�a = ? WHERE id = ?";
        try (Connection con = (Connection) db.getConnection();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
            pst.setString(1, nombre);
            pst.setString(2, usuario);
            pst.setString(3, pass);
            pst.setInt(4, id);

            int filasAfectadas = pst.executeUpdate();

            return filasAfectadas > 0; // Devuelve true si se actualiz� correctamente
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar usuario: " + e.getMessage());
            return false;
        }
    }

    public boolean agregarUsuario(String nombre, String usuario, String pass) {
        String sql = "INSERT INTO usuarios (nombre, usuario, contrase�a, rol_id) VALUES (?, ?, ?, 2)";
        try (Connection con = (Connection) db.getConnection();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
            pst.setString(1, nombre);
            pst.setString(2, usuario);
            pst.setString(3, pass);

            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0; // Devuelve true si se agreg� correctamente
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar usuario: " + e.getMessage());
            return false;
        }
    }

    // RESERVA
    public boolean eliminarReservaPorId(int id) {
        String sql = "DELETE FROM reservas WHERE id = ?";
        try (Connection con = (Connection) db.getConnection();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
            pst.setInt(1, id);
            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la reserva: " + e.getMessage());
            return false;
        }
    }

    public boolean editarReserva(int id, String titulo, String horario, String categoria,
            String fecha, String precio, String usuario) {
        String sql = "UPDATE reservas SET titulo = ?, horario = ?, categoria = ?, fecha = ?, precio = ?, usuario = ? WHERE id = ?";
        try (Connection con = (Connection) db.getConnection();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
            pst.setString(1, titulo);
            pst.setString(2, horario);
            pst.setString(3, categoria);
            pst.setString(4, fecha);
            pst.setString(5, precio);
            pst.setString(6, usuario);
            pst.setInt(7, id);

            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0; // Retorna true si la actualizaci�n fue exitosa
        } catch (SQLException e) {
            System.err.println("Error al editar la reserva: " + e.getMessage());
            return false;
        }
    }

    public boolean agregarReserva(String titulo, String horario, String categoria,
            String fecha, String precio, String usuario) {
        String sql = "INSERT INTO reservas (titulo, horario, categoria, fecha, precio, usuario) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = (Connection) db.getConnection();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
            pst.setString(1, titulo);
            pst.setString(2, horario);
            pst.setString(3, categoria);
            pst.setString(4, fecha);
            pst.setString(5, precio);
            pst.setString(6, usuario);

            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0; // Retorna true si la inserci�n fue exitosa
        } catch (SQLException e) {
            System.err.println("Error al agregar la reserva: " + e.getMessage());
            return false;
        }
    }

    // PRODUCTOS

    public boolean eliminarProductoPorId(int id) {
        String sql = "DELETE FROM productos WHERE id = ?";
        try (Connection con = (Connection) db.getConnection();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
            pst.setInt(1, id);
            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el producto: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarProducto(int id, String usuario, String producto,
            String categoria, String precio, String cantidad) {
        String sql = "UPDATE productos SET usuario = ?, nombre = ?, categoria = ?, precio = ?, cantidad = ? WHERE id = ?";
        try (Connection con = (Connection) db.getConnection();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {

            // Establece los valores en la consulta preparada
            pst.setString(1, usuario);
            pst.setString(2, producto);
            pst.setString(3, categoria);
            pst.setString(4, precio);
            pst.setString(5, cantidad);
            pst.setInt(6, id);

            // Ejecuta la actualizaci�n y verifica si hubo filas afectadas
            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0; // Retorna true si se actualiz� correctamente

        } catch (SQLException e) {
            System.err.println("Error al actualizar producto: " + e.getMessage());
            return false; // Retorna false si ocurri� alg�n error
        }
    }

    public boolean agregarProducto(String usuario, String producto, String categoria, String precio, String cantidad) {
        String sql = "INSERT INTO productos (usuario, producto, categoria, precio, cantidad) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = (Connection) db.getConnection();
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {

            // Asigna los valores a la consulta
            pst.setString(1, usuario);
            pst.setString(2, producto);
            pst.setString(3, categoria);
            pst.setString(4, precio);
            pst.setString(5, cantidad);

            // Ejecuta la consulta y verifica si hubo filas afectadas
            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0; // Retorna true si el producto fue agregado con �xito

        } catch (SQLException e) {
            System.err.println("Error al agregar producto: " + e.getMessage());
            return false; // Retorna false si ocurri� alg�n error
        }
    }
}
