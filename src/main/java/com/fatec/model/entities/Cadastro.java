package com.fatec.model.entities;

import com.fatec.model.entities.enums.TipoPagamento;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCliente;

    private String cpf;

    private String logradouro;

    private String cel;

    private String email;

    private Date dataHoraEntrada;

    private Date dataHoraSaida;

    private Date dia;

    private Double valor;

    private TipoPagamento tipoPagamento;

    public Cadastro() {
    }

    public Cadastro(Long id, String nomeCliente, String cpf, String logradouro, String cel, String email, Date dataHoraEntrada, Date dataHoraSaida,
                    Date dia, Double valor, TipoPagamento tipoPagamento) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.logradouro = logradouro;
        this.cel = cel;
        this.email = email;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.dia = dia;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(Date dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public Date getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(Date dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
