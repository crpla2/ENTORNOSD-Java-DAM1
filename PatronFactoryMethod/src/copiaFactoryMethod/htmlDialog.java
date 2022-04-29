package copiaFactoryMethod;

public class htmlDialog extends Dialog {
	   @Override
	    public Button createButton() {
	        return new htmlButton();
	    }
}
