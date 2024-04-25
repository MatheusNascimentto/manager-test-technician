package com.manager.user.service.exception;
import com.manager.user.dto.CausaErroDto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NaoAutorizadoExcecao extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private String mensagem;
    private CausaErroDto causa;

    public NaoAutorizadoExcecao(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public NaoAutorizadoExcecao(String mensagem, CausaErroDto causa) {
        super();
        this.mensagem = mensagem;
        this.causa = causa;
    }

}
