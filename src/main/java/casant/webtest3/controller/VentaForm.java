/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casant.webtest3.controller;

import casant.webtest3.models.Producto;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

/**
 *
 * @author EMP.EMMANUEL.CASTRO
 */
@ManagedBean(name = "ventaForm")
@SessionScoped
public class VentaForm implements Serializable{
    private static final long   serialVersionUID    = 1L;

    private String codigo;
    private String nameDesc;
    private String pesoCantidad;
    private static final List<Producto> listaProducto = new  ArrayList<>();
    /**
     * Creates a new instance of VentaForm
     */
    public VentaForm() {
    }
    
    public String addProdCompra(){
        Producto producto = new Producto();
        producto.setCodigo(codigo);
        producto.setDescripcion("sasdsadasdadsdsa");
        producto.setCantidad("12");
        System.out.println(codigo + " - " + listaProducto.size());
        listaProducto.add(producto);
        return null;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPesoCantidad() {
        return pesoCantidad;
    }

    public void setPesoCantidad(String pesoCantidad) {
        this.pesoCantidad = pesoCantidad;
    }

    public String getNameDesc() {
        return nameDesc;
    }

    public void setNameDesc(String nameDesc) {
        this.nameDesc = nameDesc;
    }
    
    public List<Producto> getListaProducto() {
        return listaProducto;
    }

//    public void setListaProducto(List<Producto> listaProducto) {
//        this.listaProducto = listaProducto;
//    }
    
}
