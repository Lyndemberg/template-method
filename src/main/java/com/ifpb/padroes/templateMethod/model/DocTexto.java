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
public class DocTexto extends Documento{

    private String titulo;
    private String intro;
    private String experimento;
    private String resultados;

    public DocTexto(String titulo, String intro, String experimento, String resultados) {
        this.titulo = titulo;
        this.intro = intro;
        this.experimento = experimento;
        this.resultados = resultados;
    }
    
    @Override
    protected void imprimirTitulo() {
        System.out.println(titulo);
    }

    @Override
    protected void imprimirIntro() {
        System.out.println(intro);
    }

    @Override
    protected void imprimirExperimento() {
        System.out.println(experimento);
    }

    @Override
    protected void imprimirResultados() {
        System.out.println(resultados);
    }

    
}
