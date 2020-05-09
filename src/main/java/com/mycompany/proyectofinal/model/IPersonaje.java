/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinal.model;

import java.util.Set;

/**
 *
 * @author educa
 */
public interface IPersonaje {
    boolean createPersonaje( int codigo,String nombre,int ataque,int defensa);
    boolean deletePersonaje();
    boolean editPersonaje();
    
    Set<IPersonaje> listAllClients();
    
    
}
