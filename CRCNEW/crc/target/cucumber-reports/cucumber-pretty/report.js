$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchAccountNumber2.feature");
formatter.feature({
  "line": 1,
  "name": "Survaeillance_FO_QA",
  "description": "In order to access Survaeillence for Advisor Portal\r\nAs an Advisor\r\nI want to validate all flows in Survaeillence for Advisor Portal",
  "id": "survaeillance-fo-qa",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3219128300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#10942564, 60605850, 10343619"
    }
  ],
  "line": 8,
  "name": "TC0030_BO_QA-Verify Survaeillance Link.",
  "description": "",
  "id": "survaeillance-fo-qa;tc0030-bo-qa-verify-survaeillance-link.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@BO_QA_210"
    },
    {
      "line": 7,
      "name": "@new1"
    },
    {
      "line": 7,
      "name": "@23"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Login to AP",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User navigates to Backoffice",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User navigates to Surveillance",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User is on Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Select the Account Number dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User search the Account Number",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clicks on view tab.",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User navigates to Account Number Page.",
  "keyword": "Then "
});
formatter.match({
  "location": "SAHomeStepDefination.APLogin()"
});
formatter.result({
  "duration": 2572249900,
  "status": "passed"
});
formatter.match({
  "location": "ReviewNumberStepDefination.navigateToBackOffice2()"
});
formatter.result({
  "duration": 3851670400,
  "status": "passed"
});
formatter.match({
  "location": "ReviewNumberStepDefination.navigateToSurveillance()"
});
formatter.result({
  "duration": 6468779100,
  "status": "passed"
});
formatter.match({
  "location": "ReviewNumberStepDefination.clickOnHomeTab()"
});
formatter.result({
  "duration": 4348042900,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "ReviewNumberStepDefination.VerifyViewTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1983218100,
  "status": "passed"
});
});