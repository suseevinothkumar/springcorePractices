package org.example.OtherAnnotations.PostConstruct_PreDestroy;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class DBConnection {

    private static final Logger log= Logger.getLogger(String.valueOf(DBConnection.class));

    public void getConnection(){
        log.info("Get Connection");
    }
   // @PreDestroy
    public void closeConnection(){
        log.info("Connection closed");
    }
}
