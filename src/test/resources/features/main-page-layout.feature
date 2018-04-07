@runThis
Feature: Main Page layout
  As a user I want to be able to see tournaments grids on the main page.


  Scenario Outline: As a user I see header buttons on every page
    Given I am on '<pages>'
    Then I see '<buttons>' of '<pages>' is displayed

    Examples:
      | pages    | buttons           |
      | homePage | homeButton        |
      | homePage | tournamentsButton |
      | homePage | playersButton     |

