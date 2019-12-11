Feature: Employee details Application

 Scenario: using application
  Given home page
   
   Then Title should be Home Page
   
   When  contact us link is clicked 
   Then Title should be 'Contact Us'
   
   When Home link is clicked
   Then Header should contain links
   
   When Register link is clicked
   Then Title should be Employee Registration Page
   
   When Submit button is clicked without entering in any fields
   Then alert message should be displayed as 'Please fill in the 'Your Employee Name' box.'
   
    When Submit button is clicked without entering in Employee Number field
   Then alert message should be displayed as 'Enter Employee Number' box.'
   
    When Submit button is clicked with entering in Employee Number field without entering in Employee name field
   Then alert message should be displayed as 'Please fill in the 'Your Employee Name' box.'
   
   When Any character is given in Employee number field 
   Then it has to 'Enter Number'
   
   When Submit button is clicked without entering in Job location field
   Then alert message should be displayed as 'Select your Job Location' 
   
    When Submit button is clicked without entering in Job location field
   Then alert message should be displayed as 'Select your Job Location' 
   
    When Submit button is clicked without entering in Email field
   Then alert message should be displayed as 'You have entered an invalid email address!' 
   
    When Submit button is clicked with entering a invalid Email in email field
   Then alert message should be displayed as 'You have entered an invalid email address!' 
   
   When Submit button is clicked after giving all the data in the form
   Then it has to navigate to Success page it has to show 'Registered Successfully!'