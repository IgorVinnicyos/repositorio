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
@Table(name="acessorio")
public class Acessorio {
    @Id
    @GeneratedValue
    @Column(name="codigo")
    private int codigo;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="preco")
    private double preco;

    public Acessorio(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Acessorio:" + "\ncodigo=" + codigo + "\nnome=" + nome + "\npreco=" + preco;
    }
    
    
}
