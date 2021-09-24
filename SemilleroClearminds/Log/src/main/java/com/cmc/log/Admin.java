package com.cmc.log;

import org.apache.logging.log4j.*;

public class Admin {
    private Logger log = LogManager.getLogger(Admin.class);
    
    public void agregar(){
        log.error("Mensaje de error");
        log.debug("Mensaje Debug");
        log.trace("Mensaje Trace");
        log.warn("Mensaje Warn");
    }
}
