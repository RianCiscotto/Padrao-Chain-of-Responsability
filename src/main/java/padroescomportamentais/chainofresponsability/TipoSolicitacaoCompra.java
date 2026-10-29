package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoCompra implements TipoSolicitacao {
    private static TipoSolicitacaoCompra tipoSolicitacaoCompra = new TipoSolicitacaoCompra();

    private TipoSolicitacaoCompra() {
    }

    public static TipoSolicitacaoCompra getTipoSolicitacaoCompra() {
        return tipoSolicitacaoCompra;
    }
}
