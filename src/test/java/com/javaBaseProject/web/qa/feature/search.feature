Feature:Demo Feature on Google Website

  Background:
    Given user on the homepage

  @smoke
  Scenario: User searches on google
    When search "kloia" on search page
    Then verify that the search result contains the keyword "kloia"