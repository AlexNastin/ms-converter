# ms-converter

### Start module

    $ go NAME_PROJECT src/java/main
    $ start MAIN_CLASS
    
### Start project Local

    $ run cofig_server
    $ run service_registry
    $ run service_gateway
    $ run other modules

### Create JAR files 

    $ run file "run-package.bat"
    
### Create Docker images and start Docker containers 

    $ run file "run-install.bat"
    $ cd dir project
    $ docker-compose up -d
 
# Environment Variables for MS
 #### Environment Variables for Service Registry
 
      SERVICE_REGISTRY_URL = localhost
      REGISTRY_SERVER_PORT = 8761
      
 #### Environment Variables for RabbitMQ
 
     RABBITMQ_HOST = localhost
      
 #### Environment Variables for Gateway
 
      GATEWAY_SERVER_PORT = 9090

 #### Environment Variables for Config Server
 
      CONFIG_SERVER_HOST = localhost
      CONFIG_SERVER_PORT = 8888
            
 #### Environment Variables for Boao-Promtorg
 
      BOAO_PROMTORG_SERVER_PORT = 9081 
   