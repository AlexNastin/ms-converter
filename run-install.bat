call mvn -f ../ms-converters/config_server/pom.xml clean install -U -Dmaven.clean.failOnError=false
call mvn -f ../ms-converters/service_registry/pom.xml clean install -U -Dmaven.clean.failOnError=false
call mvn -f ../ms-converters/service_gateway/pom.xml clean install -U -Dmaven.clean.failOnError=false
call mvn -f ../ms-converters/1c-convert/pom.xml clean install -U -Dmaven.clean.failOnError=false
