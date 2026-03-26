import java.awt.Dimension;
import java.awt.Toolkit;


public class ResolucaoDeTela {
    public static void main(String[] args) {
    Toolkit resolucao = Toolkit.getDefaultToolkit();
    Dimension sistema = resolucao.getScreenSize();
    System.out.println("Resolução da sua tela :");
    System.out.println(sistema.width +  "x" + sistema.height);

    }

    }

