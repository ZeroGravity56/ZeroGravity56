Feature: Survaeillance_FO_QA
  In order to access Survaeillence for Advisor Portal
  As an Advisor
  I want to validate all flows in Survaeillence for Advisor Portal
#10942564, 60605850, 10343619

  	@BO_QA_210 @new1 @45
  	Scenario: TC0030_BO_QA-Verify Survaeillance Link.
  	Given Login to AP
  	When User navigates to Backoffice 
  	When User navigates to Surveillance
  	And User is on Home Page
  	And User Select the Review Number dropdown
  	And User search the Review Number
  	And User clicks on view tab.
  	Then User navigates to Review Number Page.
  	
  	
#    @BO_QA_211
#    Scenario: TC0031_BO_QA-Verify Survaeillance Link.
#    Given : User is on Look up Page.
#    When User navigates to Category.
#    And User Select the Category Subscription.
#  	And User select the created by.
#  	And User clicks on updated by.
#  	Then User clicks on Is Active.
#  		
#  