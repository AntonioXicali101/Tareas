
public class myQueue {
	int tail;
	int max;
	public int[] arreglo;
	
	public myQueue (int queueSize) {
		this.arreglo = new int[queueSize];
		this.max = this.arreglo.length;
		this.tail = 0;		
	} 

	public void añadir (int dato) { 
		if(tail == max) {
			System.out.println("Queue is full");
		} else {
			arreglo[tail] = dato;
			tail++;
		}
	}
	public void eliminar () {
		if(tail == 0) {
			System.out.println("#");
		}else {
			for(int i = 0; i < arreglo.length-1; i++) {
				arreglo[i] = arreglo[(i+1)];
			}
		}
	}
}