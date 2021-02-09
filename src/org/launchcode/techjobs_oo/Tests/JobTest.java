package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;


import org.launchcode.techjobs_oo.*;

import org.launchcode.techjobs_oo.Main.*;
import static org.junit.Assert.*;

public class JobTest {
    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;

    @Before
    public void createJobObject() {
        test_job1 = new Job("Dog Petter", new Employer("Rancho Conejo"), new Location("West Fork"), new PositionType("Permanent"), new CoreCompetency("Love"));
        test_job2 = new Job("Dog Petter", new Employer("Rancho Conejo"), new Location("West Fork"), new PositionType("Permanent"), new CoreCompetency("Love"));
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("", new Employer(""), new Location("West Fork"), new PositionType("Permanent"), new CoreCompetency("Love"));

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
        assertNotNull(test_job3.getName());
        assertNotNull(test_job3.getLocation());
        assertNotNull(test_job3.getCoreCompetency());
        assertNotNull(test_job3.getPositionType());
    }

    @Test
    public void testForBlankLineBeforeJobInfo() {
        String s = test_job1.toString();
        assertTrue(s.startsWith("\n"));
    }

    @Test
    public void testForBlankLineAfterJobInfo() {
        String s = test_job1.toString();
        assertTrue(s.endsWith("\n"));
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_job1.equals(test_job2));
    }

    @Test
    public void testJobForLabelAndValue() {
        String s = test_job1.toString();
        assertTrue(s.contains("ID: " + test_job1.getId()));
        assertTrue(s.contains("Name: " + test_job1.getName()));
        assertTrue(s.contains("Employer: " + test_job1.getEmployer()));
        assertTrue(s.contains("Location: " + test_job1.getLocation()));
        assertTrue(s.contains("Position Type: " + test_job1.getPositionType()));
        assertTrue(s.contains("Core Competency: " + test_job1.getCoreCompetency()));
  }

    @Test
    public void testReturnsMessageIfNameFieldIsBlank() {
        String s = test_job4.toString();
        assertTrue(s.contains("Name: Data Not Available"));
    }

    @Test
    public void testReturnsMessageIfEmployerFieldIsBlank() {
        Job job = new Job("", new Employer(""), new Location("argaegr"), new PositionType(""), new CoreCompetency(""));
        String test_job = job.toString();
        assertTrue(test_job.contains("Employer: Data Not Available"));
    }

    @Test
    public void testReturnsMessageIfLocationFieldIsBlank() {
        Job job = new Job("", new Employer("adfgag"), new Location(""), new PositionType(""), new CoreCompetency(""));
        String test_job = job.toString();
        assertTrue(test_job.contains("Location: Data Not Available"));
    }

    @Test
    public void testReturnsMessageIfPositionTypeFieldIsBlank() {
        Job job = new Job("", new Employer("adfgadfg"), new Location(""), new PositionType(""), new CoreCompetency(""));
        String test_job = job.toString();
        assertTrue(test_job.contains("Position Type: Data Not Available"));
    }

    @Test
    public void testReturnsMessageIfCoreCompetencyFieldIsBlank() {
        Job job = new Job("", new Employer(""), new Location("fgFRG"), new PositionType(""), new CoreCompetency(""));
        String test_job = job.toString();
        assertTrue(test_job.contains("Core Competency: Data Not Available"));
    }

    @Test
    public void testReturnsMessageIfAlfFieldsOtherThanIdAreBlank() {
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String test_job = job.toString();
        assertTrue(test_job.contains("OOPS! This job does not seem to exist."));
    }
}

