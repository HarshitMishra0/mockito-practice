package com.practice.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessImplTest {
    @Test
    void test() {
        DataServiceStubs dataServiceStubs = new DataServiceStubs();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStubs);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25,result);

    }

}

class DataServiceStubs implements SomeBusinessImpl.DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[]{25, 15, 5};
    }
}
