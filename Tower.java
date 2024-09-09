
/**
 * Creacion de Torres de hanoi
 * 
 * @author Juan Guayazán 
 * @version 1.0
 */
public class Tower
{
    private int disks;
    private Rectangle[] niveles;
    private static final int BASE = 200;
    private static final int ALTURA = 10;

    /**
     * Constructor for objects of class Tower
     */
    public Tower(int disks)
    {
        if (disks > 20){
            throw new IllegalArgumentException("Supera el limite");
        }
        this.disks = disks;
        niveles = new Rectangle[disks];
        for (int i = 0; i < disks; i++){
            niveles[i] = new Rectangle();
            niveles[i].changeSize(ALTURA, BASE - (i*10));
            niveles[i].changeColor("blue");
            niveles[i].moveVertical(-(ALTURA * i));
            niveles[i].moveHorizontal(BASE- (BASE - (i*10))/2);
            niveles[i].makeVisible();
        }
        moveTo(-150, 200);
    }
    /*
     * Cambio de color
     */
    public void changeColors(){
        for (int i = 0; i < disks; i++){
            niveles[i].changeColor("yellow");
        }
    }
    /*
     * Hacer visible la torre
     */
    public void makeVisible(){
        for (int i = 0; i < disks; i++){
            niveles[i].makeVisible();
        }
    }
    /*
     * Hacer invisible la torre
     */
    public void makeInvisible(){
        for (int i = 0; i < disks; i++){
            niveles[i].makeInvisible();
        }
    }
    /*
     * Cambiar de sitio
     */
    public void moveTo(int x, int y){
        for (int i = 0; i < disks; i++){
            niveles[i].moveHorizontal(x);
            niveles[i].moveVertical(y);
        }
    }
    /*
     * Quita el disco dek tope de la torre
     */
    public boolean pop(){
        if (disks > 0){
            niveles[disks - 1].makeInvisible();
            niveles[disks - 1] = null;
            disks--;
            return true;
        }
        else{
            return false;
        }
    }
    /*
     * Coloca un disco
     */
    public void push(int disk){
        for (int j = 0; j < disk; j++){
            niveles[j] = new Rectangle();
            niveles[j].changeSize(ALTURA, BASE - (j*10));
            niveles[j].changeColor("red");
            niveles[j].moveVertical(-(ALTURA * j));
            niveles[j].moveHorizontal(BASE- (BASE - (j*10))/2);
            niveles[j].makeVisible();
            disks++;
    }
    }
}
