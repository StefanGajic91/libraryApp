Feature: library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts

  Background: Assuming user is on the login page
    Given user is on the login page

  Scenario: login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard


    Scenario: login as student
      When user enters student username
      And user enters student password
      Then user should see the dashboard
