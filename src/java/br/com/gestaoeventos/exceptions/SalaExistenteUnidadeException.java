/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaoeventos.exceptions;

/**
 *
 * @author cleiton
 */
public class SalaExistenteUnidadeException extends Exception{
    
    public SalaExistenteUnidadeException(String mensagemErro){
        super(mensagemErro);
    }
    
}
