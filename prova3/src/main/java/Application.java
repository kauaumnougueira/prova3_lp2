
import frames.CadastroAdvogado;

public class Application {
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAdvogado().setVisible(true);
            }
        });
    }
}
