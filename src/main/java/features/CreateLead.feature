Feature: Login for LeafTaps
Scenario: Positive Login LeafTaps
Given Open the browser
And Maximize the window 
And set the timeout
And Enter the UserName as DemoSalesManager
And Enter the Password as crmsfa 
And Click on the Login Button
And Verificaiton of Login Successfull
And click the CRMSFA 
And Select the CreateLead 
And Enter the FName as Bulby
And Enter the LName as Tubelight
And Enter the CName
When Click on the submit Button  
Then Creation of Lead is Successfull

Scenario: Negative Login LeafTaps
Given Open the browser
And Maximize the window 
And set the timeout
And Enter the UserName as Demo
And Enter the Password as crmsfa
And Click on the Login Button
And Verificaiton of Login Successfull
And click the CRMSFA