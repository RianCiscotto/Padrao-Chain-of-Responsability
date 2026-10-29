package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoContrato implements TipoSolicitacao {
    private static TipoSolicitacaoContrato tipoSolicitacaoContrato = new TipoSolicitacaoContrato();

    private TipoSolicitacaoContrato() {
    }

    public static TipoSolicitacaoContrato getTipoSolicitacaoContrato() {
        return tipoSolicitacaoContrato;
    }
}
