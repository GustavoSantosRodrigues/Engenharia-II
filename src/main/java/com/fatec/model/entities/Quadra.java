package com.fatec.model.entities;

import com.fatec.model.entities.enums.QuadraTipo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quadra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Boolean cobertura; // coberta sim ou nao
    private Boolean arquibancada;
    private Boolean banco;
    private QuadraTipo quadraTipo;

    public Quadra() {
    }

    public Quadra(Boolean cobertura, Boolean arquibancada, Boolean banco, QuadraTipo quadraTipo) {
        this.cobertura = cobertura;
        this.arquibancada = arquibancada;
        this.banco = banco;
        this.quadraTipo = quadraTipo;
    }

    public Boolean getCobertura() {
        return cobertura;
    }

    public void setCobertura(Boolean cobertura) {
        this.cobertura = cobertura;
    }

    public Boolean getArquibancada() {
        return arquibancada;
    }

    public void setArquibancada(Boolean arquibancada) {
        this.arquibancada = arquibancada;
    }

    public Boolean getBanco() {
        return banco;
    }

    public void setBanco(Boolean banco) {
        this.banco = banco;
    }

    public QuadraTipo getQuadraTipo() {
        return quadraTipo;
    }

    public void setQuadraTipo(QuadraTipo quadraTipo) {
        this.quadraTipo = quadraTipo;
    }
}
