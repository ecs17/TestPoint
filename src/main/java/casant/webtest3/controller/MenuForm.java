/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casant.webtest3.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author EMP.EMMANUEL.CASTRO
 */
@ManagedBean(name="menuForm")
@SessionScoped
public class MenuForm implements Serializable{
    private static final long   serialVersionUID    = 1L;
    private String view;
    
    public String ventas(){
        return "ventaForm";
    }
    
    public void altaProducto() {
        this.view = "altaProductoForm.xhtml";
    }
    
    public void bajaProducto() {
        this.view = "bajaProductoForm.xhtml";
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
    
}
