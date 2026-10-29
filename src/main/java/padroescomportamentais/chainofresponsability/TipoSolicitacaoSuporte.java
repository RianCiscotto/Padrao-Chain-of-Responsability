package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoSuporte implements TipoSolicitacao {
    private static TipoSolicitacaoSuporte tipoSolicitacaoSuporte = new TipoSolicitacaoSuporte();

    private TipoSolicitacaoSuporte() {
    }

    public static TipoSolicitacaoSuporte getTipoSolicitacaoSuporte() {
        return tipoSolicitacaoSuporte;
    }
}
