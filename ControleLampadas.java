public class ControleLampadas {

// Como o problema deixou explícito que eu só posso verificar duas vezes as três lâmpadas em suas respectivas salas,
// vou acender duas lâmpadas e deixar a terceira apagada, assim posso diferenciar o estado das três sem ultrapassar o limite de idas.

    public static void main(String[] args) {

        boolean[] interruptores = {false, false, false};

        boolean[] lampadas = {false, false, false};

        interruptores[0] = true;
        lampadas[0] = true;

        interruptores[0] = false;
        interruptores[1] = true;

        lampadas[1] = true;

        System.out.println("Lâmpada 1: " + (lampadas[0] ? "Acesa" : "Apagada") + ", Estado: " + (interruptores[0] ? "Quente" : "Fria"));
        System.out.println("Lâmpada 2: " + (lampadas[1] ? "Acesa" : "Apagada") + ", Estado: " + (interruptores[1] ? "Quente" : "Fria"));
        System.out.println("Lâmpada 3: " + (lampadas[2] ? "Acesa" : "Apagada") + ", Estado: " + (interruptores[2] ? "Quente" : "Fria"));
    }
}
