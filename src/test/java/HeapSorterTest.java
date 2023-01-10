import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import services.impl.HeapSorter;
import services.Sorter;

public class HeapSorterTest {

    private Sorter sorter;
    
    @Before
    public void init() {
        sorter = new HeapSorter();
    }

    @Test
    public void sortedSuccessTest() {
        int[] actual = new int[]{5, 4, 3, 2, 1};

        sorter.sort(actual);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, actual);
    }

    @Test
    public void sortedSuccessTest2() {
        int[] actual = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        sorter.sort(actual);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, actual);
    }


    @Test
    public void sortedTestFailure() {
        int[] actual = null;

        Assert.assertThrows(RuntimeException.class, () -> sorter.sort(actual));
    }

    @Test
    public void sortedTestFailure2() {
        int[] actual = new int[]{};

        Assert.assertThrows(RuntimeException.class, () -> sorter.sort(actual));
    }

}
