package com.senaiFit.senaiFit.Dto;

public class CheckInDto {
    public Long usuarioId;
    public Long atividadeId;
    public int duracaoAtividade;

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getAtividadeId() {
        return atividadeId;
    }

    public void setAtividadeId(Long atividadeId) {
        this.atividadeId = atividadeId;
    }
    public int getDuracaoAtividade() {
        return duracaoAtividade;
    }

    public void setDuracaoAtividade(int duracaoAtividade) {
        this.duracaoAtividade = duracaoAtividade;
    }

}
