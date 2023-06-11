Feature: post feature of facebook
  This will test the post functionality at the user wall
  Scenario: post a message on user wall
    Given User should be logged in and should be present on his wall
    When I type the message in the box
    And Click on post button
    Then The message should get posted
  @SmokeTest
  Scenario:Post a video on user wall
    Given User should be logged in and should be present at its own wall
    When User supply the youtube link in the textbox
    And Click on post button
    Then Video should get posted on the user wall
    And The video should have proper thumbnail
