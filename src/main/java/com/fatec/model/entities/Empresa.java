package com.fatec.model.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cnpj;
    private String telefone;
    private String email;

    @OneToMany
    private List<Usuario> usuarios;

    @OneToMany
    private List<Quadra> quadras;

    public Empresa() {
    }

    public Empresa(String nome, String cnpj, String telefone, String email, List<Usuario> usuarios, List<Quadra> quadras) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.usuarios = usuarios;
        this.quadras = quadras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Quadra> getQuadras() {
        return quadras;
    }

    public void setQuadras(List<Quadra> quadras) {
        this.quadras = quadras;
    }
}
