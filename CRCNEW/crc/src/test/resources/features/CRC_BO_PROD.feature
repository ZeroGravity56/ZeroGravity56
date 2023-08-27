Feature: CRC_BO_PROD 
  In order to access CRC for Advisor Portal
  As an Advisor
  I want to validate all flows in CRC for Advisor Portal
#10942564, 60605850, 10343619

  @BO_PROD
  Scenario: TC001_BO_PROD-Verify LOB Summary and PY LOB Summary
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify LOB Summary and PY LOB Summary
  
  @BO_PROD
  Scenario: TC002_BO_PROD-Verify PreDefined Commission Reports
  	Given Login to AP
  	When User navigates to CRC
 # 	Then Verify PreDefined Commission Reports
  	
  @BO_PROD
  Scenario: TC003_BO_PROD-Verify Commission Statements
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify Commission Statements

	@BO_PROD
  Scenario: TC004_BO_PROD-Verify LOB Summary and PY LOB Summary
  	Given Login to AP
  	When User navigates to CRC
 	Then Verify LOB Summary and PY LOB Summary
  
  @BO_PROD
  Scenario: TC005_BO_PROD-Verify PreDefined Commission Reports
  	Given Login to AP
  	When User navigates to CRC
  #	Then Verify PreDefined Commission Reports
  	
  @BO_PROD
  Scenario: TC006_BO_PROD-Verify Commission Statements
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify Commission Statements
