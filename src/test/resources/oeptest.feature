Feature: OddEvenPrime Game Play

Scenario: Play the OEP to get ODD
    Given Create an OEP Game Play object
    When I Play the Game with number 3
    Then The result is "ODD"

Scenario: Play the OEP to Even
    Given Create an OEP Game Play object
    When I Play the Game with number 4
    Then The result is "EVEN"

Scenario: Play the OEP to ODD and PRIME
    Given Create an OEP Game Play object
    When I Play the Game with number 3
    Then The result is "PRIME"
