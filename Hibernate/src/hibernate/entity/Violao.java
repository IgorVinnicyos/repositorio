/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.entity;

import javax.persistence.*;


/**
 *
 * @author 151091797
 */
@Entity
@Table(name="estudante")
public class Violao {
    @Id
    @GeneratedValue
    @Column(name="codigo")
    private int codigo;
    
    @Column(name="qtd_cordas")
    private int qtd_cordas;
    
    @Column(name="tipo")
    private String tipo;
    
    @Column(name="modelo")
    private String modelo;

    public Violao(int qtd_cordas, String tipo, String modelo) {
        this.qtd_cordas = qtd_cordas;
        this.tipo = tipo;
        this.modelo = modelo;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtd_cordas() {
        return qtd_cordas;
    }

    public void setQtd_cordas(int qtd_cordas) {
        this.qtd_cordas = qtd_cordas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "violao: " + "\ncodigo=" + codigo + "\nqtd_cordas=" + qtd_cordas + "\ntipo=" + tipo + "\nmodelo=" + modelo ;
    }
    
    
}
