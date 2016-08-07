package array;

public class array {
	
	private int vet[] = new int[10];
	private int cont = 0;
	
	public void add(int k) {
		if(cont == vet.length)
			resizeUp();
		vet[cont++] = k;
	}
	
	public void remove(int k) {
		boolean loop = true;
		for(int i = 0; i < vet.length && loop; i++) {
			if(vet[i] == k) {
				for(int f = i+1, d = i; f < vet.length; f++, d++) {
					vet[d] = vet[f];
				}
				loop = false;
			}
		}
		cont--;
		
		if(cont < vet.length/2)
			resizeDown();
	}
	
	private void resizeUp() {
		int newVet[] = new int[vet.length * 2];
		int i = 0;
		for(int x : vet)
			newVet[i++] = x;
		vet = newVet;
	}
	
	private void resizeDown() {
		int newVet[] = new int[vet.length/2];
		int i = 0;
		for(int x : vet)
			newVet[i++] = x;
		vet = newVet;
	}

}
