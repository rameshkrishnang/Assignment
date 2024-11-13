package org.testleaf.factorydesignpattern.dataproviderfactory;

import java.util.logging.Logger;

public class DatabaseDataProvider implements TestDataProvider {

    private static final Logger log = Logger.getLogger(DatabaseDataProvider.class.getName());

    @Override
    public Object getTestData() {
        log.info("Database Data Provider");
        return "database_data_provider";
    }

}
