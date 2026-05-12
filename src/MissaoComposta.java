import java.util.ArrayList;
import java.util.List;

public class MissaoComposta extends Missao {

    private List<Missao> missoes;

    public MissaoComposta(String descricao) {
        super(descricao);
        this.missoes = new ArrayList<>();
    }

    public void addMissao(Missao missao) {
        this.missoes.add(missao);
    }

    public String getConteudo() {
        String saida = "";
        saida = "Missao: " + this.getDescricao() + "\n";
        for (Missao missao : missoes) {
            saida += missao.getConteudo();
        }
        return saida;
    }
}