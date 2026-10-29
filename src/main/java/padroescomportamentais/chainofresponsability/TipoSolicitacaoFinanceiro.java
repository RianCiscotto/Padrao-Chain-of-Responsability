package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoFinanceiro implements TipoSolicitacao {
    private static TipoSolicitacaoFinanceiro tipoSolicitacaoFinanceiro = new TipoSolicitacaoFinanceiro();

    private TipoSolicitacaoFinanceiro() {
    }

    public static TipoSolicitacaoFinanceiro getTipoSolicitacaoFinanceiro() {
        return tipoSolicitacaoFinanceiro;
    }
}
