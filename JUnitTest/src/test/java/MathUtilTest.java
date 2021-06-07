import org.junit.Assert;
import org.junit.Test;
public class MathUtilTest {
	 	@Test
	    public void divide_SixDividedByTwo_ReturnThree() {
	        final int expected = 3;

	        final int actual = MathUtil.divide(6, 2);

	        Assert.assertEquals(expected, actual);

	    }

	 	@Test
	    public void divide_SixDividedByThree_ReturnTwo() {
	        final int expected = 3;

	        final int actual = MathUtil.divide(6, 3);

	        Assert.assertEquals(expected, actual);

	    }
	 
	    @Test
	    public void divide_OneDividedByTwo_ReturnZero() {
	        final int expected = 0;

	        final int actual = MathUtil.divide(1, 2);

	        Assert.assertEquals(expected, actual);

	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void divide_OneDividedByZero_ThrowsIllegalArgumentException() {
	        MathUtil.divide(1, 0);

	    }

	    @Test
	    public void add_SixAddedByTwo_ReturnEight() {
	        final int expected = 8;

	        final int actual = MathUtil.add(6, 2);

	        Assert.assertEquals(expected, actual);

	    }
	    @Test
	    public void add_SixAddedByThree_ReturnNine() {
	        final int expected = 10;

	        final int actual = MathUtil.add(6, 3);

	        Assert.assertEquals(expected, actual);

	    }
	    @Test
	    public void sub_FiveSubThree_ReturnTwo() {
	        final int expected = 2;
	        final int actual = MathUtil.sub(5, 3);
	        Assert.assertEquals(expected, actual);

	    }

	    @Test
	    public void sub_FiveSubFour_ReturnOne() {
	        final int expected = 2;
	        final int actual = MathUtil.sub(5, 4);
	        Assert.assertEquals(expected, actual);

	    }
	    @Test
	    public void mul_TwoMulThree_ReturnSix() {
	        final int expected = 6;
	        final int actual = MathUtil.mul(3, 2);
	        Assert.assertEquals(expected, actual);

	    }
	    @Test
	    public void mul_TwoMulTwo_ReturnFour() {
	        final int expected = 6;
	        final int actual = MathUtil.mul(2, 2);
	        Assert.assertEquals(expected, actual);

	    }
}
