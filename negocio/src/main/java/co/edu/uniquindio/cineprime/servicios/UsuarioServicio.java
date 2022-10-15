package co.edu.uniquindio.cineprime.servicios;

import co.edu.uniquindio.cineprime.entidades.*;

import java.util.ArrayList;
import java.util.Optional;

public interface    UsuarioServicio {




    /**
     * Método para registrar usuario
     * @param cedula Es la id del usuario este debe ser único
     * @param email es el correo del usuario y debe ser único
     * @param contrasena esta es la contraseña del usuario asociada a la cuenta del usuario
     * @param nombre corresponde al nombre digitado por el usuario
     * @param codigoCiudad corresponde a la ciudad que se encuentra el usuario.
     * @return
     * @throws Exception
     */
    Usuario registrarUsuario(int cedula,String email,String contrasena,String nombre,int codigoCiudad) throws Exception;

    void crearBono(int cantidad);

    void usarBono(String cifrado,Usuario usuario) throws Exception;

    Usuario verificarLogin(String email, String contrasena) throws Exception;

    /**NOINOSNOSNOSNOS
     * Metodo para recuperar la contraseña de la cuenta de usuario con el correo
     * @param email correo de cuenta de usuario
     * @return contraseña de cuenta
     * @throws Exception no existe el correo asociada a ninguna cuenta
     */
    void recuperarContrasenaCorreo(String email) throws Exception;


















    ArrayList<Usuario> obtenerUsuarios();
    Usuario guardarUsuario(Usuario usuario) throws Exception;
    Optional<Usuario> obtenerPorId(int id);
    boolean eliminarUsuario(int id);



}
