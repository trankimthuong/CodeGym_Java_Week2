package strategy_design;

public abstract class StrategySearch implements Strategy{
    @Override
    public void solve() {
        while (true){
            preProcess();
            if(search()){
                break;
            }
            postProcess();
        }
    }

    abstract void preProcess();
    abstract boolean search();
    abstract void postProcess();
}

