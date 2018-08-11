Feature: Login for LeafTaps
Background:
Given Open the browser
And Maximize the window 
And set the timeout
And Enter the UserName as DemoSalesManager
And Enter the Password as crmsfa 
And Click on the Login Button
And Verificaiton of Login Successfull
@Smoke
Scenario Outline: Positive Login LeafTaps
And click the CRMSFA 
And Select the CreateLead 
And Enter the FName as Bulby
And Enter the LName as Tubelight
And Enter the CName
When Click on the submit Button  
Then Creation of Lead is Successfull
Then Close Browser
Examples:
|username||password|
|DemoCSR||crmsfa|

@Sanity
Scenario Outline: Positive Login LeafTaps
And click the CRMSFA 
And Select the CreateLead 
And Enter the FName as <firstName>
And Enter the LName as <lastName>
And Enter the CName as <compName>
When Click on the submit Button  
Then Creation of Lead is Successfull
Then Close Browser
Examples:
|firstName|lastName|compName|
|Daisy|Arockia|Anisha Software Solutions Ltd|
|Anisha|Mariya|Tata Consultancy Services|