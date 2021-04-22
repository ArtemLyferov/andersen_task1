package by.andersen.intensive4;

import org.junit.*;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {

    private static List<Integer> list;

    @BeforeClass
    public static void initList(){
        list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @AfterClass
    public static void clearList(){
        list = null;
    }

    @Test
    public void addTest(){
        list.add(12);
        int expected = 4;
        int actual = list.size();
        assertEquals(expected,actual);
    }

    @Test
    public void getTest(){
        int expected = 1;
        int actual = list.get(0);
        assertEquals(expected,actual);
    }

    @Test
    public void setTest(){
        int index = 0;
        int element = 10;
        int expected = list.get(index);
        int actual = list.set(index,element);
        assertEquals(expected,actual);
    }

    @Test
    public void removeTest(){
        list.remove(2);
        int expected = 3;
        int actual = list.size();
    }




}
