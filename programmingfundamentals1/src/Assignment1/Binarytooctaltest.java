package Assignment1;
import org.junit.*;
import static org.junit.Assert.*;
public class Binarytooctaltest

{
Binarytooctal bo=new Binarytooctal();


@Test
public void btotest()
{

assertEquals(65,bo.convertBinaryToOctal(110101));

}
	

}
