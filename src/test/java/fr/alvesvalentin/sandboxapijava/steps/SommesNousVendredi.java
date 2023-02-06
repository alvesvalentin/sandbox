package fr.alvesvalentin.sandboxapijava.steps;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonnéqu;
import io.cucumber.java.fr.Quand;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CestVendredi {
    static String cestVendredi(String aujourdhui) {
        return "Vendredi".equals(aujourdhui) ? "Vendredi tout est permis" : "Non";
    }
}
public class SommesNousVendredi {
    private String reponseActuelle;
    private String aujourdhui;

    @Etantdonnéqu("aujourd'hui nous sommes Dimanche")
    public void aujourdHuiNousSommesDimanche() {
        aujourdhui = "Dimanche";
    }

    @Etantdonnéqu("aujourd'hui nous sommes Vendredi")
    public void aujourdHuiNousSommesVendredi() {
        aujourdhui = "Vendredi";
    }

    @Etantdonnéqu("aujourd'hui nous sommes {string}")
    public void aujourdHuiNousSommes(String jour) {
        aujourdhui = jour;
    }

    @Quand("Je demande si nous sommes vendredi")
    public void jeDemandeSiNousSommesVendredi() {
        reponseActuelle = CestVendredi.cestVendredi(aujourdhui);
    }

    @Alors("La réponse devrait être {string}")
    public void laRéponseDevraitÊtre(String reponseAttendu) {
        assertThat(reponseAttendu).isEqualTo(reponseActuelle);
    }
}