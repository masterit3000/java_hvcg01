/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gggg;

import demoexxxxx.SinhVien;
import demoexxxxx.TuoiException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("aaaaaaaaa");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("bbbbbbbbbbbb");
    }

    @Before
    public void setUp() {
        System.out.println("ccccccccccccc");
    }

    @After
    public void tearDown() {
        System.out.println("dddddddddddddd");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testTuoiNhoHonKhong() {

        SinhVien sv = new SinhVien();
        try {
            sv.setTuoi(-9);
        } catch (TuoiException ex) {
        }
        int tuoi = sv.getTuoi();
        assertEquals(tuoi, 0);
    }

    @Test
    public void testTuoiLonHon100() {

        SinhVien sv = new SinhVien();
        try {
            sv.setTuoi(889);
        } catch (TuoiException ex) {
        }
        int tuoi = sv.getTuoi();
        assertEquals(tuoi, 0);
    }

    @Test
    public void testTuoiBinhThuong() {

        SinhVien sv = new SinhVien();
        try {
            sv.setTuoi(45);
        } catch (TuoiException ex) {
        }
        int tuoi = sv.getTuoi();
        assertEquals(tuoi, 44);
    }
}
