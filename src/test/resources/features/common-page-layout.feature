Feature: As a user I want to see header and footer on every page


  Scenario Outline: As a user I see header buttons on every page
    Given I am on '<pages>'
    Then I see '<buttons>' of '<pages>' is displayed

    Examples:
      | pages                  | buttons            |
      | homePage               | clubLogo           |
      | homePage               | homeButton         |
      | homePage               | tournamentsButton  |
      | homePage               | playersButton      |
      | homePage               | newsButton         |
#      | homePage              | contactsButton     |
      | homePage               | changeLanguageMenu |
      | homePage               | logInButton        |

      | tournamentsPage        | clubLogo           |
      | tournamentsPage        | homeButton         |
      | tournamentsPage        | tournamentsButton  |
      | tournamentsPage        | playersButton      |
      | tournamentsPage        | newsButton         |
#      | tournamentsPage       | contactsButton     |
      | tournamentsPage        | changeLanguageMenu |
      | tournamentsPage        | logInButton        |

      | playersPage            | clubLogo           |
      | playersPage            | homeButton         |
      | playersPage            | tournamentsButton  |
      | playersPage            | playersButton      |
      | playersPage            | newsButton         |
#      | playersPage           | contactsButton     |
      | playersPage            | changeLanguageMenu |
      | playersPage            | logInButton        |

#      | contactsPage           | clubLogo           |
#      | contactsPage           | homeButton         |
#      | contactsPage           | tournamentsButton  |
#      | contactsPage           | playersButton      |
#      | contactsPage           | newsButton         |
##      | contactsPage           | contactsButton     |
#      | contactsPage           | changeLanguageMenu |
#      | contactsPage           | logInButton        |

      | newsPage               | clubLogo           |
      | newsPage               | homeButton         |
      | newsPage               | tournamentsButton  |
      | newsPage               | playersButton      |
      | newsPage               | newsButton         |
#      | newsPage           | contactsButton     |
      | newsPage               | changeLanguageMenu |
      | newsPage               | logInButton        |

      | logInPage              | clubLogo           |
      | logInPage              | homeButton         |
      | logInPage              | tournamentsButton  |
      | logInPage              | playersButton      |
      | logInPage              | newsButton         |
#      | logInPage             | contactsButton     |
      | logInPage              | changeLanguageMenu |
      | logInPage              | logInButton        |

      | tournamentsDetailsPage | clubLogo           |
      | tournamentsDetailsPage | homeButton         |
      | tournamentsDetailsPage | tournamentsButton  |
      | tournamentsDetailsPage | playersButton      |
      | tournamentsDetailsPage | newsButton         |
#      | tournamentsDetailsPage | contactsButton     |
      | tournamentsDetailsPage | changeLanguageMenu |
      | tournamentsDetailsPage | logInButton        |

      | playerDetailsPage      | clubLogo           |
      | playerDetailsPage      | homeButton         |
      | playerDetailsPage      | tournamentsButton  |
      | playerDetailsPage      | playersButton      |
      | playerDetailsPage      | newsButton         |
#      | playerDetailsPage     | contactsButton     |
      | playerDetailsPage      | changeLanguageMenu |
      | playerDetailsPage      | logInButton        |

      | newsDetailsPage        | clubLogo           |
      | newsDetailsPage        | homeButton         |
      | newsDetailsPage        | tournamentsButton  |
      | newsDetailsPage        | playersButton      |
      | newsDetailsPage        | newsButton         |
#      | newsDetailsPage       | contactsButton     |
      | newsDetailsPage        | changeLanguageMenu |
      | newsDetailsPage        | logInButton        |




    # HomeaPage Tournaments Players LogIn SelectedTournament SelectedPlayer SelectedNews

