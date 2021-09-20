package com.cmc.log;

import org.apache.logging.log4j.*;


public class Admin {
    private Logger logger = LogManager.getLogger(Admin.class);
    
    public void agregar(){
        logger.info("Mensaje de info");
        logger.warn("Mensaje de Warn");
        logger.debug("Mensaje de debug");
        logger.error("Mensaje de error");
        logger.trace("Mensaje de trace");
    }
}
