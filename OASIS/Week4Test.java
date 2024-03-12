import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        int expectedResult = 5;
        int actualResult = Week4.max2Int(5,2);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testMax2Int2(){
         int expectedResult = 6;
         int actualResult = Week4.max2Int(6,1);
         assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testMax2Int3(){
        int expectedResult = -3;
        int actualResult = Week4.max2Int(-3,-10);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMax2Int4(){
        int expectedResult = 300;
        int actualResult = Week4.max2Int(300,300);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMax2Int5(){
        int expectedResult = 23;
        int actualResult = Week4.max2Int(23,-10);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMinArray1(){
        int arr[] ={1,2,3,4,5};
        int expectedResult = 1;
        int actualResult = Week4.minArray(arr);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMinArray2(){
        int arr[] ={-100000,22,-3,4,5};
        int expectedResult = -100000;
        int actualResult = Week4.minArray(arr);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMinArray3(){
        int arr[] ={100000,2200000,300000,400000,500000};
        int expectedResult = 100000;
        int actualResult = Week4.minArray(arr);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMinArray4(){
        int arr[] ={-10,-2,-3,-4,-5};
        int expectedResult = -10;
        int actualResult = Week4.minArray(arr);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMinArray5(){
        int arr[] ={-100000,22,-3,-4000,5};
        int expectedResult = -100000;
        int actualResult = Week4.minArray(arr);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCalculateBMI1(){
        String expectedResult = "Thiếu cân";
        String actualResult = Week4.calculateBMI(35,1.5);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCalculateBMI2(){
        String expectedResult = "Thiếu cân";
        String actualResult = Week4.calculateBMI(42,1.7);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCalculateBMI3(){
        String expectedResult = "Thừa cân";
        String actualResult = Week4.calculateBMI(60,1.6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCalculateBMI4(){
        String expectedResult = "Thừa cân";
        String actualResult = Week4.calculateBMI(61,1.6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCalculateBMI5(){
        String expectedResult = "Béo phì";
        String actualResult = Week4.calculateBMI(70,1.5);
        assertEquals(expectedResult,actualResult);
    }
} 