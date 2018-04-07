@runThis
Feature: Main Page layout
  As a user I want to be able to see tournaments grids on the main page.

  #ADD CHECKING FOR LABELS CURRENT PAST AND FUTURE


  Scenario Outline: As a user I see current, future and completed tournament tables on the main page
    Given I am on main page
    Then I see '<tables>' tournament table
    Examples:
      | tables             |
      | currentTournaments |
      | futureTournaments  |
      | lastTournaments    |

  Scenario Outline: As a user I should see current, future and completed tournament tables rows count < or = 5
    Given I am on main page
    Then I see for '<tables>' tournament table rows count is less or equal to 5
    Examples:
      | tables             |
      | currentTournaments |
      | futureTournaments  |
      | lastTournaments    |


  Scenario Outline: As a user I should see current, future and completed tournament tables contain all required columns
    Given I am on main page
    Then I see for '<tables>' tournament table corresponding columns
      | Название Турнира |
      | Начало           |
      | Завершение       |
      | Статус           |
      | Доступ           |
      | Формат Турнира   |
      | Макс. игроков    |
    Examples:
      | tables             |
      | currentTournaments |
      | futureTournaments  |
      | lastTournaments    |