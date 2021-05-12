Feature: Signing up to mailchimp

    Scenario Outline: Enter personal information
      Given user opens Sign up web page in browser "<browser>"
      And click on Accept all Cookies
      And enter "<email>"
      And and then enter <username>
      And then lastly enter "<password>"
      When user clicks on Sign up button
      Then user receives feedback

      Examples:
      |browser|email|username|password|
      |chrome |randomEmail|randomName|Buggy123!|
      |chrome|noEmail|randomName|Buggy123!|
      #|chrome|randomEmail|takenUser |Buggy123!|
      #|chrome|randomEmail|tooLongName|Buggy123!       |
    #  |edge |randomEmail|randomName|Buggy123!|
    #  |edge |noEmail|randomName|Buggy123!|
   #   |edge|randomEmail|takenUser|Buggy123!|
   #   |edge|randomEmail|tooLongName|Buggy123!       |
     # |firefox |randomEmail|randomName|Buggy123!|
   #   |firefox|noEmail|randomName|Buggy123!|
   #   |firefox|randomEmail|takenUser|Buggy123!|
    #   |firefox|randomEmail|tooLongName|Buggy123!       |