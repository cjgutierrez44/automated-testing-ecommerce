Feature: createAccount
  Scenario Outline: successful account creation
    Given the user is in the creation account page
    When completes the account creation form with data "<var_name>", "<var_last_name>", <var_phone>, "<var_email>", "<var_password>", "<var_department>", "<var_city>", "<var_street_type>", "<var_street>", "<var_address_number>", "<var_address_end>", "<var_additional_info_address>" and clicks the Register button
    Then the account should be created successfully
    And should have access to the ecommerce with credentials "<var_email>" and "<var_password>"
    And should see his name in the nav bar "<var_name>"
    Examples:
    |var_name |var_last_name  |var_phone |var_email       |var_password   |var_department |var_city   |var_street_type  |var_street |var_address_number |var_address_end  |var_additional_info_address  |
    |Jax      |Teller         |4526448   |jax@gmail.com   |mypassword123  |CAQUETÁ        |Florencia  |Calle            |flasa      |123                |c                |Apt 4                        |
    |Opie     |Winston        |4126689   |opie@gmail.com  |password456    |CESAR          |Curumaní   |Circunvalar      |7          |Sur                |1                |Casa                         |
    |Tara     |Knowles        |7452155   |tara@gmail.com  |pass123        |BOYACÁ         |Duitama    |Diagonal         |38         |c                  |#6               |Suite 22                     |