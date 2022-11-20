import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AverageTesting {

	@Test
	public void NegativekandPositiveArray() {
		Average a1=new Average();
		double output = a1.average(-3,new int[] {1,2,3,4,5});
		assertEquals(0,output);
	}
	
	@Test
	public void biggerKTest() {
		Average a1=new Average();
		double output = a1.average(100,new int[] {1,2,3,4});
		assertEquals(2.5,output);
	}
	
	@Test
	public void zeroKAverageTest() {
		Average a1=new Average();
		double output = a1.average(0,new int[] {1,2,3,4,5});
		assertEquals(0,output);
	}
	
	@Test
	public void kandZeroArray() {
		Average a1=new Average();
		double output = a1.average(100,new int[] {});
		assertEquals(0,output);
	}
	
	@Test
	public void negKAverageTest() {
		Average a1=new Average();
		double output = a1.average(-10,new int[] {-90,-45,1,2,3,4,5});
		assertEquals(0,output);
	}
	
	@Test
	public void simpleInteger() {
		Average a1=new Average();
		double output = a1.average(4,new int[] {1,2,3,4});
		assertEquals(2.5,output);
	}
	
	@Test
	public void klowerAverageTest() {
		Average a1=new Average();
		double output = a1.average(2,new int[] {1,2,3,4,5,6});
		assertEquals(1.5,output);
	}
	
	@Test
	public void negArrayAverage() {
		Average a1=new Average();
		double output = a1.average(5,new int[] {-4,-3,-2,-1,-5});
		assertEquals(-3,output);
	}
	
	@Test
	public void zeroKAverage() {
		Average a1=new Average();
		double output = a1.average(0,new int[] {1,2,3,4,5,6});
		assertEquals(0,output);
	}

}
