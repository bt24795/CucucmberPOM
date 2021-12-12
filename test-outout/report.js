$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Selenium_Class/Selenium_WorkSpace/CucucmberPOM/src/main/java/com/qa/features/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Application Test",
  "description": "",
  "id": "freecrm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#Without example keyword"
    }
  ],
  "line": 3,
  "name": "Validate FreeCRM HomePage Test",
  "description": "",
  "id": "freecrm-application-test;validate-freecrm-homepage-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is already on login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user logs into page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user validates the title of Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 5294138000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 48518100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_logs_into_page()"
});
formatter.result({
  "duration": 3610373300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_validates_the_title_of_Home_page()"
});
formatter.result({
  "duration": 4799100,
  "status": "passed"
});
});