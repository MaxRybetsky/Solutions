package codewars.codewarsUser;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    private User user;

    @Before
    public void createUser() {
        user = new User();
    }

    @Test
    public void whenSolveOneHighLevelTask() {
        user.incProgress(-7);
        assertEquals(10, user.progress);
        assertEquals(-8, user.rank);
    }

    @Test
    public void whenSolveTwoHighLevelTask() {
        user.progress = 10;
        user.incProgress(-6);
        assertEquals(50, user.progress);
        assertEquals(-8, user.rank);
    }

    @Test
    public void whenMoveFromMinusOneToOneRank() {
        user.progress = 90;
        user.rank = -1;
        user.incProgress(1);
        assertEquals(0, user.progress);
        assertEquals(1, user.rank);
    }

    @Test
    public void whenSolvedTheSameRankTask() {
        user.incProgress(-8);
        assertEquals(3, user.progress);
        assertEquals(-8, user.rank);
    }

    @Test
    public void whenSolveOneLowLevelTaskAndCurrentRankIsOne() {
        user.rank = 1;
        user.incProgress(-1);
        assertEquals(1, user.progress);
        assertEquals(1, user.rank);
    }

    @Test
    public void whenSolveOneLowLevelTaskAndCurrentRankIsNotOne() {
        user.rank = 3;
        user.incProgress(2);
        assertEquals(1, user.progress);
        assertEquals(3, user.rank);
    }

    @Test
    public void whenSolveTwoLowLevelTaskAndCurrentRankIsOne() {
        user.rank = 1;
        user.incProgress(-3);
        assertEquals(0, user.progress);
        assertEquals(1, user.rank);
    }

    @Test
    public void whenSolveTwoLowLevelTaskAndCurrentRankIsNotOne() {
        user.rank = 3;
        user.incProgress(1);
        assertEquals(0, user.progress);
        assertEquals(3, user.rank);
    }

    @Test
    public void whenMinusEightRankSolvedMinusSixRankTask() {
        user.incProgress(-6);
        assertEquals(40, user.progress);
        assertEquals(-8, user.rank);
    }

    @Test
    public void whenMinusEightRankSolvedMinusFiveRankTask() {
        user.incProgress(-5);
        assertEquals(90, user.progress);
        assertEquals(-8, user.rank);
    }

    @Test
    public void whenMinusEightRankSolvedMinusFourRankTask() {
        user.incProgress(-4);
        assertEquals(60, user.progress);
        assertEquals(-7, user.rank);
    }

    @Test
    public void whenHaveTopLevelAndSolveTasks() {
        user.rank = 7;
        user.progress = 98;
        user.incProgress(7);
        assertEquals(0, user.progress);
        assertEquals(8, user.rank);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenTryingSolveOutOfRankBoundsTaskThenException() {
        user.incProgress(10);
    }
}