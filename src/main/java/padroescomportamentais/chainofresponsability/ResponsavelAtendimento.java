package padroescomportamentais.chainofresponsability;

public class ResponsavelAtendimento extends Responsavel {
    public ResponsavelAtendimento(Responsavel superior) {
        listaSolicitacoes.add(TipoSolicitacaoSuporte.getTipoSolicitacaoSuporte());
        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendimento";
    }
}
