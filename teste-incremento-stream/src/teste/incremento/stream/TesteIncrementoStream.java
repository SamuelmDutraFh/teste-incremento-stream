
package teste.incremento.stream;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 *
 * @author samuel
 */
public class TesteIncrementoStream {

    /**
     * @param args the command line arguments
     */
    //private static int incremento = 1;
    
    public static void main(String[] args) {
        
        AtomicInteger incremento = new AtomicInteger(1);
        
        IntStream.rangeClosed(0, 100).forEach(i ->{
        
            //System.out.println("O incremento atual é: " + incremento++);
            System.out.println("O incremento atual é: " + incremento.getAndIncrement());
            
        
        });
        
    }
    
}
