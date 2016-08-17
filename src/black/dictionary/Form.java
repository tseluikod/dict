package black.dictionary;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;

public class Form {
	public static void main (String[] args) {
		Display display = new Display();
		
		Shell shell = new Shell(display);
		shell.setSize(450, 300);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;

		shell.setLayout(gridLayout);
		GridData labelGridData = new GridData();
		labelGridData.horizontalSpan = 3;
		Label label = new Label(shell, SWT.SHADOW_IN);
		label.setText("Dictionary");
		label.setLayoutData(labelGridData);
		
		GridData tableGridData = new GridData();
		tableGridData.horizontalSpan = 3;
		Table table = new Table(shell, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
        table.setLinesVisible(true);
        table.setHeaderVisible(true);
        table.setLayoutData(tableGridData);
        
        Label labelWord = new Label(shell, SWT.SHADOW_IN);
        labelWord.setText("New word");
        
        GridData labelWordGridData = new GridData();
        labelWordGridData.horizontalSpan = 2;
        Text textWord = new Text(shell, SWT.SINGLE);
        textWord.setLayoutData(labelWordGridData);
        
        Label labelTranslation = new Label(shell, SWT.SHADOW_IN);
        labelTranslation.setText("Translation");
        
        GridData labelTranslationGridData = new GridData();
        labelTranslationGridData.horizontalSpan = 2;
        Text textTranslation = new Text(shell, SWT.SINGLE);
        textTranslation.setLayoutData(labelTranslationGridData);
        
		Button button = new Button(shell, SWT.PUSH);
		button.setText("Add word");
		     
        
        
        button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
			}
		});
		shell.open();
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
		
		
		
	}
}
