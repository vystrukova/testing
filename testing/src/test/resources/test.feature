Feature: login
  Scenario: User redirected to yandex mail from main page
    Given I visit mail.yandex.ru page
    When I press the Login button
    And I enter username in the username field
    And I press the Next button
    And I enter password in the password field
    And I press Next button
    Then I should see the mail Yandex page

