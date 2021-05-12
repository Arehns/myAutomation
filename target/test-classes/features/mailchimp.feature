Feature: Signing up to mailchimp


    Scenario Outline: Enter personal information
     Given user opens Sign up web page in browser "<browser>"
      #And enter "<email>"
     # And and then enter "<username>"
      #And then lastly enter "<password>"
     When user clicks on Sign up button
      #Then user receives feedback

      Examples:
      |browser|email|username|password|
      |chrome |goodman@gmail|tennessee|boy123!|
      |edge |no email  |tennessee|boy123!|
      |firefox|        |         |       |
