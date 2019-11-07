/**
 * Created by hp on 9/11/2019.
 */
public class HelloWorld {
    private int value=10;
    static MyHorse arab;

    public static void main(String[] args){
        arab = (new HelloWorld()).new MyHorse();
        arab.dailyCost();
    }

    void dailyCost(){
        arab.costOffeed();
        arab.print();
    }

    class MyHorse extends HelloWorld{
        private int n =3;
        public void costOffeed(){
            n = value;
        }

        public void print(){
            System.out.println(n);
        }
    }

}
