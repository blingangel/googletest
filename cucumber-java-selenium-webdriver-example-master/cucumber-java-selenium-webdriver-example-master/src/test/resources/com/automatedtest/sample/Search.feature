Feature: Search

#
#  @search @search_01
#  Scenario Outline: Search cucumber studio
#    Given A user navigates to HomePage "fr"
#    When a user searches for "cucumber studio"
#    Then "CucumberStudio" is displayed in the first "<nbOfResultsToSearch>" results
#
#    Examples:
#      | nbOfResultsToSearch |
#      | 1 |

  @search @search_02
  Scenario Outline: Search covid 19
    Given A user navigates to HomePage "com.vn"
    And user wait for "10" minutes in current page
    When a user searches for "vnexpress"
    Then "vnexpress" is displayed in the first "1" results
    Then a user clicks the first "//*[@id='rso']/div[1]/div/div/div/div/div/div/div[1]/a/h3" of the result
#    And a user prints the title
#    And a user prints the author of the article

    Examples:
      | nbOfResultsToSearch |
      | 4 |
