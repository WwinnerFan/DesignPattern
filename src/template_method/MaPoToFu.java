package template_method;

public class MaPoToFu extends AbstractFood{


    @Override
    protected void buy() {
        System.out.println("买豆腐、辣椒");
    }

    @Override
    protected void wash() {
        System.out.println("洗辣椒");
    }

    @Override
    protected void cut() {
        System.out.println("切辣椒、切豆腐");
    }

    @Override
    protected void cooking() {
        System.out.println("下锅翻炒");
    }
}
