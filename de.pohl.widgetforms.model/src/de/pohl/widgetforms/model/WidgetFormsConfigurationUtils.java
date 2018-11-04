package de.pohl.widgetforms.model;

import java.util.Objects;
import java.util.Optional;

import de.pohl.widgetforms.model.widgetforms.WidgetFormsConfiguration;
import de.pohl.widgetforms.model.widgetforms.WidgetFormsOption;
import de.pohl.widgetforms.model.widgetforms.WidgetformsFactory;

public class WidgetFormsConfigurationUtils {

	public static final String KEY_LABEL_TEXT = "label_text";

	public static final String DEFAULT_LABEL_TEXT = ">> MISSING CONFIGURATION <<";

	// TODO invocation delegate
	public static void setLabelText(final WidgetFormsConfiguration configuration, final String text) {
		Objects.requireNonNull(configuration);
		Optional<WidgetFormsOption> optionOptional = configuration.getOptions() //
				.stream() //
				.filter(option -> option.getKey().equals(KEY_LABEL_TEXT)) //
				.findFirst();
		if (!optionOptional.isPresent()) {
			WidgetFormsOption option = WidgetformsFactory.eINSTANCE.createWidgetFormsOption();
			option.setKey(KEY_LABEL_TEXT);
			option.setValue(text == null ? DEFAULT_LABEL_TEXT : text);
			configuration.getOptions().add(option);
		} else {
			optionOptional.get().setValue(text == null ? DEFAULT_LABEL_TEXT : text);
		}
	}

	// TODO invocation delegate
	public static String getLabelText(final WidgetFormsConfiguration configuration) {
		Objects.requireNonNull(configuration);
		return configuration.getOptions() //
				.stream() //
				.filter(option -> option.getKey().equals(KEY_LABEL_TEXT)) //
				.map(WidgetFormsOption::getValue) //
				.findFirst() //
				.orElse(DEFAULT_LABEL_TEXT);
	}
}
