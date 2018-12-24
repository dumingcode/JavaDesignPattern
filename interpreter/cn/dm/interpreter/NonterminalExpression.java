package cn.dm.interpreter;

public class NonterminalExpression implements AbstractExpression{
    @Override
    public void interpreter(Context context) {
        System.out.println("非终端解释器");
    }
}
