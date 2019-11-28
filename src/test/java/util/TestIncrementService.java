package util;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

public class TestIncrementService {

    private IncrementService incrementService = Mockito.mock(IncrementService.class);

    @Test
    public void incrementService_nullsInCollection_eliminateNullsReturnIncrementedCollection() {

        Integer[] actualCollection = new Integer[]{1, null, 3};
        Integer[] expectedCollection = new Integer[]{2, 3};

        when(incrementService.goWithObjects(actualCollection)).thenReturn(expectedCollection);

        assertArrayEquals(expectedCollection, incrementService.goWithObjects(actualCollection));

        verify(incrementService).goWithObjects(actualCollection);
    }

    @Test
    public void incrementService_normalCollection_incrementedCollection() {
        Integer[] actualCollection = new Integer[]{1, 3};
        Integer[] expectedCollection = new Integer[]{2, 3};

        when(incrementService.goWithObjects(actualCollection)).thenReturn(expectedCollection);

        assertArrayEquals(expectedCollection, incrementService.goWithObjects(actualCollection));

        verify(incrementService).goWithObjects(actualCollection);
    }

    @Test
    @Ignore
    public void incrementServiceTest_normalCollectionButNoMockito_failWithWantedButNotUsed() {
        Integer[] actualCollection = new Integer[]{1, 3};
        Integer[] actualCollectionVerify = new Integer[]{2, 3};
        Integer[] expectedCollection = new Integer[]{2, 3};

        when(incrementService.goWithObjects(actualCollection)).thenReturn(expectedCollection);

        assertArrayEquals(expectedCollection, actualCollectionVerify);

        verify(incrementService).goWithObjects(actualCollectionVerify);
    }
}