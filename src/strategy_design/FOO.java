package strategy_design;

public class FOO extends StrategySolution {
    private int state = 1;
    protected void start(){
        System.out.println("Start   ");
    }

    protected void stop(){
        System.out.println("Stop");
    }

    protected boolean nextTry(){
        System.out.println("NextTry-" + state++ + "   ");
        return true;
    }

    protected boolean isSolution(){
        System.out.println("IsSolution-" + (state==3) + " ");
        return (state == 3);
    }
}
