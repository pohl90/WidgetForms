package de.pohl.widgetforms.factories;

import org.eclipse.swt.widgets.Composite;

import de.pohl.widgetforms.model.widgetforms.WidgetFormsConfiguration;
import de.pohl.widgetforms.model.widgetforms.WidgetformsFactory;
import de.pohl.widgetforms.widgets.impl.swt.WFWidgetSWTImpl;
import de.pohl.widgetforms.widgets.swt.WFWidgetSWT;

public class WidgetFormsFactorySWT {

	public static WFWidgetSWT createSampleWidget(final Composite parent) {
		WFWidgetSWTImpl widget = new WFWidgetSWTImpl();
		widget.create(parent);
		widget.initialize();

		WidgetFormsConfiguration configuration = WidgetformsFactory.eINSTANCE.createWidgetFormsConfiguration();
		widget.setWidgetFormsConfiguration(configuration);

		return widget;
	}
}
