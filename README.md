# SourceDemoAutomationProject

##Content table
 [Project description](#description)
 [Disclaimers](#disclaimers)
 [ChromeDriver versions](#chromeDriverVersions)
 [Contact info](#contactInfo)

##Project description
This is a web automation project for the page [Swag Lab](https://www.saucedemo.com/).
We will test different methods for different users to be able to know how the page is working for each one of them, and at the same time
register all the problems hat this users encounter.

##Disclaimers
1. There is a WebElementWait that is able to wait for 5 nanoseconds, if an element is not showed within those 5 nanoseconds, a TimeoutException
   will be caught.
2. The project is made with an openjdk-23.
3. When a TimeoutException is caught that user test is automatically assigned as a failed test.
4. There are 3 types of test that will be done one after another, this means that:
   - All purchase tests of all the users will be done first.
   - Then all the remove items tests of all users will be done.
   - Finally all the logout tests of all users will be done.
5. Data providers are used for the tests, I didn't include users that are not registeres nor unnaccepted because it would
   automatically create a failed test for that username in each one of the tests that are done during the execution of the .xml file.
5.JavaFaker was used to provide all the names, last names and zip codes, meaning that every test has a different user with different
 personal data to interact with the page.
6. If the chromedirver of the project is not compatible with your device's Chrome, please go back to the content table and selec "ChromeDriver versions"
   to install a chrome driver that is compatible for your Chrome's version.

##ChromeDriver versions
[ChromeDriver for testing] (https://googlechromelabs.github.io/chrome-for-testing/)
**To set the new chrome driver just delete the one in this path of the project: PomPractice/drivers/chromedriver.exe
then drag the new chromedriver.exe that you downloaded into the path where the deleted chromedriver was originally.

##Contact info
for any questions or suggestions pleasse contact to this mail:
andrea.buenaventura@globant.com

