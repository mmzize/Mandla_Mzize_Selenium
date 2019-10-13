# Mandla_Mzize_Selenium

This  project is a Selenium project using Java that access ilab website and apply for first available job.

I used IntelliJ IDEA with java.

Basicall what it does it will launch ilab website , select careers tab -select South Africa and the select the  First Aavailable Job and apply 
usinng data that is saved on the  excel data sheet.

I used the Hybrid aproach when it  comes to frameorks
 1.TestNG to control the run of my tests
 2.Maven - I used this as it a cool framework that will add all the  dependencies you need automatically you dont need to add libraries all the time
 3. POM with PageFactory - I used this as its also  cool and the  nice thing about it  is  it only initialise the elements when you need them so it does not  waste resources by remembering elements when you dont need them
 4. I also utilise the  use of data sheet to store the parameters that i  pass in different  methods 
 
To run this test you need to right click the testng.xml file and run..it will run the  test and generate report usinng the Extent Report 4
which i created a class for and added a listener and logged all the steps  i took when actioning the  application process.
