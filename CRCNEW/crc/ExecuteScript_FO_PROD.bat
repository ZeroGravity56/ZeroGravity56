set currentpath="%cd%"
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_202
set PATH=%Path%;W:\MphasisQA\Automation_Selenium\AppAutomationSuites\apache-maven-3.5.0\bin
set PATH=%Path%;W:\MphasisQA\Automation_Selenium\AppAutomationSuites\allure-2.7.0\bin
call mvn clean
call mvn test -Dcucumber.options="--plugin ru.yandex.qatools.allure.cucumberjvm.AllureReporter --tags @FO_PROD"
call allure serve target\allure-results