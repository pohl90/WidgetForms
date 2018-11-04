package de.pohl.widgetforms.e4.parts;

import javax.inject.Inject;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import de.pohl.widgetforms.WidgetForms;
import de.pohl.widgetforms.factories.WidgetFormsFactorySWT;
import de.pohl.widgetforms.widgets.swt.WFWidgetSWT;

public class WidgetFormsPart {

	@Inject
	public WidgetFormsPart(final Composite parent) {

		final Composite header = new Composite(parent, SWT.BORDER);
		GridDataFactory.swtDefaults() //
				.span(WidgetForms.COLUMN_SPAN, 1) //
				.grab(true, false) //
				.align(SWT.FILL, SWT.TOP) //
				.applyTo(header);
		GridLayoutFactory.swtDefaults() //
				.numColumns(2) //
				.applyTo(header);
		final Text text = new Text(header, SWT.BORDER);
		text.setText("New Label");
		GridDataFactory.swtDefaults() //
				.grab(true, false) //
				.align(SWT.FILL, SWT.TOP) //
				.applyTo(text);
		final Button button = new Button(header, SWT.PUSH);
		button.setText("+");
		button.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
			createWidget(parent, text.getText());
			parent.layout(true, true);
		}));

		createWidget(parent, "Label 01");
		createWidget(parent, "Label 02");
		createWidget(parent, "Label 03");
		createWidget(parent, "Label 04");
		createWidget(parent, "Label 05");
		createWidget(parent, "Label 06");
		createWidget(parent, "Label 07");
		WidgetFormsFactorySWT.createSampleWidget(parent);
	}

	private void createWidget(final Composite parent, final String text) {
		WFWidgetSWT widget = WidgetFormsFactorySWT.createSampleWidget(parent);
		widget.setLabelText(text);
	}
}
