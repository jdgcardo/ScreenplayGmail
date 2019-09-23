#Autor: Juan Garcia

  Feature: Google Translate
    As a web user
  I want to use Google Translator
  to translate word between different languages

  Scenario: Translate from Source Language to Target Language
    Given that Juan want to use Google Translate
    When he translate the word Table from english to spanish
    Then he should see the word Mesa on the screen
