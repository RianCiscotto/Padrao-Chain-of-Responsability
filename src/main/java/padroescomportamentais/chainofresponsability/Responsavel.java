package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Responsavel {
    protected ArrayList listaSolicitacoes = new ArrayList();
    private Responsavel responsavelSuperior;

    public Responsavel getResponsavelSuperior() {
        return responsavelSuperior;
    }

    public void setResponsavelSuperior(Responsavel responsavelSuperior) {
        this.responsavelSuperior = responsavelSuperior;
    }

    public abstract String getDescricaoCargo();

    public String analisarSolicitacao(Solicitacao solicitacao) {
        if (listaSolicitacoes.contains(solicitacao.getTipoSolicitacao())) return getDescricaoCargo();
        else if (responsavelSuperior != null) return responsavelSuperior.analisarSolicitacao(solicitacao);
        else return "Sem atendimento";
    }
}
