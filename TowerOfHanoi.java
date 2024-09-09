
/**
 * Write a description of class TowerOfHanoi here.
 * 
 * Juan Guayazan 
 * 1.0 2024
 */
import javax.swing.JOptionPane;
public class TowerOfHanoi
{
    // instance variables - replace the example below with your own
    private int disksA = 20;
    private int disksB = 0;
    private int disksC = 0;
    private Tower espacioA;
    private Tower espacioB;
    private Tower espacioC;
    private Rectangle tablero;
    private Rectangle posteA;
    private Rectangle posteB;
    private Rectangle posteC;

    /**
     * Constructor for objects of class TowerOfHanoi
     */
    public TowerOfHanoi()
    {
        tablero = new Rectangle();
        tablero.makeVisible();
        tablero.changeSize(20, 660);
        tablero.moveVertical(210);
        tablero.moveHorizontal(-65);
        posteA = new Rectangle();
        posteA.makeVisible();
        posteA.changeSize(200, 5);
        posteA.moveVertical(0);
        posteA.moveHorizontal(47);
        posteB = new Rectangle();
        posteA.makeVisible();
        posteA.changeSize(200, 5);
        posteA.moveVertical(0);
        posteA.moveHorizontal(262);
        posteC = new Rectangle();
        posteA.makeVisible();
        posteA.changeSize(200, 5);
        posteA.moveVertical(0);
        posteA.moveHorizontal(477);
        espacioA = new Tower(20);
        espacioA = new Tower(0);
        espacioA = new Tower(0);
    }
    /**
     * Movimiento de disco del espacio 1 a 2
     */
    public void mover1A2(){
        if (disksA == 0){
            JOptionPane.showMessageDialog(null, "No hay discos");
        }
        else{
            espacioA.pop();
            
            disksB ++;
            disksA --;    
        }
        
    }
    /**
     * Movimiento de disco del espacio 1 a 3
     */
    public void mover1A3(){
        if (disksA == 0){
            JOptionPane.showMessageDialog(null, "No hay discos");
        }
        else{
            espacioA.pop();
            
            disksC ++;
            disksA --;    
        }
        
    }
    /**
     * Movimiento de disco del espacio 2 a 1
     */
    public void mover2A1(){
        if (disksA == 0){
            JOptionPane.showMessageDialog(null, "No hay discos");
        }
        else{
            espacioB.pop();
            
            disksA ++;
            disksB --;    
        }
        
    }
    /**
     * Movimiento de disco del espacio 2 a 3
     */
    public void mover2A3(){
        if (disksA == 0){
            JOptionPane.showMessageDialog(null, "No hay discos");
        }
        else{
            espacioB.pop();
            
            disksC ++;
            disksB --;    
        }
        
    }
    /**
     * Movimiento de disco del espacio 3 a 1
     */
    public void mover3A1(){
        if (disksA == 0){
            JOptionPane.showMessageDialog(null, "No hay discos");
        }
        else{
            espacioC.pop();
            
            disksA ++;
            disksC --;    
        }
        
    }
    /**
     * Movimiento de disco del espacio 3 a 2
     */
    public void mover3A2(){
        if (disksA == 0){
            JOptionPane.showMessageDialog(null, "No hay discos");
        }
        else{
            espacioC.pop();
            
            disksB ++;
            disksC --;   
        }
        
    }
}
