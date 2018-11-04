package de.pohl.widgetforms.utils;

import org.eclipse.swt.widgets.Control;

public final class WidgetFormsUtilSWT {

	private WidgetFormsUtilSWT() {
		// Prevents instantiation
	}

	public static boolean isDisposed(final Control swtControl) {
		return swtControl == null || swtControl.isDisposed();
	}

	public static boolean isNotDisposed(final Control swtControl) {
		return !isDisposed(swtControl);
	}
}
