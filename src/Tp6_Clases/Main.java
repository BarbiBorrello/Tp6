 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp6_Clases;


import Tp6_Clases.Cliente;
import Tp6_Clases.Directorio;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Barbara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     /* Crear 5 clientes cliente(long dni, String nombre, String apellido, String ciudad, String direccion) */
        Cliente cliente1 = new Cliente(123456789, "Juan", "Perez", "Cordoba", "Calle falsa 123");
        Cliente cliente2 = new Cliente(987654321, "Pedro", "Gomez", "Buenos Aires", "Calle falsa 123");
        Cliente cliente3 = new Cliente(123499789, "Juan", "Perez", "San Luis", "Calle falsa 123");
        Cliente cliente4 = new Cliente(987654321, "Pedro", "Gomez", "Buenos Aires", "Calle falsa 123");
        Cliente cliente5 = new Cliente(123456789, "Juan", "Perez", "Cordoba", "Calle falsa 123");



        /* crear un directorio */
        Directorio directorio = new Directorio();

        /* agregar los clientes al directorio */
        directorio.agregarCliente(126456498,cliente1);
        directorio.agregarCliente(151251656,cliente2);
        directorio.agregarCliente(236372358,cliente3);
        directorio.agregarCliente(124583469,cliente4);
        directorio.agregarCliente(756807342,cliente5);

        /* mostrar el directorio */
        System.out.println(directorio.buscarCliente(126456498).getApellido());

        System.out.println("********************");
        /* for item en Lista directorio.buscarTelefono(123456498) */
        Set<Long> lista = directorio.buscarTelefono("Ruiz");

        for (Long item : lista) {
            System.out.println(item);
        }

        Set<Cliente> lista2 = directorio.buscarClientes("Cordoba");

        for (Cliente item : lista2) {
            System.out.println(item.getApellido());
        }

        System.out.println("********************");

        directorio.borrarCliente(126456498);
        directorio.agregarCliente(126456498,cliente4);

        Set<Cliente> lista3 = directorio.buscarClientes("Cordoba");

        for (Cliente item : lista3) {
            System.out.println(item.getApellido());
        }
    
    }
}
