package com.senaiFit.senaiFit.entidade;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private int idade;
    @Column
    private String nome;
    @Column
    private String cpf;
    @Column
    private LocalDate dataNascimento;
    @Column
    private String endereco;
    @Column
    private char sexo;
    @Column
    private String peso;
    @Column
    private Double altura;
    @Column
    private Integer quantidadeCheckIn;
    @Column
    private Integer limiteAtividadeSemana;
    @Column(columnDefinition = "boolean default false" )
    private boolean superouLimiteSemanal;

    public boolean isSuperaLimiteAtividade() {
        return superouLimiteSemanal;
    }

    public void setSuperaLimiteAtividade(boolean superaLimiteAtividade) {
        this.superouLimiteSemanal = superaLimiteAtividade;
    }

    public Integer getLimiteAtividadeSemana() {
        return limiteAtividadeSemana;
    }

    public void setLimiteAtividadeSemana(Integer limiteAtividadeSemana) {
        this.limiteAtividadeSemana = limiteAtividadeSemana;
    }

    public Integer getQuantidadeCheckIn() {
        return quantidadeCheckIn;
    }

    public void setQuantidadeCheckIn(Integer quantidadeCheckIn) {
        this.quantidadeCheckIn = quantidadeCheckIn;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco='" + endereco + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
    }
