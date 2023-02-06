
Feature: get a list of all users
  Scenario: oui
    When we call "/utilisateurs"
    Then we receive a status OK and:
    """
    {
      "id":1,
      "nom":"Truite",
      "prenom":"Gustave"
    }
    """