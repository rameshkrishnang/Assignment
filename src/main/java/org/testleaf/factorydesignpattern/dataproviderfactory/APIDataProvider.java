package org.testleaf.factorydesignpattern.dataproviderfactory;

import java.util.logging.Logger;

public class APIDataProvider implements TestDataProvider {

    private static final Logger log = Logger.getLogger(APIDataProvider.class.getName());

    @Override
    public Object getTestData() {
        log.info("API Data Provider");
        return "api_data_provider";
    }
}
