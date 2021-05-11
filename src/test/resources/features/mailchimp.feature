Feature: Signing up to mailchimp


    Scenario Outline: Enter personal information
     Given user opens up browser "<browser>"
      And navigates to Sign up webpage
      * enter "<email>"
      * enter "<username>"
      * enter "<password>"
      When user clicks on Sign up button
      Then user receives feedback

      Examples:
      |browser|email|username|password|
      |chrome |good@gmail|tenessee|boii123!|
      |chrome |no email  |tenessee|boii123!|
