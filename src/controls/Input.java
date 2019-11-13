package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Input extends BaseControl {

	public Input(By by) {
		super(by);
	}

	public String text() {
		try {
			return this.Element().getText();
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	public void write(String text) {
		this.Element().clear();
		this.Element().sendKeys(text);
	}

}
