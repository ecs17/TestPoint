/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casant.webtest3.controller;

import casant.webtest3.models.Producto;
import casant.webtest3.services.impl.ProductoServiceImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

/**
 *
 * @author EMP.EMMANUEL.CASTRO
 */
@ManagedBean(name = "productoForm")
@SessionScoped
public class ProductoForm implements Serializable{
    
    private static final long   serialVersionUID    = 1L;
    private List<Producto> listProductos;
    private Producto producto;
    private String claveCodigo;
    private Integer cantidadToAdd;
    
    @ManagedProperty( value = "#{productoService}")
    ProductoServiceImpl productoService;
    
    public String addProducto() {
        producto.setCantidad(producto.getCantidad()+cantidadToAdd);
        System.out.println("algunoProd = " + producto.getCodigo() + " y " + producto.getCantidad());
        return "success";
    }
    
    public void finedProducto() {
        producto = new Producto();
        producto = productoService.fineProducto(claveCodigo);
        if (producto != null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Correcto", "Producto Encontrado"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_WARN, "Info", "No se encontraron productos con la clave correspondiente"));
        }
    }

    public List<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(List<Producto> listProductos) {
        this.listProductos = listProductos;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getClaveCodigo() {
        return claveCodigo;
    }

    public void setClaveCodigo(String claveCodigo) {
        this.claveCodigo = claveCodigo;
    }

    public ProductoServiceImpl getProductoService() {
        return productoService;
    }

    public void setProductoService(ProductoServiceImpl productoService) {
        this.productoService = productoService;
    }

    public Integer getCantidadToAdd() {
        return cantidadToAdd;
    }

    public void setCantidadToAdd(Integer cantidadToAdd) {
        this.cantidadToAdd = cantidadToAdd;
    }
    
}
