package black.dictionary;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;

public class Form {
	private Shell shell;

	public Form(Shell shell) {
		this.shell = shell;
	}

	public void createForm() {
		Composite composite = new Composite(shell, SWT.FILL);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		composite.setLayout(gridLayout);

		GridData labelGridData = new GridData();
		labelGridData.horizontalSpan = 3;
		Label label = new Label(composite, SWT.SHADOW_IN);
		label.setText("Dictionary");
		label.setLayoutData(labelGridData);

		GridData tableGridData = new GridData();
		tableGridData.horizontalSpan = 3;
		Table table = new Table(composite, SWT.MULTI | SWT.BORDER
				| SWT.FULL_SELECTION);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(tableGridData);

		Label labelWord = new Label(composite, SWT.SHADOW_IN);
		labelWord.setText("New word");

		GridData labelWordGridData = new GridData();
		labelWordGridData.horizontalSpan = 2;
		Text textWord = new Text(composite, SWT.SINGLE);
		textWord.setLayoutData(labelWordGridData);

		Label labelTranslation = new Label(composite, SWT.SHADOW_IN);
		labelTranslation.setText("Translation");

		GridData labelTranslationGridData = new GridData();
		labelTranslationGridData.horizontalSpan = 2;
		Text textTranslation = new Text(composite, SWT.SINGLE);
		textTranslation.setLayoutData(labelTranslationGridData);

		Button button = new Button(composite, SWT.PUSH);
		button.setText("Add word");

		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
			}
		});

	}

}
