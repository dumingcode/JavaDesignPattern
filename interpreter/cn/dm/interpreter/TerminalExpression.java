package cn.dm.interpreter;

public class TerminalExpression implements AbstractExpression{
    @Override
    public void interpreter(Context context) {
        System.out.println("终端解释器");
    }
}
