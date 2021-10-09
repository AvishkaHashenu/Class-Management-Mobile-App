package com.example.teacherapp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Date;
import javax.annotation.Nullable;
public class Testing {
    private dateConversion eventRecyclerAdapter;
    private AverageCal averagecal;
    private GPAcal gpAcal;
    @BeforeEach
    public void setUp(){
        eventRecyclerAdapter = new dateConversion();
        //averagecal = new AverageCal();
        //attendance = new SummaryCalculation();
        //gpAcal = new GPAcal();
    }

    //IT20186142
    @Test
    public void testConvertStringToDate(){
        Date date = eventRecyclerAdapter.ConvertStringToDate("2021-10-26");
        String Result = date.toString();
        assertEquals("Tue Oct 26 00:00:00 IST 2021",Result);
    }



    // IT20012342
    @Test
    public  void testTotal() {
        int result = averagecal.getTotal(70,80,90);
        assertEquals(240, result);
    }

    @Test
    public  void testAverage() {
        double result = (70+80+90)/3.0;
        assertEquals(80.0, result);
    }

    //IT20188054
    /*@Test
    public void summaryCalculation_isCorrect() {

        Object ob = 100L;  //Value retrieve  from the database  {Use object datatype since retrieve value from DB must be object}
        long result = attendance.calculateSummary(ob,20);
        assertEquals(120, result);
    }*/

    //IT20211332
    @Test
    public void checkCounter() throws Exception {
        //assertEquals(4.0, GPAcal.getCounter(3,4.0));
        double result = gpAcal.getCounter(3.0, 4.0);
        assertEquals(12.0, result);
    }
}