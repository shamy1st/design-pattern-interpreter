package com.shamy1st;

import com.shamy1st.interpreter.AndExpression;
import com.shamy1st.interpreter.Expression;
import com.shamy1st.interpreter.OrExpression;
import com.shamy1st.interpreter.TerminalExpression;

public class Main {
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Ahmed is male? " + isMale.interpret("Ahmed"));
        System.out.println("Mona is a married women? " + isMarriedWoman.interpret("Married Mona"));
    }

    //Rule: Ahmed and Amr are male
    public static Expression getMaleExpression(){
        Expression ahmed = new TerminalExpression("Ahmed");
        Expression amr = new TerminalExpression("Amr");
        return new OrExpression(ahmed, amr);
    }

    //Rule: Mona is a married women
    public static Expression getMarriedWomanExpression(){
        Expression mona = new TerminalExpression("Mona");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(mona, married);
    }
}
