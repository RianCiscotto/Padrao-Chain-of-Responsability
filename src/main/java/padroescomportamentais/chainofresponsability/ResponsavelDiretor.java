package padroescomportamentais.chainofresponsability;

public class ResponsavelDiretor extends Responsavel {
    public ResponsavelDiretor(Responsavel superior) {
        listaSolicitacoes.add(TipoSolicitacaoFinanceiro.getTipoSolicitacaoFinanceiro());
        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }
}
