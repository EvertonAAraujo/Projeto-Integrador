/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.superClasses.SuperClasseUsuario;

/**
 *
 * @author Pedro Lucas
 */
public class UsuarioCliente extends SuperClasseUsuario{
   
    private boolean ofertasEmail;   

    public UsuarioCliente(String nome, String telefone, String nascimento, String usuario, String senha, String email, int cep, String rua, int Numero, String complemento, String bairro, String cidade, String estado, int id, boolean enable) {
        super(nome, telefone, nascimento, usuario, senha, email, cep, rua, Numero, complemento, bairro, cidade, estado, id, enable);
    }

   

       
    
    
}
