/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author Alyson
 */
public class ArCondicionado {
    
    private String modelo, setor;
    private int despesas, idArCondicionado;
    private Data datafabricacao;

    public ArCondicionado(String modelo, String setor, int despesas, Data datafabricacao) {
        this.modelo = modelo;
        this.setor = setor;
        this.despesas = despesas;
        this.datafabricacao = datafabricacao;
    }

    public ArCondicionado(String modelo, String setor, int despesas, int idArCondicionado, Data datafabricacao) {
        this.modelo = modelo;
        this.setor = setor;
        this.despesas = despesas;
        this.idArCondicionado = idArCondicionado;
        this.datafabricacao = datafabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getDespesas() {
        return despesas;
    }

    public void setDespesas(int despesas) {
        this.despesas = despesas;
    }

    public int getIdArCondicionado() {
        return idArCondicionado;
    }

    public void setIdArCondicionado(int idArCondicionado) {
        this.idArCondicionado = idArCondicionado;
    }

    public Data getDatafabricacao() {
        return datafabricacao;
    }

    public void setDatafabricacao(Data datafabricacao) {
        this.datafabricacao = datafabricacao;
    }
    
    
    
    
    
}
