Feature: search result feature
  User Story: As a user, I should be able to login as librarian.
@smoke @regression
  Scenario: Table columns names
    Given user is on the login page
    And I login as a librarian
    And I click on Users link
    Then table should have following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |