Feature: Survaeillance_FO_QA
  In order to access Survaeillence for Advisor Portal
  As an Advisor
  I want to validate all flows in Survaeillence for Advisor Portal
#10942564, 60605850, 10343619

	#@BO_QA_210
  	#Scenario: TC0030_BO_QA-Verify Survaeillance Link.
  	#Given Login to AP
  	#When User navigates to Backoffice 
  #	When User navigates to Surveillance
  	#And User is on Home Page
  	#And User Select the Review Number from Account Number dropdown
  	#And User search the Review Number in
  	#And User clicks on view tab.
  	#Then User navigates to Review Number Page.
  
  #	@BO_QA_810
  #	Scenario: TC0030_BO_QA-Verify Survaeillance Link.
  	#Given Login to AP
  	#When User Login an supervisor Analyst.
  #	When User navigates to Surveillance
  	
  	@BO_QA_710
  	Scenario: TC001_BO_QA-Verify Homepage 
  	And User Verify Homepage for LHS sub menu items with expand and collapse function. 
  	Then User Verify Dropdown Account number,Review Number,Client Number,Rep Code with search functions.
  	And User verify Open review, my review, my draft and All with review details display on click.
  	And User verify my review with review details display on click.
  	And User verify my draft with review details display on click.
  	And User verify All tab with review details display on click.
 	And User verify Functionality of New.
 	And User verify Functionality of Import.
 	And User verify Functionality of Clear All.
 	And User Download excel and Pagination with traversing last record and backwards.
 	
 	@BO_QA_711
  	Scenario: TC001_BO_QA-Verify Data Export Page 
  	Then User Verify Review Name.
  	And User verify Open reviews Export.
 	And User verify Comment Export.
 	And User verify custom review export.
 	Then User verify Trade Desk Export.
 	
    @BO_QA_712
    Scenario: TC001_BO_QA-Verify Profile Page 
  	Then User Verify Open Profile.
  	And User verify My Profile.
 	Then User verify All.
 	
 	@BO_QA_713
  	Scenario: TC001_BO_QA-Verify Notification History. 
  	Then User Verify Open Firm ID.
  	And User verify Review Type.
 	And User verify Review Month
 	And User verify Triggered date.
 	And User verify Triggered by.	
 	Then User verify Review Year.
 	
 	@BO_QA_714
  	Scenario: TC001_BO_QA-Verify Mutual Fund Waivers. 
  	Then User Verify Mutual Fund Waivers.
  	And User verify Fund Family.
 	And User verify Fund Name. 
 	And User verify Share Class.
 	And User verify Waiver Eligible.
 	And User verify A SHare EQ.	
 	Then User verify Symbol.
 	
 	@BO_QA_715
  	Scenario: TC001_BO_QA-Verify Firm Restricted Securities.
  	Then User Firm Restricted Securities.
  	And User verify cusip number
 	And User verify symbol. 
 	And User verify Product type.
 	And User verify Product category.
 	And User verify Restriction status.
 	Then User verify New tab.
 	
 	@BO_QA_716
  	Scenario: TC001_BO_QA-Verify Bulk Import Details. 
  	Then User verify Request Category.
  	And User verify Request File Name.
 	And User verify created by. 
 	And User verify created date.
 	
 	@BO_QA_717
  	Scenario: TC001_BO_QA-Verify Bulk Workflow Action. 
  	Then User verify Firm.
  	And User verify Review Type.
 	And User verify Review Year. 
 	And User verify Review Month.
 	And User verify review count.
 	And User verify from review status.
 	And User verify to review status.
 	And user verify triggered date.
 	And user verify triggered by.
 	Then user verify Add New tab.
 	
  	