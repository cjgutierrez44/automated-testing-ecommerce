Feature: Login
  Scenario Outline: successful login
    Given the user is in the login page
    When enter his valid credentials "<var_email>" and "<var_password>" and clicks on enter button
    Then he should have access to manage his account "<var_name>"

    Examples:
    |var_email      |var_password |var_name |
    |tig@gmail.com  |asd123       |Tig      |