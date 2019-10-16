# Mandla_Mzize_Selenium

This project is a Selenium project using Java that access ilab website and apply for first available job.

I used IntelliJ IDEA with java.

Basically what it does it will launch ilab website , select careers tab -select South Africa and the select the  First Available Job and apply 
Using data that is saved on the excel data sheet.

I used the Hybrid approach when it comes to frameworks
 1. TestNG to control the run of my tests
 2. Maven - I used this as it a cool framework that will add all the dependencies you need automatically you don’t need to add libraries all the time
 3. POM with Page Factory - I used this as its also  cool and the  nice thing about it  is  it only initialise the elements when you need them so it does not  waste resources by remembering elements when you don’t need them
 4. I also utilise the use of data sheet to store the parameters that I pass in different methods 
 
To run this test you need to right click the testng.xml file and run. It will run the test and generate report using the Extent Report 4
Which I created a class for and added a listener and logged all the steps i took when running the application process.
