Feature: library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts

  Background: Assuming user is on the login page
    Given user is on the login page
@regression
    Scenario: Login as librarian
      When user enters librarian "librarian1@library"
      And user enters librarian "rs4BNN9G"
      Then user should see the dashboard
@regression
      Scenario: Login as student
        When user enters student "student1@library"
        And user enters student "i2A9TgXa"
        Then user should see the dashboard
@regression
        Scenario: Login as librarian in the same line
          When I login using "librarian1@library" and "qu9mrvur"
          Then user should see the dashboard
          And there should be "23" users


