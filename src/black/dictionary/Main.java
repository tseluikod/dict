package black.dictionary;

import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();

		Shell shell = new Shell(display);

		shell.setSize(450, 300);
		shell.setLayout(new RowLayout());
		Form form = new Form(shell);
		form.createForm();
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();

	}

}
