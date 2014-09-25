stackoverflow-cxf-troubleshoot
==============================

An attempt at troubleshooting my cxf problems at http://stackoverflow.com/questions/25964475/jsr-2-0-annotations-are-not-inherited-by-implementation


just run mvn clean tomcat7:run and go to http://localhost and visit the url

then open WebApiServer.java and remove the annotations on the method and re-run mvn clean tomcat7:run

and the api will no longer work


To anyone who has the same problen and finds this page:
-------------------------------------------------------

Also remove the Parameter annotation @PathParam in WebApiServer.java and it will work!
