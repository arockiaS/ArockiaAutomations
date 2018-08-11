Feature: Login for LeafTaps
Background:
Given Open the browser
And Maximize the window 
And set the timeout
And Enter the UserName as DemoSalesManager
And Enter the Password as crmsfa 
And Verificaiton of Login Successfull

Scenario: Positive Login LeafTaps

And click the CRMSFA 
And Select the CreateLead 
And Enter the FName as Hulk 
And Enter the LName as Bulb
And Enter the CName
When Click on the submit Button  
Then Creation of Lead is Successfull

Scenario: Positive Login LeafTaps for create lead 2

And click the CRMSFA 
And Select the CreateLead 
And Enter the FName as Hulky
And Enter the LName as Bulby
And Enter the CName
When Click on the submit Button  
Then Creation of Lead is Successfull