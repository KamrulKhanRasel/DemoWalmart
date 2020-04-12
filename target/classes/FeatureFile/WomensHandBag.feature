@Walmart
	Feature: As a user i should be able to browse the women's handbag section
	Scenario: User goes to spark menu and selects clothing, shoes and accessories

	Given User navigate to spark menu
	When User select clothing, shoes and accessories
	When Selects handbags under women
	Then User lands on womens handbag webpage