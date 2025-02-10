# SeekersLifeJobPortal

This project is about SeekersLife WebsiteApplication(SmartBuy)

SeekersLifeJobProj directory -> frontend (react) port no:3000 [ for postgres login username: postgres  pass:admin]
Spring-boot-rest directory -> backend (Spring,JPA,Postgres) port no:8080 

Apache tomcat server v9+ is mandatory

For Frontend Startup -> open the ecommwebfinal5 in vs code -> npm install -> npm run dev 

For Backend Startup  -> open SpringEcom directory in IntelliJ -> run SpringbootrestApplication.java

[If error occurs in Lombok : in IntelliJ open file-> settings -> build,deployment,execution -> compilers -> annotation processing enable -> select the current folder as default path -> click Ok then run for cmd prmpt: mvn clean package->mvn clean install]

[ if there any error occurs :In cmd prompt -> mvn clean package -> mvn clean install (in case of Lombok or Incorrect UI errors) or Download Lombok Plugins or Add latest dependencies in pom.xml file ]

  If the port is already being used open cmd as administrator -> type netstat -ano | findstr :8080 or 3000 -> taskkill /PID (lastnumbers) /F
