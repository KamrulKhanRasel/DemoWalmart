$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DemoClothingShopAll.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I want to be able to see shop all page",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-see-shop-all-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Walmart"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 8768848699,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User lands on Shop All page",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-see-shop-all-page;user-lands-on-shop-all-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Browse to Walmart homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "WalmartLogInSteps.browse_to_Walmart_homepage()"
});
formatter.result({
  "duration": 15424469200,
  "status": "passed"
});
formatter.after({
  "duration": 1464998701,
  "status": "passed"
});
formatter.uri("DemoWalmartLogIn.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I want to land on the Walmart homepage",
  "description": "",
  "id": "as-a-user-i-want-to-land-on-the-walmart-homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Walmart"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should be able to Login",
  "description": "",
  "id": "as-a-user-i-want-to-land-on-the-walmart-homepage;user-should-be-able-to-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Browse to Walmart homepage",
  "keyword": "Given "
});
formatter.examples({
  "comments": [
    {
      "line": 7,
      "value": "#When User provide correct \"\u003cUsername\u003e\" with \"\u003cPassword\u003e\""
    },
    {
      "line": 8,
      "value": "#Then Verify login"
    }
  ],
  "line": 10,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-to-land-on-the-walmart-homepage;user-should-be-able-to-login;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "as-a-user-i-want-to-land-on-the-walmart-homepage;user-should-be-able-to-login;;1"
    },
    {
      "cells": [
        "raselkhanwalmart@gmail.com",
        "123456abC"
      ],
      "line": 12,
      "id": "as-a-user-i-want-to-land-on-the-walmart-homepage;user-should-be-able-to-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6169611701,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should be able to Login",
  "description": "",
  "id": "as-a-user-i-want-to-land-on-the-walmart-homepage;user-should-be-able-to-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@Walmart"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Browse to Walmart homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "WalmartLogInSteps.browse_to_Walmart_homepage()"
});
formatter.result({
  "duration": 14514888899,
  "status": "passed"
});
formatter.after({
  "duration": 1434305300,
  "status": "passed"
});
});