FROM openjdk:jdk-alpine

WORKDIR /root
ADD target/scala-2.13/ProjectJenkins.jar /root/ProjectJenkins.jar
ADD etc/entrypoint.sh /root/entrypoint.sh
ENTRYPOINT ["/bin/sh","/root/entrypoint.sh"]