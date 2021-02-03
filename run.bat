set projectLocation=D:\seleniumTrg_ws\HybridFrameWork
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\TestingSuite.xml