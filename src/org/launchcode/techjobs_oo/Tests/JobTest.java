package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;


import org.launchcode.techjobs_oo.*;

import org.launchcode.techjobs_oo.Main.*;
import static org.junit.Assert.*;

public class JobTest {
    Job test_job1;
    Job test_job2;
    Job test_job3 = new Job("Product tester", new Employer ("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Before
    public void createJobObject() {
        test_job1 = new Job("Dog Petter", new Employer ("Rancho Conejo"), new Location ("West Fork"), new PositionType("Permanent"), new CoreCompetency("Love"));
        test_job2 = new Job("Dog Sitter", new Employer ("Rancho Conejo"), new Location ("West Fork"), new PositionType("Permanent"), new CoreCompetency("Love"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(test_job1.getId() + 1, test_job2.getId());
        }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());
        assertNotNull(test_job3);
        assertNotNull(test_job3.getEmployer());
    }
}

