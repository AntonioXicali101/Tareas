
public class stackyqueue {

	public static void main(String[] args) {
		
		stackyqueue b = new stackyqueue();
	
	System.out.println(b.esPalindromo("Anita lava la tina"));

}
	public void invertirCadena(String myString) {
		String[] words = myString.split("");
		myStack temp = new myStack();
		int count = 0;
		for(int i = words.length-1; i >= 0; i--) {
			temp.push(myString.charAt(i));
			System.out.print(temp.stack[count]); 
			count++;
		}
		
		
	}
	public boolean esPalindromo(String myString) {
		String minuscula = myString.toLowerCase();
		String junto = minuscula.replace(" ", "");
		String[] words = myString.split("");
		myStack temp = new myStack();
		for(int i = words.length-1; i >= 0; i--) {
			temp.push(myString.charAt(i));
		}
		String invertir = String.valueOf(temp.stack);
		String minuscula1 = invertir.toLowerCase();
		String junto1 = minuscula1.replace(" ", "");
		Boolean resultado = junto1.equals(junto);
		return resultado;   
	}
}