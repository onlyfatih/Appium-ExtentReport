Feature: Create Token Caller

  Background:
    Given url baseUrl
    And path 'auth'

  @create_token_caller
  Scenario: Create Token
    * def requestBody = read ('classpath:model/createToken.json')
    And request requestBody
    When method post
    Then status 200

    Scenario: Print General Token
      * print "General Token: " , generalToken
