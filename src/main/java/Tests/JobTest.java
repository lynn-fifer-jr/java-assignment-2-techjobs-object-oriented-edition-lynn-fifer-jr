package Tests;

import org.junit.Test;
import org.launchcode.techjobs.oo.*;
import static org.junit.Assert.*;

public class JobTest {

    Job job1 = new Job();
    Job job2 = new Job();

    String dataNF = "Data not found";

    Job testJob = new Job("Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

    Job testJob2 = new Job("test job",
            new Employer(""),
            new Location(""),
            new PositionType(""),
            new CoreCompetency(""));

    @Test
    public void testSettingJobId(){
        assertEquals(job2.getId(), (job1.getId() + 1));
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){


//        Constructor should assign values
        assertEquals(testJob.getName(), "Product tester");
        assertEquals(testJob.getEmployer().getValue(), "ACME");
        assertEquals(testJob.getLocation().getValue(), "Desert");
        assertEquals(testJob.getPositionType().getValue(), "Quality control");
        assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
//        Constructor should assign classes
        assertTrue(testJob.getName().getClass() == String.class);
        assertTrue(testJob.getEmployer().getClass() == Employer.class);
        assertTrue(testJob.getLocation().getClass() == Location.class);
        assertTrue(testJob.getPositionType().getClass() == PositionType.class);
        assertTrue(testJob.getCoreCompetency().getClass() == CoreCompetency.class);
    }

    @Test
    public void testJobsForEquality(){
        Job newTestJob1 = new Job("Best one",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job newTestJob2 = new Job("Best one",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertFalse(newTestJob1.getId() == newTestJob2.getId());

    }

    @Test
    public void testToString(){

//        toString should return string with a blank line before and after job information
        assertTrue(testJob.toString().startsWith("\n") & testJob.toString().endsWith("\n"));

    }

    @Test
    public void testToStringLabel(){


//        returned string should contain label and data for each field
        assertTrue(testJob.toString().contains("name: " + testJob.getName()));
        assertTrue(testJob.toString().contains("employer: " + testJob.getEmployer()));
        assertTrue(testJob.toString().contains("location: " + testJob.getLocation()));
        assertTrue(testJob.toString().contains("positionType: " + testJob.getPositionType()));
        assertTrue(testJob.toString().contains("coreCompetency: " + testJob.getCoreCompetency()));

    }

    @Test
    public void testFieldIsEmpty(){



    }

}
