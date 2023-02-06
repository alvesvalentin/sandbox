# language: fr
Fonctionnalité: Sommes nous vendredi ?
  Tous le monde aimerait savoir si nous sommes vendredi

  Scénario: Dimanche n'est pas vendredi
    Etant donné qu'aujourd'hui nous sommes Dimanche
    Quand Je demande si nous sommes vendredi
    Alors La réponse devrait être "Non"

  Scénario: Vendredi c'est vendredi
    Etant donné qu'aujourd'hui nous sommes Vendredi
    Quand Je demande si nous sommes vendredi
    Alors La réponse devrait être "Vendredi tout est permis"


  Plan du Scénario: Est-ce que aujourd'hui nous sommes vendredi ou pas ?
  Etant donné qu'aujourd'hui nous sommes "<jour>"
  Quand Je demande si nous sommes vendredi
  Alors La réponse devrait être "<reponse>"
  Exemples:
    | jour     | reponse                  |
    | Lundi    | Non                      |
    | Mardi    | Non                      |
    | Mercredi | Non                      |
    | Jeudi    | Non                      |
    | Vendredi | Vendredi tout est permis |
    | Samedi   | Non                      |
    | Dimanche | Non                      |

