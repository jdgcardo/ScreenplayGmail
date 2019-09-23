#Autor: Juan Garcia

  Feature: Send email
    As a user
  I want to use Gmail
  to send an email.

  Scenario: Using Gmail to send email
    Given that user want to use Gmail
    When he send the email
    Then he sees the email on sent directory