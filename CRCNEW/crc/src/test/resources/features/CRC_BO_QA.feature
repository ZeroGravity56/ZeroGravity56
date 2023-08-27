Feature: CRC_BO_QA
  In order to access CRC for Advisor Portal
  As an Advisor
  I want to validate all flows in CRC for Advisor Portal
#10942564, 60605850, 10343619

  @BO_QA @enh1
  Scenario: TC001_BO_QA-Verify LOB Summary and PY LOB Summary
  	Given Login to AP
  	When User navigates to CRC
  	And User search valid rep code
  	Then Verify LOB Summary and PY LOB Summary
  
  @BO_QA @enh
  Scenario: TC002_BO_QA-Verify PreDefined Commission Reports
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify PreDefined Commission Reports
  	
  @BO_QA @enh
  Scenario: TC003_BO_QA-Verify Commission Statements
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify Commission Statements

     @BO_QA @enh
    Scenario: TC004_BO_QA-Verify LOB Summary and PY LOB Summary
    	Given Login to AP
    	When User navigates to CRC
    	And User search valid rep code
    	Then Verify LOB Summary and PY LOB Summary
    
    @BO_QA @enh
    Scenario: TC005_BO_QA-Verify PreDefined Commission Reports
    	Given Login to AP
    	When User navigates to CRC
    	Then Verify PreDefined Commission Reports
    	
    @BO_QA @enh
    Scenario: TC006_BO_QA-Verify Commission Statements
    	Given Login to AP
    	When User navigates to CRC
	Then Verify Commission Statements
	
	 @BO_QA @enh
 	Scenario: TC007_BO_QA-Verify The User Able to Select Valid Dates Under Date selection
  	Given Login to AP
  	When User navigates to CRC
  	And User search valid rep code
  	And User select valid dates under date selection
  	Then verify the user able to see LOB Summary and PY LOB Summary
  	
  	 @BO_QA @enh
 	Scenario: TC008_BO_QA-Verify The User Able to Open Commission History Payment Amount
  	Given Login to AP
  	When User navigates to CRC
  	And User search valid rep code
  	And User select valid dates under date selection
  	Then verify commission history payment amount
  	
  	 @BO_QA @enh
 	Scenario: TC009_BO_QA-Verify The User Able to Open Balance Forward Amount Link under In Progress Table
  	Given Login to AP
  	When User navigates to CRC
  	And User search valid rep code
  	And User select valid dates under date selection
  	Then verify user able to open balance forward amount link
  	
  	 @BO_QA @enh
 	Scenario: TC010_BO_QA-Verify The Table Columns After Clicking Balance Forward Amount under In Progress Table
  	Given Login to AP
  	When User navigates to CRC
  	And User search valid rep code
  	And User select valid dates under date selection
  	Then verify the table is displayed after clicking balance forward amount
  	
  	 @BO_QA @enh
 	Scenario: TC011_BO_QA-Verify The User Able to download excel Report in Balance Forward Amount Link under In Progress Table
  	Given Login to AP
  	When User navigates to CRC
  	And User search valid rep code
  	And User select valid dates under date selection
  	Then verify user able to download excel report
  	
  	
#  	 @BO_QA @enh
# 	Scenario: TC014_BO_QA-Verify PDF
#  	Given Login to AP
#  	When User navigates to CRC
#  	And User search valid rep code
#  	And User select valid dates under date selection
#  	And verify commission history payment amount
#  	#And verify the table is displayed after clicking balance forward amount
#  	#Then click pdf and verify in the table
  	
  	
  	
  	