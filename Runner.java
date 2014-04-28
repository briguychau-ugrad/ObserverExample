public class Runner {
	public static void main(String[] args) {
		Observable observable = new Observable();
		Observer evenNumberObserver = new Observer() {
			public void update(int num) {
				if (num % 2 == 0) {
					System.out.printf("evenNumberObserver updated: %d.\n", num);
				}
			}
		};
		Observer oddNumberObserver = new Observer() {
			public void update(int num) {
				if (num % 2 != 0) {
					System.out.printf("oddNumberObserver updated: %d.\n", num);
				}
			}
		};
		observable.addObserver(evenNumberObserver);
		observable.addObserver(oddNumberObserver);
		observable.updateObservers(5);
		observable.updateObservers(6);
	}
}
