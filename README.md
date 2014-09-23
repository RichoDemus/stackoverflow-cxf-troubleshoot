stackoverflow-cxf-troubleshoot
==============================

An attempt at troubleshooting my cxf problems


just run mvn clean tomcat7:run and go to http://localhost and visit the url

then open WebApiServer.java and remove the annotations on the method and re-run mvn clean tomcat7:run

and the api will no longer work