package de.pohl.widgetforms.widgets;

import de.pohl.widgetforms.model.widgetforms.WidgetFormsConfiguration;

public interface WFWidget {

	String getLabelText();

	void setLabelText(final String text);

	WidgetFormsConfiguration getWidgetFormsConfiguration();

	void setWidgetFormsConfiguration(final WidgetFormsConfiguration configuration);

	void refresh();

	void initialize();

	void dispose();
}
