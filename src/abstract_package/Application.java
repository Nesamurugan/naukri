package abstract_package;

public class Application extends Abstract {

	@Override
	public void userData() {
		System.out.println("Storing user data");
		
	}

	@Override
	public void passwordValidation() {
		System.out.println("validating password");
		
	}

		
	public static void main(String[] args) {
		Application app = new Application();
		app.nonabstract();
		app.userData();
		app.passwordValidation();
	}

	

}
