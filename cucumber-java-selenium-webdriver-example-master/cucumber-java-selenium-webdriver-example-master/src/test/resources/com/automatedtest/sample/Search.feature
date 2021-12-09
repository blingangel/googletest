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
    When a user searches for "Covid 19"
    Then "Covid 19" is displayed in the first "<nbOfResultsToSearch>" results
    Then a user clicks the first "(//div[@role='heading' and text()='Tin bài hàng đầu']//ancestor::div[@id='kp-wp-tab-overview']//*[contains(@id,'NEWS_ARTICLE_RESULT')])[1]" of the result
#    And a user prints the title
#    And a user prints the author of the article

    Examples:
      | nbOfResultsToSearch |
      | 4 |
