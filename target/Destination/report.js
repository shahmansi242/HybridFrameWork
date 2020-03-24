$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/features/Registration.feature");
formatter.feature({
  "name": "User should able to register successfully,",
  "description": "  so that he can use all user features from our website",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should able to register",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@registration"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on register page",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userIsOnRegisterPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters all registration details",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userEntersAllRegistrationDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldAbleToRegisterSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});