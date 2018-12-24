package cn.dm.interpreter;

import java.util.ArrayList;
import java.util.List;

public class TerminalMain {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<AbstractExpression>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        list.stream().forEach((element) -> {
            element.interpreter(context);
        });
    }
}
