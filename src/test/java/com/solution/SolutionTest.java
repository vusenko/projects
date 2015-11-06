package com.solution;

import static org.junit.Assert.assertEquals;

/**
 * @author vusenko on 7/2/15.
 */
public class SolutionTest {

    @org.junit.Test
    public void testBrackets(){

        assertEquals(Reference.find("("), Solution.find("("));
        assertEquals(Reference.find(")"), Solution.find(")"));
        assertEquals(Reference.find(")("), Solution.find(")("));
        assertEquals(Reference.find("()"), Solution.find("()"));
        assertEquals(Reference.find("()()"), Solution.find("()()"));
        assertEquals(Reference.find("(()"), Solution.find("(()"));
        assertEquals(Reference.find("(())"), Solution.find("(())"));
        assertEquals(Reference.find(")()("), Solution.find(")()("));
        assertEquals(Reference.find("())("), Solution.find("())("));
        assertEquals(Reference.find("())(()()"), Solution.find("())(()()"));
        assertEquals(Reference.find("(((()())))"), Solution.find("(((()())))"));
        assertEquals(Reference.find("(((((()()))))"), Solution.find("(((((()()))))"));
        assertEquals(Reference.find("()(())"), Solution.find("()(())"));
        assertEquals(Reference.find(")()())"), Solution.find(")()())"));
        assertEquals(Reference.find("()(()"), Solution.find("()(()"));
    }

}
