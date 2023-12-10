package com.practice.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplMockTest {@Test
void test() {
    SomeBusinessImpl.DataService dataServiceMock = mock(SomeBusinessImpl.DataService.class);
    when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25,15,5});
    SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
    int result = businessImpl.findTheGreatestFromAllData();
    assertEquals(25,result);

}

}

