public class Jogo {

    private Missao missao;

    public void setMissao(Missao missao) {
        this.missao = missao;
    }

    public String getMissao() {
        if (this.missao == null) {
            throw new NullPointerException("Jogo sem missões");
        }
        return this.missao.getConteudo();
    }
}