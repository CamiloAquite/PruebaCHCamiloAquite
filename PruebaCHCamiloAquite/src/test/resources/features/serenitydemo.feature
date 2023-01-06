Feature: Meeting creation and business unit
  As
  client
  I WANT TO
  create a meeting and a new business unit
  SO THAT
  I can make a meeting and a new business unit

  Background:
    Given User is in demoserenity

  Scenario: Success meeting creation
    When User create the meeting
    Then The user can successfully create the meeting

  Scenario: Success business unit creation
    When user create a business unit
    Then The user can select the business unit