$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:packtdy/TestMe.feature");
formatter.feature({
  "name": "Register in TestMe",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Registration",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I open testme app using chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "Codefile.i_open_testme_app_using_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "homepage of testme app is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.homepage_of_testme_app_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on signup button",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.click_on_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username as \"saghithya\" in username field",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.i_enter_username_as_in_username_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter firstname as \"saghithya\"",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.i_enter_firstname_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter lastname as \"sn\"",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.i_enter_lastname_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password as \"saghithya\"",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.i_enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"saghithya\" in confirm password field",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.i_enter_in_confirm_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on female button in gender field",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.i_click_on_female_button_in_gender_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email as \"saghithyasn@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.i_enter_email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter mobile number as \"9790935399\"",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.i_enter_mobile_number_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select dob as \"09/11/1997\"",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.i_select_dob_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter address as \"10,roja nagar,chennai\"",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.i_enter_address_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a security question",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.i_select_a_security_question()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the answer for security question",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.i_enter_the_answer_for_security_question()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on register button",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.i_click_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Codefile.login_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Logging in",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "enter login username as \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Lalitha",
        "password123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Logging in",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "enter login username as \"Lalitha\"",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.enter_login_username_as(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat packtdy.Codefile.enter_login_username_as(Codefile.java:121)\r\n\tat ✽.enter login username as \"Lalitha\"(classpath:packtdy/TestMe.feature:44)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "enter password as \"password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Codefile.enter_password_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Codefile.click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
});