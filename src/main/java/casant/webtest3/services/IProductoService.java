/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casant.webtest3.services;

import casant.webtest3.models.Producto;

/**
 *
 * @author EMP.EMMANUEL.CASTRO
 */
public interface IProductoService {
    
    Producto fineProducto(String claveCodigo);
}
