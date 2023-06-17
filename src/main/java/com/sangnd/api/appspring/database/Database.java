package com.sangnd.api.appspring.database;

//Now connect with mysql using JPA
/*
docker network create springboot-app-network
docker volume create  springdb

docker run -d --rm --name springdb \
-e MYSQL_ROOT_PASSWORD=12345678 \
-e MYSQL_USER=sangnd \
-e MYSQL_PASSWORD=12345678 \
-e MYSQL_DATABASE=srpingdb \
-p 3306:3306 \
--volume mysql-spring-boot-volume:/var/lib/mysql \
--network springboot-app-network \
mysql:latest


mysql -h localhost -P 3306 --protocol=tcp -u sangnd -p
show databases;

docker network create springboot-app-network
docker volume create mysql-springboot-data
docker volume create mysql-springboot-config-deamond


docker run --rm -d \
-v mysql-springboot-data:/var/lib/mysql \
-v mysql-springboot-config-deamond:/etc/mysql/conf.d \
--name mysql-springboot-container \
-p 3301:3306 \
-e MYSQL_USER=sangnd -e MYSQL_PASSWORD=12345678 \
-e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=springdb \
--network springboot-app-network \
mysql:latest

docker exec -it mysql-springboot-container mysql -u root -p

* */

import com.sangnd.api.appspring.api.CompanyController;
import com.sangnd.api.appspring.model.Company;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

//@Configuration
public class Database {
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(CompanyController companyController){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Company company= new Company(
                    1, "CTY HUYEN");
                companyController.addCompany(company);
            }
        };
    }
}