/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.padroes.templateMethod.main;

import com.ifpb.padroes.templateMethod.model.DocTexto;
import com.ifpb.padroes.templateMethod.model.Documento;

/**
 *
 * @author lyndemberg
 */
public class App {
    public static void main(String[] args) {
        Documento doc = new DocTexto("A origem dos Padrões de projeto",
                "Essa é a introdução do padrão Template Method",
                "Esse é o experimento que foi usado pra provar o quanto o Template Method é eficiente",
                "Aqui está os números que podem provar o quanto esse padrão pode ajudar ou dificultar sua vida");
        doc.imprimir();
    }
}
