
public class MCVCalculator {
	
	public static void main(String[] args){
		
		CalculatorView theView = new CalculatorView();
		
		CalculatorModel theModel = new CalculatorModel();
		
		CalculartorController theController = new CalculatorController(theView, theModel);
		
		theView.setVisible(true);
	}

}
