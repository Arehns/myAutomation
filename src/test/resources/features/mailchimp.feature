Feature: Signing up to mailchimp
"""
  As a person who wants to join mailchimp
  I would like to get clear directions from sign up feature
  in order to get simple and carefree experience of the site.
  """

  Scenario Outline: Enter personal information
    Given user opens Sign up web page in browser "<browser>"
    And click on Accept all Cookies
    And enter "<email>"
    And and then enter "<username>"
    And then lastly enter "<password>"
    When user clicks on Sign up button
    Then user receives feedback"<status>"

    Examples:
      | browser | email       | username    | password  | status     |
      | chrome  | randomEmail | randomName  | Buggy123! | success    |
      | chrome  | noEmail     | randomName  | Buggy123! | emptyField |
      | chrome  | randomEmail | takenUser   | Buggy123! | duplicate  |
      | chrome  | randomEmail | tooLongName | Buggy123! | maximum    |
      | edge    | randomEmail | randomName  | Buggy123! | success    |
      | edge    | noEmail     | randomName  | Buggy123! | emptyField |
      | edge    | randomEmail | takenUser   | Buggy123! | duplicate  |
      | edge    | randomEmail | tooLongName | Buggy123! | maximum    |
      | firefox | randomEmail | randomName  | Buggy123! | success    |
      | firefox | noEmail     | randomName  | Buggy123! | emptyField |
      | firefox | randomEmail | takenUser   | Buggy123! | duplicate  |
      | firefox | randomEmail | tooLongName | Buggy123! | maximum    |
