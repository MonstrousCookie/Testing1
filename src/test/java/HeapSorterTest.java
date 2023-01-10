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
    public void sortTest_success1() {
        int[] actual = new int[]{5, 4, 3, 2, 1};

        sorter.sort(actual);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, actual);
    }

    @Test
    public void sortTest_success2() {
        int[] actual = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        sorter.sort(actual);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, actual);
    }


    @Test
    public void sortTest_failure1() {
        int[] actual = null;

        Assert.assertThrows(RuntimeException.class, () -> sorter.sort(actual));
    }

    @Test
    public void sortTest_failure2() {
        int[] actual = new int[]{};

        Assert.assertThrows(RuntimeException.class, () -> sorter.sort(actual));
    }

}
