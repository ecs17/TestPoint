/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casant.webtest3.services.impl;

import casant.webtest3.models.Usuario;
import casant.webtest3.services.IUsuarioService;
import org.springframework.stereotype.Service;

/**
 *
 * @author EMP.EMMANUEL.CASTRO
 */
@Service("usuarioService")
public class UsuarioServiceImpl implements IUsuarioService{

    @Override
    public Usuario getUserLogin(String user, String password) {
        System.out.println("Estas en el servicio: " + user + " - " + password);
        Usuario usuario = new Usuario();
        usuario.setName(user);
        return usuario;
    }
    
}
