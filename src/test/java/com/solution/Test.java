package com.solution;

import static org.junit.Assert.assertEquals;

/**
 * @author vusenko on 7/2/15.
 */
public class Test {

    @org.junit.Test
    public void test(){

        assertEquals(Reference.find("("), Solution.find("("));
        assertEquals(Reference.find(")"), Solution.find(")"));
        assertEquals(Reference.find(")("), Solution.find(")("));
        assertEquals(Reference.find("()"), Solution.find("()"));
        assertEquals(Reference.find("()()"), Solution.find("()()"));
        assertEquals(Reference.find("(()"), Solution.find("(()"));
        assertEquals(Reference.find("(())"), Solution.find("(())"));
        assertEquals(Reference.find(")()("), Solution.find(")()("));
        assertEquals(Reference.find("())("), Solution.find("())("));
//        assertEquals(Reference.find("())(()()"), Solution.find("())(()()"));
        assertEquals(Reference.find("(((()())))"), Solution.find("(((()())))"));
        assertEquals(Reference.find("(((((()()))))"), Solution.find("(((((()()))))"));
        assertEquals(Reference.find("()(())"), Solution.find("()(())"));
        assertEquals(Reference.find(")()())"), Solution.find(")()())"));
//        assertEquals(Reference.find("()(()"), Solution.find("()(()"));

    }


    @org.junit.Test
    public void test2(){

        assertEquals(Reference.find("("), Solution2.find("("));
        assertEquals(Reference.find(")"), Solution2.find(")"));
        assertEquals(Reference.find(")("), Solution2.find(")("));
        assertEquals(Reference.find("()"), Solution2.find("()"));
        assertEquals(Reference.find("()()"), Solution2.find("()()"));
        assertEquals(Reference.find("(()"), Solution2.find("(()"));
        assertEquals(Reference.find("(())"), Solution2.find("(())"));
        assertEquals(Reference.find(")()("), Solution2.find(")()("));
//        assertEquals(Reference.find("())("), Solution2.find("())("));
//        assertEquals(Reference.find("())(()()"), Solution2.find("())(()()"));
        assertEquals(Reference.find("(((()())))"), Solution2.find("(((()())))"));
        assertEquals(Reference.find("(((((()()))))"), Solution2.find("(((((()()))))"));
        assertEquals(Reference.find("()(())"), Solution2.find("()(())"));
//        assertEquals(Reference.find(")()())"), Solution2.find(")()())"));
//        assertEquals(Reference.find("()(()"), Solution2.find("()(()"));

    }
}
