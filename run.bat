@echo off

call mvnw package -DskipTests
call mvnw dependency:copy-dependencies -DoutputDirectory=target/mods -Dmdep.stripVersion=true -DincludeScope=runtime
copy target\spring-petclinic-2.1.0.BUILD-SNAPSHOT.jar.original target\mods\spring-petclinic.jar

%JAVA_HOME%\bin\java -p target\mods -m spring.petclinic/org.springframework.samples.petclinic.PetClinicApplication