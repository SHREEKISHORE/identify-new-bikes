Feature: Identifying New Bikes
	Scenario: Successfully Select Upcoming Bikes
		When Click on the New Bikes
		When Click on Upcoming Bikes
		And Click on Manufactorers
	Scenario: Displaying Used Car Details
		When Select Used Cars
		And Select Used Cars Location
		When Select Popular models
	Scenario: Login to Chrome By Giving Invalid Details
		When Click on Login/SignUp
		Given the user is on the Google login page
    When the user enters invalid credentials 