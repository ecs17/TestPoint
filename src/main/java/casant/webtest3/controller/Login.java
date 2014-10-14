/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casant.webtest3.controller;

import casant.webtest3.services.IUsuarioService;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 *
 * @author EMP.EMMANUEL.CASTRO
 */
@ManagedBean (name = "loginForm")
@RequestScoped
public class Login {

    private String userName;
    private String password;
    
    @ManagedProperty(value = "#{authenticationManager}")
    private AuthenticationManager authenticationManager;
    
    @ManagedProperty(value = "#{usuarioService}")
    private IUsuarioService usuarioService;
    /**
     * Creates a new instance of Login
     */
    public Login() {
    }
    
    public String login() {
        usuarioService.getUserLogin(userName, password);
        if (userName.equals("ecs17") && password.equals("casant")) {
            System.out.println("Estas aqui " + userName + " : " + password);
//            try {
//                Authentication request = new UsernamePasswordAuthenticationToken(this.getUserName(), this.getPassword());
//                Authentication result = authenticationManager.authenticate(request);
//                SecurityContextHolder.getContext().setAuthentication(result);
//            }catch(AuthenticationException e){
//                e.printStackTrace();
//            }
            return "mainForm";
        } else {
            System.out.println("Lo sentimos");
            return "unsecured";
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AuthenticationManager getAuthenticationManager() {
        return authenticationManager;
    }

    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    public IUsuarioService getUsuarioService() {
        return usuarioService;
    }

    public void setUsuarioService(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
}
