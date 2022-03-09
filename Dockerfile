FROM tomcat:8.0-jre8

LABEL maintainer= "Simon C"

ADD target/FrontController.war /usr/local/tomcat/webapps

EXPOSE 8080

CMD ["catalina.sh","run"]