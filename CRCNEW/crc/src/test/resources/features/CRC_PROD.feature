Feature: CRC_PROD
  In order to access CRC for Advisor Portal
  As an Advisor
  I want to validate all flows in CRC for Advisor Portal
#10942564, 60605850, 10343619

  @Test
 Scenario: TC001_BO_PROD-Verify In Progress - Pending Earnings
  	Given Login to AP
  	When User navigates to CRC
    Then Verify LOB Summary and PY LOB Summary
    Then Verify In Progress - Pending Earnings
    Then Verify Balance Forward
    Then Verify Group Pending Earnings
    Then Verify Group off Cycle Payments
    Then Verify My Pending Earnings
    Then Verify Group Estimated Payment 
    
     @Test02
  Scenario: TC002_BO_PROD-Verify Balance Forward Tab
  	Given Login to AP
  	When User navigates to CRC
    Then Verify LOB Summary and PY LOB Summary
    Then Verify Balance Forward
    Then Click on Value for Balance Forward 
    Then Verify Rep Id
    Then Verify Branch Id
    Then Verify Rep name
    Then Click on Export to CSV
    
    @Test03
  Scenario: TC003_BO_PROD-Verify Group Pending Earning Tab
  	Given Login to AP
  	When User navigates to CRC
    Then Verify LOB Summary and PY LOB Summary
    Then Verify Group Pending Earnings
    Then Click on Vaue for Group Pending Earnings
    Then Verify Rep Id
    Then Verify Rep name
    Then Verify Dealer Concession
    Then Click on Export to CSV
    
     @Test04
  Scenario: TC004_BO_PROD-Verify My Pending Earnings
  	Given Login to AP
  	When User navigates to CRC
    Then Verify LOB Summary and PY LOB Summary
    Then Verify My Pending Earnings
    Then Click on Vaue for My Pending Earnings
    Then Verify Rep Id
    Then Verify Rep name
    Then Verify Dealer Concession
    Then Click on Export to CSV
    
     @Test05
  Scenario: TC005_BO_PROD-Verify Group Estimated Payment
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify LOB Summary and PY LOB Summary
    Then Verify Group Estimated Payment
    Then Click on Group Estimated Payment
    Then Verify Rep Id
    Then Verify Rep name
    Then Click on Export to CSV
    
        @Test06
  Scenario: TC006_BO_PROD-Verify Commission History
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify LOB Summary and PY LOB Summary
  	Then Verify Statement Date
  	Then Verify Balance Forward
  	Then Verify Commissions & Overrides
  	Then Verify Adj Taxable
  	Then Verify Adj Non Taxable
  	Then Verify Closing Balance 
  	Then verify Payment Amount
  	
  	      @Test07
   Scenario: TC007_BO_PROD-Verify Value of Balance Forward
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify LOB Summary and PY LOB Summary
  	Then Verify Balance Forward
  	Then Click on Value of Balance Forward
  	Then Verify Rep Id
  	Then Verify Branch Id
  	Then Click on Export to CSV
  	
  		      @Test08
    Scenario: TC008_BO_PROD-Verify Value of Balance Forward
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify LOB Summary and PY LOB Summary
  	Then Verify Commissions & Overrides
  	Then Click on the first value for Commissions & Overrides
  	Then Verify Rep Id
  	Then Verify Branch Id
  	Then Click on Export to CSV
  	
  		   @Test09
    Scenario: TC009_BO_PROD-Verify Value of Balance Forward
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify LOB Summary and PY LOB Summary
  	Then Verify Commissions & Overrides
  	Then Click on the second value for Commissions & Overrides
  	Then Verify Rep Id
  	Then Verify Branch Id
  	Then Click on Export to CSV
  	
  		  @Test10
    Scenario: TC010_BO_PROD-Verify Value of Balance Forward
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify LOB Summary and PY LOB Summary
  	Then Verify Commissions & Overrides
  	Then Click on the third value for Commissions & Overrides
  	Then Verify Rep Id
  	Then Verify Branch Id
  	Then Click on Export to CSV
  	
  		  @Test11
    Scenario: TC011_BO_PROD-Verify Value of Balance Forward
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify LOB Summary and PY LOB Summary
  	Then Verify Adj Taxable
  	Then Click on first value of Adj Taxable
  	Then Verify Rep Id
  	Then Verify Branch Id
  	Then Click on Export to CSV
  	
  		  @Test12
    Scenario: TC012_BO_PROD-Verify Value of Balance Forward
  	Given Login to AP
  	When User navigates to CRC
  	Then Verify LOB Summary and PY LOB Summary
  	Then Verify Adj Taxable
  	Then Click on second value of Adj Taxable
  	Then Verify Rep Id
  	Then Verify Branch Id
  	Then Click on Export to CSV
  	