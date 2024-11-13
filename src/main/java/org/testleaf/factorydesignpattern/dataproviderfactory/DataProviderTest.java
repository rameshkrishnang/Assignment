package org.testleaf.factorydesignpattern.dataproviderfactory;

public class DataProviderTest {
    public static void main(String[] args) {
        DataProviderFactory.getDataProvider(DataSourceType.EXCEL).getTestData();
        DataProviderFactory.getDataProvider(DataSourceType.FAKER).getTestData();
        DataProviderFactory.getDataProvider(DataSourceType.DATABASE).getTestData();
        DataProviderFactory.getDataProvider(DataSourceType.API).getTestData();
        DataProviderFactory.getDataProvider(DataSourceType.HARDCODED).getTestData();
    }
}