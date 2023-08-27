Feature: CRC_FO_QA
  In order to access CRC for Advisor Portal
  As an Advisor
  I want to validate all flows in CRC for Advisor Portal
#10942564, 60605850, 10343619

  @FO_QA @enh1
  Scenario: TC001_FO_QA-Verify LOB Summary and PY LOB Summary
  	Given Login to AP
  	When User navigates to CRC
  	And User search valid rep code
  	Then Verify LOB Summary and PY LOB Summary
  
  @FO_QA @enh
  Scenario: TC002_FO_QA-Verify PreDefined Commission Reports
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify PreDefined Commission Reports
  	
  @FO_QA @enh
  Scenario: TC003_FO_QA-Verify Commission Statements
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify Commission Statements

 @FO_QA @enh
 Scenario: TC004_FO_QA-Verify LOB Summary and PY LOB Summary
 	Given Login to AP
 	When User navigates to CRC
 	And User search valid rep code
 	Then Verify LOB Summary and PY LOB Summary
 
 @FO_QA @enh
 Scenario: TC005_FO_QA-Verify PreDefined Commission Reports
 	Given Login to AP
 	When User navigates to CRC
 	And User search valid rep code
 	Then Verify PreDefined Commission Reports
@FO_QA @enh
 Scenario: TC006_FO_QA-Verify Commission Statements
 	Given Login to AP
 	When User navigates to CRC
 	And User search valid rep code
 	Then Verify Commission Statements
 	
 @test45
 Scenario: TC006_FO_QA-Verify Commission Statements 10942564
 	Given Login to AP
 	When User navigates to CRC
 	And User click Rep name dropdown and User select Rep name
# 	Then Verify Commission Statements
