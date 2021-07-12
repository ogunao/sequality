package sequality;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculateTest {
@Test
public void testSum() {
Calculate calculate = new Calculate();
int expected = 5;
assertEquals(expected, calculate.sum(2, 3));
}

@Test
public void testAverage() {
Calculate calculate = new Calculate();
double expected = 2.5;
assertEquals(expected, calculate.average(2, 3));
}

@Test
public void testTotalaverage() {
Calculate calculate = new Calculate();
double expected = 5.5;
assertEquals(expected, calculate.totalaverage(1, 10));
}

@Test
public void testTotal() {
Calculate calculate = new Calculate();
int expected = 55;
assertEquals(expected, calculate.total(1, 10));
}

@Test
public void testOddtotal() {
Calculate calculate = new Calculate();
int expected = 25;
assertEquals(expected, calculate.oddtotal(1, 10));
}

@Test
public void testEventotal() {
Calculate calculate = new Calculate();
int expected = 30;
assertEquals(expected, calculate.eventotal(1, 10));
}

/*@Test
public void test(){
    Calculate calculate = new Calculate();
int x=2;
int y=3;
System.out.printf("Sum of %d and %d is %d. Average is %f.¥n",x,y,calculate.sum(x, y),calculate.average(x, y));
x=1;
y=10;
System.out.printf("Sum of %d to %d is %d. Average is %f.¥n",x,y,calculate.total(x, y),calculate.totalaverage(x, y));
System.out.printf("Sum of odd of %d to %d is %d. Sum of even is %d.¥n",x,y,calculate.oddtotal(x, y),calculate.eventotal(x, y));
}*/
}