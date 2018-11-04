package de.pohl.widgetforms.widgets.impl;

import de.pohl.widgetforms.model.WidgetFormsConfigurationUtils;
import de.pohl.widgetforms.model.widgetforms.WidgetFormsConfiguration;
import de.pohl.widgetforms.widgets.WFWidget;

public class WFWidgetImpl implements WFWidget {

	private WidgetFormsConfiguration configuration;

	@Override
	public String getLabelText() {
		return WidgetFormsConfigurationUtils.getLabelText(getWidgetFormsConfiguration());
	}

	@Override
	public void setLabelText(String text) {
		WidgetFormsConfigurationUtils.setLabelText(getWidgetFormsConfiguration(), text);
	}

	@Override
	public WidgetFormsConfiguration getWidgetFormsConfiguration() {
		return configuration;
	}

	@Override
	public void setWidgetFormsConfiguration(WidgetFormsConfiguration configuration) {
		this.configuration = configuration;
	}

	@Override
	public void refresh() {

	}

	@Override
	public void initialize() {

	}

	@Override
	public void dispose() {

	}

}
