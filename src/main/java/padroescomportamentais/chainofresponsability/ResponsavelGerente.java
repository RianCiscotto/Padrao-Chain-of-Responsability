package padroescomportamentais.chainofresponsability;

public class ResponsavelGerente extends Responsavel {
    public ResponsavelGerente(Responsavel superior) {
        listaSolicitacoes.add(TipoSolicitacaoContrato.getTipoSolicitacaoContrato());
        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}
