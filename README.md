# cityapp-springboot
This is sample of cityapp demo application, converted to use springboot framework to demostrate on doing integration of Conjur, K8s and SpringBoot apps

## Prerequisites
- Maven installed
- Docker
- Mysql server with world database

## How to use
Clone the repo and change mysql parameters on docker-compose.yml to your lab's info.

Run script to build and test app on docker environment
- 01.compling-app.sh : Compiling project
- 02.building-image.sh : Building docker image and start container for testing

Testing result by using curl: curl http://localhost:8080/cityapp/ or using browser

Checking for environment params: curl http://localhost:8080/cityapp/env

# ---
