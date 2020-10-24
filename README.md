# Interpreter Design Pattern (Java)
**Interpreter** specifies how to evaluate sentences in a language.
![](https://github.com/shamy1st/design-pattern-interpreter/blob/main/uml.png)

### Problem:
Create an interface **Expression**. A class **TerminalExpression** is defined which acts as a main interpreter of context in question. Other classes **OrExpression**, **AndExpression** are used to create combinational expressions.

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
### Solution:
![](https://github.com/shamy1st/design-pattern-interpreter/blob/main/uml-solution.png)
