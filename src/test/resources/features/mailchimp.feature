Feature: Signing up to mailchimp

    Scenario Outline: Enter personal information
      Given user opens Sign up web page in browser "<browser>"
      And click on Accept all Cookies
      And enter "<email>"
      And and then enter "<username>"
      And then lastly enter "<password>"
      When user clicks on Sign up button
      Then user receives feedback

      Examples:
      |browser|email|username|password|
      |chrome |random email|randomName|Buggy123!|
      # |chrome|no email|randomName|Buggy123!|
      #|chrome|random email|AndreaAutoUppgift |Buggy123!|
      #|chrome|random email|tooLongName|Buggy123!       |
    #  |edge |random email|randomName|Buggy123!|
    #  |edge |no email|randomName|Buggy123!|
      |edge|random email|AndreaAutoUppgift|Buggy123!|
   #   |edge|"random email"|tooLongName|Buggy123!       |
     # |firefox |random email|randomName|Buggy123!|
   #   |firefox|"no email"|randomName|Buggy123!|
   #   |firefox|random email|AndreaAutoUppgift|Buggy123!|
       |firefox|random email|tooLongName|Buggy123!       |