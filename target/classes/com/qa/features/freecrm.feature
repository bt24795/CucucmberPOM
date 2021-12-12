Feature: FreeCRM Application Test
#Without example keyword
Scenario: Validate FreeCRM HomePage Test

Given user opens browser
When user is already on login page
Then user logs into page
Then user validates the title of Home page
#Then user validates loggedin user