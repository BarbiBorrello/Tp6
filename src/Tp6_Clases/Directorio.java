/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp6_Clases;

import java.util.*;

/**
 *
 * @author Barbara
 */
public class Directorio {

    public Directorio() {
    }
    
    

    HashMap<Long, Cliente> directorio = new HashMap<>();

    public boolean agregarCliente(long telefono, Cliente cliente ) {
        if (!directorio.containsKey(telefono)){
            directorio.put(telefono,cliente);
            return true;
        }else {
            return false;
        }   
    }


    public Cliente buscarCliente(long telefono) {
        return directorio.get(telefono);

    }

    Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new HashSet<>();
        for (Long telefono : directorio.keySet()) {
            if (directorio.get(telefono).getApellido().equals(apellido)) {
                telefonos.add(telefono);
            }
        }
        System.out.println("Telefono encontrado");
        return telefonos;
        
    }
    
    public Set<Cliente> buscarClientes(String p_ciudad) {

        Set<Cliente> clientes = new HashSet<>();

        for (Cliente cliente : directorio.values()) {
            if (cliente.getCiudad().equals(p_ciudad)) {
                clientes.add(cliente);
            }
        }
        System.out.println("Cliente encontrado");
        return clientes;
    }
    

    public void borrarCliente(long telefono) {
        if (directorio.containsKey(telefono)) {
            directorio.remove(telefono);
        }
        System.out.println("Cliente borrado");
    }
}
