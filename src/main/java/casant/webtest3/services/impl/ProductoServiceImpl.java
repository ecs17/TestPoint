/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casant.webtest3.services.impl;

import casant.webtest3.models.Producto;
import casant.webtest3.services.IProductoService;
import org.springframework.stereotype.Service;

/**
 *
 * @author EMP.EMMANUEL.CASTRO
 */
@Service("productoService")
public class ProductoServiceImpl implements IProductoService{

    @Override
    public Producto fineProducto(String claveCodigo) {
        Producto producto;
        System.out.println(claveCodigo);
        if (claveCodigo.equals("123")) {
            producto = new Producto();
            producto.setCodigoBarras("123");
            producto.setCodigo("algunoProd");
            producto.setNombre("alguno");
            producto.setDescripcion("alguno mas que describir");
            producto.setEstado(true);
            producto.setId(1);
            producto.setExistencia(12);
            producto.setPrecio(13.30f);
            producto.setIva(16);
            return producto;
        } else {
            return null;
        }
    }
    
}
