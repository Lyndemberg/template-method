/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.padroes.templateMethod.model;

/**
 *
 * @author lyndemberg
 */
public abstract class Documento {

    public Documento() {
    }
    
    protected abstract void imprimirTitulo();
    protected abstract void imprimirIntro();
    protected abstract void imprimirExperimento();
    protected abstract void imprimirResultados();
    
    public final void imprimir(){
        System.out.println("--------TITULO--------");
        imprimirTitulo();
        System.out.println("--------INTRODUÇÃO--------");
        imprimirIntro();
        System.out.println("--------EXPERIMENTOS--------");
        imprimirExperimento();
        System.out.println("--------RESULTADOS--------");
        imprimirResultados();
    }
    
}
