package org.testleaf.factorydesignpattern.dataproviderfactory;

import java.util.logging.Logger;

public class ExcelDataProvider implements TestDataProvider{

    private static final Logger log = Logger.getLogger(ExcelDataProvider.class.getName());

    @Override
    public Object getTestData() {
        log.info("Excel Data Provider");
        return "excel_data_provider";
    }

}
