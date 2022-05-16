$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SignPage.feature");
formatter.feature({
  "line": 2,
  "name": "SignPage Test",
  "description": "As user I want to SignPage into automation website",
  "id": "signpage-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@signinpage"
    }
  ]
});
formatter.before({
  "duration": 14117878600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to SignIn page successfully",
  "description": "",
  "id": "signpage-test;user-should-navigate-to-signin-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Signin link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should verify AUTHENTICATION message",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 116970800,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.iClickOnSigninLink()"
});
formatter.result({
  "duration": 7702902100,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.iShouldVerifyAUTHENTICATIONMessage()"
});
formatter.result({
  "duration": 40090064300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h1[normalize-space()\u003d\u0027Authentication\u0027]\"}\n  (Session info: chrome\u003d101.0.4951.67)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027DESKTOP-ET865OO\u0027, ip: \u0027192.168.0.206\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [08539e5acffcae3fcf06a430c9a31873, findElement {using\u003dxpath, value\u003d//h1[normalize-space()\u003d\u0027Authentication\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.67, chrome: {chromedriverVersion: 101.0.4951.41 (93c720db8323..., userDataDir: C:\\Users\\kgoth\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:64671}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:64671/devtoo..., se:cdpVersion: 101.0.4951.67, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 08539e5acffcae3fcf06a430c9a31873\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy22.getText(Unknown Source)\r\n\tat com.automation.utility.Utility.getTextFromElement(Utility.java:64)\r\n\tat com.automation.pages.SignInPage.verifyAuthentication(SignInPage.java:62)\r\n\tat com.automation.cucumber.steps.SignInSteps.iShouldVerifyAUTHENTICATIONMessage(SignInSteps.java:24)\r\n\tat ✽.Then I should verify AUTHENTICATION message(SignPage.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 837769200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "User should Verify error message with Invalid credentials",
  "description": "",
  "id": "signpage-test;user-should-verify-error-message-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on Signin link",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter username \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on signIn button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should verify error message \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "signpage-test;user-should-verify-error-message-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "message"
      ],
      "line": 18,
      "id": "signpage-test;user-should-verify-error-message-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "",
        "123456",
        "An email address required."
      ],
      "line": 19,
      "id": "signpage-test;user-should-verify-error-message-with-invalid-credentials;;2"
    },
    {
      "cells": [
        "abcd@gmail.com",
        "",
        "Password is required."
      ],
      "line": 20,
      "id": "signpage-test;user-should-verify-error-message-with-invalid-credentials;;3"
    },
    {
      "cells": [
        "adfdfgfg",
        "123456",
        "Invalid email address."
      ],
      "line": 21,
      "id": "signpage-test;user-should-verify-error-message-with-invalid-credentials;;4"
    },
    {
      "cells": [
        "abcd@gmail.com",
        "123456",
        "Authentication failed."
      ],
      "line": 22,
      "id": "signpage-test;user-should-verify-error-message-with-invalid-credentials;;5"
    }
  ],
  "keyword": "Examples"
});
