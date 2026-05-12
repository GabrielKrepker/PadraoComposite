import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JogoTest {

    @Test
    void deveRetornarMissaoCompleta() {

        MissaoComposta missaoPrincipal = new MissaoComposta("Salvar o Reino");

        Objetivo obj1 = new Objetivo("Derrotar 10 inimigos", 100);
        Objetivo obj2 = new Objetivo("Coletar espada lendária", 200);

        MissaoComposta subMissao = new MissaoComposta("Explorar a caverna");
        subMissao.addMissao(new Objetivo("Encontrar entrada secreta", 50));
        subMissao.addMissao(new Objetivo("Derrotar boss da caverna", 150));

        missaoPrincipal.addMissao(obj1);
        missaoPrincipal.addMissao(obj2);
        missaoPrincipal.addMissao(subMissao);

        Jogo jogo = new Jogo();
        jogo.setMissao(missaoPrincipal);

        String esperado =
                "Missao: Salvar o Reino\n" +
                        "Objetivo: Derrotar 10 inimigos - XP: 100\n" +
                        "Objetivo: Coletar espada lendária - XP: 200\n" +
                        "Missao: Explorar a caverna\n" +
                        "Objetivo: Encontrar entrada secreta - XP: 50\n" +
                        "Objetivo: Derrotar boss da caverna - XP: 150\n";

        assertEquals(esperado, jogo.getMissao());
    }
}