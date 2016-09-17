package Lab8;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class BatterTest {

	@Test
	public void TestCase01() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(1);
		Batter batter = new Batter(null, atBatResults);
		String battingAvg = batter.calcBattingAverage(atBatResults);
		Assert.assertEquals("0.500", battingAvg);
	}
	
	@Test
	public void TestCase02() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(0);
		Batter batter = new Batter(null, atBatResults);
		String battingAvg = batter.calcBattingAverage(atBatResults);
		Assert.assertEquals("0.000", battingAvg);
	}
	
	@Test
	public void TestCase03() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(4);
		atBatResults.add(4);
		atBatResults.add(4);
		Batter batter = new Batter(null, atBatResults);
		String battingAvg = batter.calcBattingAverage(atBatResults);
		Assert.assertEquals("1.000", battingAvg);
	}
	
	@Test
	public void TestCase04() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(1);
		atBatResults.add(2);
		Batter batter = new Batter(null, atBatResults);
		String battingAvg = batter.calcBattingAverage(atBatResults);
		Assert.assertEquals("0.667", battingAvg);
	}
	
	@Test
	public void TestCase05() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(0);
		atBatResults.add(3);
		atBatResults.add(0);
		Batter batter = new Batter(null, atBatResults);
		String battingAvg = batter.calcBattingAverage(atBatResults);
		Assert.assertEquals("0.250", battingAvg);
	}
	
	@Test
	public void TestCase06() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(2);
		atBatResults.add(2);
		atBatResults.add(1);
		atBatResults.add(4);
		Batter batter = new Batter(null, atBatResults);
		String battingAvg = batter.calcBattingAverage(atBatResults);
		Assert.assertEquals("1.000", battingAvg);
	}
	
	@Test
	public void TestCase07() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(1);
		atBatResults.add(4);
		atBatResults.add(0);
		atBatResults.add(2);
		atBatResults.add(1);
		atBatResults.add(3);
		atBatResults.add(0);
		atBatResults.add(0);
		Batter batter = new Batter(null, atBatResults);
		String battingAvg = batter.calcBattingAverage(atBatResults);
		Assert.assertEquals("0.556", battingAvg);
	}
	
	@Test
	public void TestCase08() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		Batter batter = new Batter(null, atBatResults);
		String battingAvg = batter.calcBattingAverage(atBatResults);
		Assert.assertEquals("0.000", battingAvg);
	}
	
	@Test
	public void TestCase09() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(3);
		Batter batter = new Batter(null, atBatResults);
		String battingAvg = batter.calcBattingAverage(atBatResults);
		Assert.assertEquals("1.000", battingAvg);
	}
	
	@Test
	public void TestCase10() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(1);
		Batter batter = new Batter(null, atBatResults);
		String sluggingAvg = batter.calcSluggingAverage(atBatResults);
		Assert.assertEquals("0.500", sluggingAvg);
	}
	
	@Test
	public void TestCase11() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(0);
		Batter batter = new Batter(null, atBatResults);
		String sluggingAvg = batter.calcSluggingAverage(atBatResults);
		Assert.assertEquals("0.000", sluggingAvg);
	}
	
	@Test
	public void TestCase12() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(4);
		atBatResults.add(4);
		atBatResults.add(4);
		Batter batter = new Batter(null, atBatResults);
		String sluggingAvg = batter.calcSluggingAverage(atBatResults);
		Assert.assertEquals("4.000", sluggingAvg);
	}
	
	@Test
	public void TestCase13() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(1);
		atBatResults.add(2);
		Batter batter = new Batter(null, atBatResults);
		String sluggingAvg = batter.calcSluggingAverage(atBatResults);
		Assert.assertEquals("1.000", sluggingAvg);
	}
	
	@Test
	public void TestCase14() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(0);
		atBatResults.add(3);
		atBatResults.add(0);
		Batter batter = new Batter(null, atBatResults);
		String sluggingAvg = batter.calcSluggingAverage(atBatResults);
		Assert.assertEquals("0.750", sluggingAvg);
	}
	
	@Test
	public void TestCase15() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(2);
		atBatResults.add(2);
		atBatResults.add(1);
		atBatResults.add(4);
		Batter batter = new Batter(null, atBatResults);
		String sluggingAvg = batter.calcSluggingAverage(atBatResults);
		Assert.assertEquals("2.250", sluggingAvg);
	}
	
	@Test
	public void TestCase16() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		atBatResults.add(1);
		atBatResults.add(4);
		atBatResults.add(0);
		atBatResults.add(2);
		atBatResults.add(1);
		atBatResults.add(3);
		atBatResults.add(0);
		atBatResults.add(0);
		Batter batter = new Batter(null, atBatResults);
		String sluggingAvg = batter.calcSluggingAverage(atBatResults);
		Assert.assertEquals("1.222", sluggingAvg);
	}
	
	@Test
	public void TestCase17() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(0);
		Batter batter = new Batter(null, atBatResults);
		String sluggingAvg = batter.calcSluggingAverage(atBatResults);
		Assert.assertEquals("0.000", sluggingAvg);
	}
	
	@Test
	public void TestCase18() {
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		atBatResults.add(3);
		Batter batter = new Batter(null, atBatResults);
		String sluggingAvg = batter.calcSluggingAverage(atBatResults);
		Assert.assertEquals("3.000", sluggingAvg);
	}
}