package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoCadastro implements TipoSolicitacao {
    private static TipoSolicitacaoCadastro tipoSolicitacaoCadastro = new TipoSolicitacaoCadastro();

    private TipoSolicitacaoCadastro() {
    }

    public static TipoSolicitacaoCadastro getTipoSolicitacaoCadastro() {
        return tipoSolicitacaoCadastro;
    }
}
