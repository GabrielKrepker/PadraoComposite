public class Objetivo extends Missao {

    private int recompensaXP;

    public Objetivo(String descricao, int recompensaXP) {
        super(descricao);
        this.recompensaXP = recompensaXP;
    }

    public int getRecompensaXP() {
        return recompensaXP;
    }

    public void setRecompensaXP(int recompensaXP) {
        this.recompensaXP = recompensaXP;
    }

    public String getConteudo() {
        return "Objetivo: " + this.getDescricao() + " - XP: " + this.recompensaXP + "\n";
    }
}