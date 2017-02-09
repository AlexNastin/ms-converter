call mvn -f ../ms-converters/config_server/pom.xml clean package -U -Dmaven.clean.failOnError=false -Dmaven.test.skip=true
call mvn -f ../ms-converters/service_registry/pom.xml clean package -U -Dmaven.clean.failOnError=false -Dmaven.test.skip=true
call mvn -f ../ms-converters/service_gateway/pom.xml clean package -U -Dmaven.clean.failOnError=false -Dmaven.test.skip=true
call mvn -f ../ms-converters/1c-convert/pom.xml clean package -U -Dmaven.clean.failOnError=false -Dmaven.test.skip=true
