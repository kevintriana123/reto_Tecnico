#Autor: Kevin

@stories

Feature: Sing Up
   As a web user I want to register as a new user on the uTest.com page


  @scenario1

  Scenario:  Successful sing up

    Given that Kevin wants to register as a new user on the uTest.com page
    When He finds the form and completes it, to be a registered user
      |strName|strLastName|strEmail          |strMonth|strDay|strYear|strCity|strZIP|strCountry|strLanguage|strComputer|strComputerOS  |strDevice|strDeviceModel|strDeviceOS|strPassword|
      |kevin|Triana    |kevintriana123@hotmaiIUl.com|January |13     |1990   |Bogota|1152007|Colombia|Spanish    |Windows    |10 |Apple   |iPhone XR       |iOS 14.5.1 |KevinQaz,.0|
    Then of fill out the form is a new registered user.
      |Complete Register|
