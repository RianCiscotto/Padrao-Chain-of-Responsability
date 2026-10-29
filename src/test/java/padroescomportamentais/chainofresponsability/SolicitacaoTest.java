package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolicitacaoTest {
    @Test
    void deveAtenderSolicitacaoSuporte() {
        Responsavel diretor = new ResponsavelDiretor(null);
        Responsavel gerente = new ResponsavelGerente(diretor);
        Responsavel coordenador = new ResponsavelCoordenador(gerente);
        Responsavel atendimento = new ResponsavelAtendimento(coordenador);
        assertEquals("Atendimento", atendimento.analisarSolicitacao(new Solicitacao(TipoSolicitacaoSuporte.getTipoSolicitacaoSuporte())));
    }

    @Test
    void deveAtenderSolicitacaoFinanceira() {
        Responsavel diretor = new ResponsavelDiretor(null);
        Responsavel gerente = new ResponsavelGerente(diretor);
        assertEquals("Diretor", gerente.analisarSolicitacao(new Solicitacao(TipoSolicitacaoFinanceiro.getTipoSolicitacaoFinanceiro())));
    }

    @Test
    void naoDeveAtenderSolicitacaoSemResponsavel() {
        Responsavel atendimento = new ResponsavelAtendimento(null);
        assertEquals("Sem atendimento", atendimento.analisarSolicitacao(new Solicitacao(TipoSolicitacaoCadastro.getTipoSolicitacaoCadastro())));
    }
}
