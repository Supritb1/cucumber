Feature: Login action

@SmokeTest
Scenario Outline: successful login with valid credentidals

Given user is on home page
When User navigate to Login page
And User enters "<username>" and "<password>" 
Then Message displayed Login successfully

Examples:
| username | password |
| suprit   | ballurgi |
| laxmi		 | ballurgi |	
| advait | ballurgi |

@Functional @Regression
Scenario: Validate Dashboard

When user navigate to dashboard page
Then dashboard is opened

@Regression
Scenario: Successful Logout

When user logout from the application
Then message displayed logout successfully