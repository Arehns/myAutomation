Feature: Signing up to mailchimp
  Background: Test the Sign up feature.


    Scenario Outline: Enter personal information
      Given I enter <email>, <username>, <password>
      When I click signup button
      Then I should be represented with <status>

      Examples:
      |email|username|password|status|
      |andrea.skriv@hotmail.com|AndreaAutoUppgift|Chocko1!|Success|
      |hxnpqvdepfhubmvdvf@kiabws.com|AaaaaAaaaaAaaaaAaaaaAaaaaAaaaaAaaaaAaaaaAaaaaAaaaaAaaaaAaaaaAaaaaAaaaaAaaaaAaaaaAaaaaAaaaaAaaaaAaaaaA|Buddy123|Fail|

