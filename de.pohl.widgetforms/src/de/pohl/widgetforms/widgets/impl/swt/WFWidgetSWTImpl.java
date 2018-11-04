package de.pohl.widgetforms.widgets.impl.swt;

import static de.pohl.widgetforms.utils.WidgetFormsUtilSWT.isNotDisposed;
import static org.eclipse.swt.events.SelectionListener.widgetSelectedAdapter;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.pohl.widgetforms.WidgetForms;
import de.pohl.widgetforms.model.WidgetFormsConfigurationUtils;
import de.pohl.widgetforms.model.widgetforms.WidgetFormsConfiguration;
import de.pohl.widgetforms.widgets.impl.WFWidgetImpl;
import de.pohl.widgetforms.widgets.swt.WFWidgetSWT;

public class WFWidgetSWTImpl extends WFWidgetImpl implements WFWidgetSWT {

	private Label label;
	private Label statusLabel;
	private Text control;
	private Button removeButton;

	@Override
	public void create(Composite parent) {
		GridLayoutFactory.swtDefaults() //
				.numColumns(WidgetForms.COLUMN_SPAN) //
				.applyTo(parent);

		label = new Label(parent, SWT.NONE);
		label.setText("Label");
		GridDataFactory.swtDefaults() //
				.span(2, 1) //
				.align(SWT.LEFT, SWT.TOP) //
				.applyTo(label);

		statusLabel = new Label(parent, SWT.NONE);
		statusLabel.setText("StatusArea");
		GridDataFactory.swtDefaults() //
				.align(SWT.END, SWT.TOP) //
				.applyTo(statusLabel);

		control = new Text(parent, SWT.BORDER);
		control.setText("Control");
		GridDataFactory.swtDefaults() //
				.span(WidgetForms.COLUMN_SPAN - 4, 1) //
				.grab(true, false) //
				.align(SWT.FILL, SWT.TOP) //
				.applyTo(control);

		removeButton = new Button(parent, SWT.PUSH);
		removeButton.setText("Remove");
		removeButton.addSelectionListener(widgetSelectedAdapter(e -> {
			e.display.asyncExec(() -> {
				dispose();
				if (isNotDisposed(parent)) {
					parent.layout(true, true);
				}
			});
		}));
		updateConfiguration();
	}

	@Override
	public void dispose() {
		if (isNotDisposed(label)) {
			label.dispose();
			label = null;
		}
		if (isNotDisposed(statusLabel)) {
			statusLabel.dispose();
			statusLabel = null;
		}
		if (isNotDisposed(control)) {
			control.dispose();
			control = null;
		}
		if (isNotDisposed(removeButton)) {
			removeButton.dispose();
			removeButton = null;
		}
	}

	@Override
	public void setLabelText(String text) {
		super.setLabelText(text);
		updateLabelText();
	}

	@Override
	public void setWidgetFormsConfiguration(WidgetFormsConfiguration configuration) {
		super.setWidgetFormsConfiguration(configuration);
		updateConfiguration();
	}

	private void updateConfiguration() {
		updateLabelText();
	}

	protected void updateLabelText() {
		WidgetFormsConfiguration configuration = getWidgetFormsConfiguration();
		if (configuration == null) {
			return;
		}
		if (isNotDisposed(label)) {
			label.setText(WidgetFormsConfigurationUtils.getLabelText(configuration));
		}
	}
}
