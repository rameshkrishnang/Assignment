package org.testleaf.factorydesignpattern.dataproviderfactory;

import java.util.logging.Logger;

public class FakerDataProvider implements TestDataProvider {

    private static final Logger log = Logger.getLogger(FakerDataProvider.class.getName());

    @Override
    public Object getTestData() {
        log.info("Faker Data Provider");
        return "faker_data_provider";
    }

}
