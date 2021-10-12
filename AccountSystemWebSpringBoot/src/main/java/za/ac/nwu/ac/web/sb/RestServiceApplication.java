package za.ac.nwu.ac.web.sb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import za.ac.nwu.ac.web.sb.controller.AccountTypeController;

@SpringBootApplication
public class RestServiceApplication {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(AccountTypeController.class);

        logger.info("Logger- Starting up Springboot app:");

        try{
            SpringApplication.run(RestServiceApplication.class, args);

        }catch (Exception ex)
        {
            logger.error(String.valueOf(ex));
        }
    }
}

