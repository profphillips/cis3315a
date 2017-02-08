/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class ChessBoardTest {

    public ChessBoardTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of move method, of class ChessBoard.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int rowFrom = 1;
        int colFrom = 0;
        int rowTo = 3;
        int colTo = 0;
        ChessBoard instance = new ChessBoard();
        instance.move(rowFrom, colFrom, rowTo, colTo);
        assertEquals(instance.board[rowFrom][colFrom], '-');
        assertEquals(instance.board[rowTo][colTo], 'p');
    }

    /**
     * Test of reset method, of class ChessBoard.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        int rowFrom = 1;
        int colFrom = 0;
        int rowTo = 3;
        int colTo = 0;
        ChessBoard instance = new ChessBoard();
        instance.move(1, 0, 3, 0);
        instance.reset();
        assertEquals(instance.board[rowFrom][colFrom], 'p');
        assertEquals(instance.board[rowTo][colTo], '-');
    }

    /**
     * Test of toString method, of class ChessBoard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ChessBoard instance = new ChessBoard();
        String expResult = "";
        String result = instance.toString();
        assertNotEquals(expResult, result);
        
    }

}
