package org.testleaf.factorydesignpattern.dataproviderfactory;

import java.util.logging.Logger;

public class HardcodedDataProvider implements TestDataProvider {

    private static final Logger log = Logger.getLogger(HardcodedDataProvider.class.getName());

    @Override
    public Object getTestData() {
        log.info("Hardcoded Data Provider");
        return "hardcoded_data_provider";
    }

}
