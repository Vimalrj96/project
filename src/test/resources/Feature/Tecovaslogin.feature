@vimal
Feature: User validate the login functionality Tecovas application

  Scenario Outline: 
           user validate the valid Username and Password

    Given User to Launch the Tecovas Application via ChromeBrowser
    When User to Click the Login button
    And User to Enter the Valid "<Username>" and "<Password>"
    Then User to Validate the Valid Credencial Page

    Examples: 
      |     Username           |  Password|
      | vimalraj720@gmail.com | vimal    |
      | prabu33@gmailcom      | prabu    |
      | abcd11@gmail.com      | abcd     |
