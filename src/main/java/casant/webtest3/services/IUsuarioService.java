/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casant.webtest3.services;

import casant.webtest3.models.Usuario;

/**
 *
 * @author EMP.EMMANUEL.CASTRO
 */
public interface IUsuarioService {
    
    /*
    Verifica si el usuario existe y si sus credenciales son correctas, y devuelve un objeto @Usuario
    con todas las propiedades
    @return Usuario
    @param user
    @param password
    */
    Usuario getUserLogin(String user, String password);
}
