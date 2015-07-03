package com.solution;


public class App {

    public static void main(String[] args) {

        App app = new App();
        app.getLongestValidParentheses(")()");
        app.getLongestValidParentheses(")(()");
        app.getLongestValidParentheses(")(()()");
        app.getLongestValidParentheses(")(()()");
        app.getLongestValidParentheses("(())");




    }


    private int getLongestValidParentheses(String value) {
        int count = 0;

        if (value.trim().isEmpty()) {
            return count;
        }

        int rememberedIndex = 0;

        char openParenthes = '(';
        char closeParenthes = ')';
        char[] chars = value.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (openParenthes == chars[i]) {

                for (int j = rememberedIndex+1; j < chars.length; j++) {
                    if (closeParenthes == chars[j]) {
                        rememberedIndex = j;
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
